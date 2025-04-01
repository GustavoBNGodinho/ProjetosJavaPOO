public class Trapezio extends Quadrilatero {


    public Trapezio(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(p1, p2, p3, p4);
    }

    static boolean existe(Ponto p1,Ponto p2,Ponto p3,Ponto p4) {
        SegmentoReta segmentoReta1 = new SegmentoReta(p1, p2);
        SegmentoReta segmentoReta2 = new SegmentoReta(p2, p3);
        SegmentoReta segmentoReta3 = new SegmentoReta(p3, p4);
        SegmentoReta segmentoReta4 = new SegmentoReta(p4, p1);

        double m1 = segmentoReta1.coeficienteAngular();
        double m2 = segmentoReta1.coeficienteAngular();
        double m3 = segmentoReta1.coeficienteAngular();
        double m4 = segmentoReta1.coeficienteAngular();

        if ((m1 == m3 && m2 != m4) || (m1 != m3 && m2 == m4)) {
            return true;
        } else {
            return false;
        }

    }

   private SegmentoReta[] witchsParalel() {
        boolean[] paralel = new boolean[2];
        int control = 0;
        paralel[0] = getSegmentos()[0].paralelo(getSegmentos()[2]);
        paralel[1] = getSegmentos()[1].paralelo(getSegmentos()[3]);
        for(int i = 0; i < paralel.length; i++) {
            if (paralel[i]) {
                control = i;
            }
        }
        return new SegmentoReta[] {getSegmentos()[control], getSegmentos()[control + 2]};
    }
    SegmentoReta baseMaior() {
        if (getSegmentos()[0].comprimento() > getSegmentos()[2].comprimento()){
            return getSegmentos()[0];
        } else {
            return getSegmentos()[2];
        }
    }

    SegmentoReta baseMenor() {
        SegmentoReta segmentoReta;
        double segmentoReta1Comprimento = witchsParalel()[0].comprimento();
        double segmentoReta2Comprimento = witchsParalel()[1].comprimento();

        if (segmentoReta2Comprimento < segmentoReta1Comprimento) {
        segmentoReta = witchsParalel()[1];
        } else {
        segmentoReta = witchsParalel()[0];
        }
        return segmentoReta;
    }

    @Override
    double largura() {
        double largura = 0;
        for (int i = 0; i < witchsParalel().length; i++) {
            double segmentoReta1Comprimento = witchsParalel()[0].comprimento();
            double segmentoReta2Comprimento = witchsParalel()[1].comprimento();

            if (segmentoReta2Comprimento < segmentoReta1Comprimento) {
                largura = segmentoReta2Comprimento;
            } else {
                largura = segmentoReta1Comprimento;
            }
        }
        return largura;
    }

    @Override
    double altura() {
        return getP2().getCoordY() - getP3().getCoordY();
    }

    @Override
    double area() {
        return ((baseMaior().comprimento() + baseMenor().comprimento()) * altura())/2;
    }

    @Override
    double perimetro() {
        double perimetro = 0;
        for (int i = 0; i < getSegmentos().length; i++) {
            perimetro += getSegmentos()[i].comprimento();
        }
        return perimetro;
    }
}

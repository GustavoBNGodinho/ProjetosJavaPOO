public class Retangulo extends Paralelogramo {

    public Retangulo(Ponto p1, Ponto p2, Ponto p3, Ponto p4){
        super(p1, p2, p3, p4);
    }

    @Override
    public double largura() {
        return getSegmentos()[2].comprimento();
    }

    @Override
    public double area() {
        return largura() * altura();
    }

    @Override
    public double altura() {
        return getSegmentos()[1].comprimento();
    }

    public boolean quadrado() {
        SegmentoReta s1 = getSegmentos()[0];
        SegmentoReta s2 = getSegmentos()[1];
        SegmentoReta s3 = getSegmentos()[2];
        SegmentoReta s4 = getSegmentos()[3];
        if (s1.comprimento() == s2.comprimento()
        && s2.comprimento() == s3.comprimento()
        && s3.comprimento() == s4.comprimento()
        && s4.comprimento() == s1.comprimento()
        && s1.paralelo(s3)
        && s2.paralelo(s4)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        if (p1.getCoordY() == p2.getCoordY()
                && p2.getCoordX() == p3.getCoordX()
                && p3.getCoordY() == p4.getCoordY()
                && p4.getCoordX() == p1.getCoordX()) {
            return true;
        } else {
            return false;
        }
    }
}

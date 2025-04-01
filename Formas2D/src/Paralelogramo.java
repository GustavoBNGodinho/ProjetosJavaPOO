public class Paralelogramo extends Trapezio{

    Paralelogramo(Ponto p1,
                  Ponto p2,
                  Ponto p3,
                  Ponto p4) {
        super (p1, p2, p3, p4);
    }



    @Override
    double largura() {
        return Math.sqrt(Math.pow(area(), 2) - Math.pow(getSegmentos()[2].comprimento(),2));
    }

    @Override
    double area() {
        Triangulo t1 = new Triangulo(getPontos()[0], getPontos()[1], getPontos()[2]);
        Triangulo t2 = new Triangulo(getPontos()[2], getPontos()[3], getPontos()[3]);
        return t1.area() + t2.area();
    }

    @Override
    double altura() {
        return area()/getSegmentos()[2].comprimento();
    }

    static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        SegmentoReta s1 = new SegmentoReta(p1, p2);
        SegmentoReta s2 = new SegmentoReta(p2, p3);
        SegmentoReta s3 = new SegmentoReta(p3, p4);
        SegmentoReta s4 = new SegmentoReta(p4, p1);

        if (s1.paralelo(s3) && s2.paralelo(s4)) {
            return true;
        } else {
            return false;
        }
    }
}

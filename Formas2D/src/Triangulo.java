public class Triangulo extends Poligono {

    public Triangulo (Ponto p1, Ponto p2, Ponto p3) {
        super(
                new Ponto[] {p1, p2, p3},
                new SegmentoReta[] {new SegmentoReta(p1, p2),
                new SegmentoReta(p2, p3),
                new SegmentoReta(p3, p1)});
    }


    @Override
    double largura() {
        return getSegmentos()[1].comprimento();
    }

    @Override
    double area() {
        double s = perimetro() / 2;
        return Math.sqrt(s
                * (s - getSegmentos()[0].comprimento())
                * (s - getSegmentos()[1].comprimento())
                * (s - getSegmentos()[2].comprimento())
        );
    }

    @Override
    double altura() {
        return (2 * area()) / largura();
    }

    @Override
    double perimetro() {
        return getSegmentos()[0].comprimento()
                + getSegmentos()[1].comprimento()
                + getSegmentos()[2].comprimento();
    }
}

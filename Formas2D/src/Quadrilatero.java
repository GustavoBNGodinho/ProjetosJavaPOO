public abstract class Quadrilatero extends Poligono {

    protected Quadrilatero(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(
                new Ponto[] {p1, p2, p3, p4},
                new SegmentoReta[]{
                        new SegmentoReta(p1, p2),
                        new SegmentoReta(p2, p3),
                        new SegmentoReta(p3, p4),
                        new SegmentoReta(p4, p1),
                });
    }

    public Ponto getP1() {
        return getPontos()[0];
    }
    public Ponto getP2() {
        return getPontos()[1];
    }
    public Ponto getP3() {
        return getPontos()[2];
    }
    public Ponto getP4() {
        return getPontos()[3];
    }

    double perimetro(){
        return getSegmentos()[0].comprimento()
                + getSegmentos()[1].comprimento()
                + getSegmentos()[2].comprimento()
                + getSegmentos()[3].comprimento();
    }
}

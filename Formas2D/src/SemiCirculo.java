public class SemiCirculo extends FormaGeometrica{
    private final Ponto centro;
    private final double raio;


    public SemiCirculo(Ponto centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }

    public Ponto getCentro() {
        return centro;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    double largura() {
        return getRaio() * 2;
    }

    @Override
    double area() {
        return (Math.PI * Math.pow(getRaio(), 2)) / 2;
    }

    @Override
    double altura() {
        return getRaio();
    }

    @Override
    double perimetro() {
        return (2 * Math.PI * getRaio()) / 2;
    }
}

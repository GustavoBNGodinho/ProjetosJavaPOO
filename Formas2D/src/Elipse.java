public class Elipse extends FormaGeometrica {
    Ponto centro;
    double semiEixoA;
    double semiEixoB;

    public Elipse(Ponto centro, double semiEixoA, double semiEixoB) {
        if (semiEixoA < 0 || semiEixoB < 0) {
            throw new IllegalArgumentException("O raio não pode ser negativo");
        }
        this.centro = centro;
        if (semiEixoA >= semiEixoB) {
            setSemiEixoA(semiEixoA);
            setSemiEixoB(semiEixoB);
        } else {
            setSemiEixoA(semiEixoB);
            setSemiEixoB(semiEixoA);
        }
    }

    public Ponto getCentro() {
        return centro;
    }

    public double getSemiEixoA() {
        return semiEixoA;
    }

    public double getSemiEixoB() {
        return semiEixoB;
    }

    private void setSemiEixoA(double semiEixoA) {
        this.semiEixoA = semiEixoA;
    }

    private void setSemiEixoB(double semiEixoB) {
        this.semiEixoB = semiEixoB;
    }

    double getSemiEixoMenor() {
        return getSemiEixoB();
    }

    double getSemiEixoMaior() {
        return getSemiEixoB();
    }

    double circunferencia() {
        return 2  * Math.PI * Math.sqrt((Math.pow(getSemiEixoA(),2) + Math.pow(getSemiEixoB(), 2))/2);
    }

    @Override
    double largura() {
        return getSemiEixoA() * 2;
    }

    @Override
    double area() {
        return getSemiEixoB() * getSemiEixoA() * Math.PI;
    }

    @Override
    double altura() {
        return getSemiEixoB() * 2;
    }

    @Override
    double perimetro() {
        return circunferencia();
    }
}

public class Circulo extends Elipse{

    public Circulo(Ponto centro, double raio) {
        //tá certo isso??
        super(centro, raio, raio);
        if (raio < 0) {
            throw new IllegalArgumentException("O raio não pode ser negativo");
        }
    }

    public double getRaio() {
        return semiEixoA;
    }
    @Override
    double circunferencia() {
        return 2 * Math.PI * getRaio();
    }

    @Override
    double area() {
        return Math.PI * Math.pow(getRaio(), 2);
    }
}

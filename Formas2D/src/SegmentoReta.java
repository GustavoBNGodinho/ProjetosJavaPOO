public class SegmentoReta extends ObjetoGeometrico{
   final Ponto p1;
   final Ponto p2;

    /**
     * Construtor de SegmentoReta.
     * @param p1 Ponto 1
     * @param p2 Ponto 2
     */
    public SegmentoReta(Ponto p1, Ponto p2) {
        //todo: copia profunda!
        this.p1 = p1;
        this.p2 = p2;
    }

    /**
     * Retorna o Ponto 2
     * @return p2
     */
    public Ponto getP2() {
        return p2;
    }

    /**
     * Retrona o Ponto 1
     * @return p1
     */
    public Ponto getP1() {
        return p1;
    }


    /**
     * Retorna o comprimento da resta cáculado com formula
     * @return Comprimento da reta.
     */
    double comprimento() {
        return (Math.sqrt(Math.pow(getP1().getCoordX() - getP2().getCoordX(), 2)
                + Math.pow(getP1().getCoordY() - getP2().getCoordY(), 2)));
    }

    /**
     * Retorna o Coeficiente angular da reta
     * @return Coeficiente angular
     */
    double coeficienteAngular() {
        if (getP1().getCoordX() == getP2().getCoordX()) {
            return Double.POSITIVE_INFINITY;
        } else {
            return (getP2().getCoordY() - getP1().getCoordY()) / (getP2().getCoordX() - getP1().getCoordX());
        }
    }

    /**
     * Verifica se as retas são paralelas
     * @param s uma instância de SegmentoReta
     * @return true se as retas forem paralelas e false caso não forem
     */
    boolean paralelo(SegmentoReta s) {
        double diff = Math.abs(coeficienteAngular() - s.coeficienteAngular());
        if (diff < 10e-2) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "P1 = " + getP1().toString()
                + " P2 = " + getP2().toString();
    }

    public boolean iguais(SegmentoReta seg) {
        if (getP1() == seg.getP1() && getP2() == seg.getP2()) {
            return true;
        } else {
            return false;
        }

    }
}

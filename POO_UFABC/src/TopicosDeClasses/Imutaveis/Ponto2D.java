package TopicosDeClasses.Imutaveis;

public class Ponto2D {
    private final double x;
    private final double y;

    public Ponto2D (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public Ponto2D move(double dx, double dy) {
        return  new Ponto2D(x + dx,y + dy);
    }

}

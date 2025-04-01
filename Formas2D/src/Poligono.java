public abstract class Poligono extends FormaGeometrica{
    //Array de Pontos no Pligono??
    protected final Ponto[] pontos;
    protected final SegmentoReta[] segmentos;

    public Poligono(Ponto[] pontos, SegmentoReta[] segmentos) {
        this.pontos = pontos;
        this.segmentos = segmentos;
    }

    public Ponto[] getPontos() {
        return pontos;
    }

    public SegmentoReta[] getSegmentos() {
        return segmentos;
    }
}

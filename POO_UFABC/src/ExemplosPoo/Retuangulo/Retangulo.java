package ExemplosPoo.Retuangulo;

public class Retangulo {
    Coordenada coordenadaCentro;
    private final double altura;
    private final double comprimento;

    Retangulo(Coordenada coordenadaCentro, int altura, int comprimento) {
        this.coordenadaCentro = coordenadaCentro;
        this.altura = altura;
        this.comprimento = comprimento;
    }

    double areaRetanglo() {
        return altura * comprimento;
    }

    double perimetroRetangulo() {
        return altura * 2 + comprimento * 2;
    }

    Coordenada getCoordenadaCentro() {
        return coordenadaCentro;
    }

    boolean contidoNoRetangulo(Coordenada cord) {
        boolean xPontoDentro = false;
        boolean yPontoDentro = false;
        if (coordenadaCentro.getCoordenadaY() + (altura / 2d) > cord.getCoordenadaY()
                && cord.getCoordenadaY() > coordenadaCentro.getCoordenadaY() - (altura / 2d)) {
            yPontoDentro = true;
        }
        if (coordenadaCentro.getCoordenadaX() + (comprimento / 2d) > cord.getCoordenadaX()
                && cord.getCoordenadaX() > coordenadaCentro.getCoordenadaX() - (comprimento / 2d)) {
            xPontoDentro = true;
        }
        if (xPontoDentro && yPontoDentro) {
            return true;
        } else {
            return false;
        }
    }
    //a alura dividad por 2 de um tem que sar maisor que a altura dividida por dois doi ouyto
    boolean retanguloContemNoRetangulo(Retangulo retangulo) {
        boolean dentroX = false;
        boolean dentroY = false;
        if (!this.contidoNoRetangulo(retangulo.getCoordenadaCentro())) {
            return false;
        } else {
            if (this.coordenadaCentro.getCoordenadaY() + (this.altura / 2d) > retangulo.coordenadaCentro.getCoordenadaY() + (retangulo.altura / 2d)
                    && retangulo.coordenadaCentro.getCoordenadaY() - (retangulo.altura / 2d) > this.coordenadaCentro.getCoordenadaY() - (this.altura / 2d)) {
                dentroY = true;
            }
            if (this.coordenadaCentro.getCoordenadaX() + (this.comprimento / 2d) > retangulo.coordenadaCentro.getCoordenadaX() + (retangulo.comprimento / 2d)
                    && retangulo.coordenadaCentro.getCoordenadaX() - (retangulo.comprimento / 2d) > this.coordenadaCentro.getCoordenadaX() - (this.comprimento / 2d)) {
                dentroX = true;

            }
            if (dentroX && dentroY) {
                return true;
            } else {
                return false;
            }
        }
    }
}

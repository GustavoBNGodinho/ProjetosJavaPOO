package Atividades.Complexo;

public class Complexo {
    double real;
    double imaginario;

    Complexo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    Complexo adiciona (Complexo c) {
        double newReal = this.real + c.real;
        double newImag = this.imaginario + c.imaginario;

        return new Complexo(newReal, newImag);
    }

    Complexo subtrai(Complexo c) {
        double newReal = this.real - c.real;
        double newImag = this.imaginario - c.imaginario;
        return new Complexo(newReal, newImag);
    }

    Complexo multiplica(Complexo c) {
        double newReal = this.real;
        return new Complexo(1,1);
    }
}
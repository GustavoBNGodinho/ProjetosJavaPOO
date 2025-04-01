package Atividades.Racionais;

public class Racional {
   private int numerador;
   private int denominador;

    Racional(int numerador, int denominador) {
        int numeradorNew;
        int denominadorNew;

        if ((numerador < 0 && denominador < 0) || (numerador > 0 && denominador < 0)) {
            numeradorNew = - numerador;
            denominadorNew = - denominador;
        }  else {
            numeradorNew = numerador;
            denominadorNew = denominador;
        }



        int mdc = 1;
        if (numeradorNew < denominadorNew) {
            for (int i = 1; i < denominadorNew + 1; i++) {
                if (numeradorNew % i == 0 && denominadorNew % i == 0) {
                    mdc = i;
                }
            }
        } else if (numeradorNew > denominadorNew) {
            for (int i = 1; i < numeradorNew + 1; i++) {
                if (numeradorNew % i == 0 && denominadorNew % i == 0) {
                    mdc = i;
                }
            }
        }

        setNumerador(numeradorNew / mdc);
        setDenominador(denominadorNew / mdc);
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    int resto () {
        return getNumerador() % getDenominador();
    }

    Racional adiciona(Racional r) {
        if (getDenominador() == r.getDenominador()) {
            int numeradorSoma = getNumerador() + r.getNumerador();
            return new Racional(numeradorSoma, getDenominador());
        } else {
            int multDenominador = getDenominador() * r.getDenominador();
            int somaNumerador = r.getDenominador() * getNumerador() + getDenominador() * r.getNumerador();
            return new Racional(somaNumerador, multDenominador);
        }
    }

    Racional subtrai(Racional r) {
        if (getDenominador() == r.getDenominador()) {
            int numeradorSoma = getNumerador() - r.getNumerador();
            return new Racional(numeradorSoma, getDenominador());
        } else {
            int multDenominador = getDenominador() * r.getDenominador();
            int somaNumerador = r.getDenominador() * getNumerador() - getDenominador() * r.getNumerador();
            return new Racional(somaNumerador, multDenominador);
        }
    }

    Racional multiplica(Racional r) {
        int multNumerador = getNumerador() * r.getNumerador();
        int multDenominador = getDenominador() * r.getDenominador();
        return new Racional(multNumerador, multDenominador);
    }

    Racional divide(Racional r) {
        int divNumerador = getNumerador() * r.getDenominador();
        int divDenominador = getDenominador() * r.getNumerador();
        return new Racional(divNumerador, divDenominador);
    }

    Boolean igual(Racional r) {
        if (getNumerador() == r.getNumerador() && getDenominador() == r.getDenominador()) {
            return true;
        } else {
            return false;
        }
    }

    String converteParaString() {
        String racional = String.format("%s/%s", getNumerador(), getDenominador());
        return racional;
    }
}

//TODO  arrumar o caso em que o numerador e o numerador são negativos.
//TODO  arrumar alguma forma de simplificar os racionais. Pensar num algoritimo.

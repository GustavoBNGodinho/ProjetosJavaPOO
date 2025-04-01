package ExemplosPoo.Data;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    boolean isAnoBissexto() {
        if (this.getAno()%4 == 0) {
            if ((this.getAno()%100 == 0 && this.getAno()%400 != 0)) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    boolean isAnterior(Data data) {
        if (this.getAno() < data.getAno()) {
            return true;
        }
        if (this.getAno() == data.getAno()) {
            if (this.getMes() < data.getMes()) {
                return true;
            }
            if (this.getMes() == data.getMes()) {
                if (this.getDia() < data.getDia()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    boolean isPosterior(Data data) {
        if (this.getAno() > data.getAno()) {
            return true;
        }
        if (this.getAno() == data.getAno()) {
            if (this.getMes() > data.getMes()) {
                return true;
            }
            if (this.getMes() == data.getMes()) {
                if (this.getDia() > data.getDia()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public String toString() {
        String mesString = " ";
        if (this.getMes() == 1) {
            mesString = "Janeiro";
        }
        if (this.getMes() == 2) {
            mesString = "Fevereiro";
        }
        if (this.getMes() == 3) {
            mesString = "Março";
        }
        if (this.getMes() == 4) {
            mesString = "Abril";
        }
        if (this.getMes() == 5) {
            mesString = "Maio";
        }
        if (this.getMes() == 6) {
            mesString = "Junho";
        }
        if (this.getMes() == 7) {
            mesString = "Julho";
        }
        if (this.getMes() == 8) {
            mesString = "Agosto";
        }
        if (this.getMes() == 9) {
            mesString = "Setenbro";
        }
        if (this.getMes() == 10) {
            mesString = "Outubro";
        }
        if (this.getMes() == 11) {
            mesString = "Novembro";
        }
        if (this.getMes() == 12) {
            mesString = "Dezemrbo";
        }
        return this.getDia() + "de" + mesString + "de" + this.getDia();
    }
}

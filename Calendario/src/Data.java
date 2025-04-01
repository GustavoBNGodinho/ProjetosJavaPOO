public class Data {
    int dia;
    int mes;
    int ano;

    Data(int dia, int mes, int ano) {
        if (dia < 1 || dia > 31) {
            throw new IllegalArgumentException("dia deve estar em [1,31]");
        }

        if (mes < 1 || dia > 31) {
            throw new IllegalArgumentException("");
        }
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    static boolean bissexto(int ano) {
        if (ano < 0 || ano > 2999) {
            throw new IllegalArgumentException("Ano fora do valor do intervalo válido");
        }

        //se não é divisível por 4, não é bissexto
        if (ano % 4 != 0) {
            return false;
        }

        //fivisível por 4, mas não é por 100, bissexto
        if (ano % 100 != 0) {
            return true;
        }
    }
}
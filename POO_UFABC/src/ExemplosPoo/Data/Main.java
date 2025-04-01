package ExemplosPoo.Data;

public class Main {
    public static void main(String[] args) {

        Data data1 = new Data(1, 3, 2022);
        Data data2 = new Data (5, 7, 1924);
        Data data3 = new Data(4, 7, 1924);
        Data data4 = new Data(4, 2, 2022);

        System.out.println(data1.isAnterior(data2));
        System.out.println(data2.isAnoBissexto());
        System.out.println(data3.isAnterior(data2));
        System.out.println(data1.isPosterior(data4));
    }
}

package Atividades.ContaCorrente;

public class InstanciaçãoContaCorrente {
    public static void printContaCorrente(ContaCorrente c) {
        System.out.printf("Número: %s \n", c.numero);
        System.out.printf("Titular: %s \n", c.titular);
        System.out.printf("Saldo: R$ %.2f\n", c.saldo);
    }
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("123-x", "Maria");
        ContaCorrente c2 = new ContaCorrente("234-x", "João");

        System.out.println(c1.numero);;

        printContaCorrente(c1);

        c1.depositar(100);System.out.println();
        printContaCorrente(c1);
        System.out.println();
        printContaCorrente(c2);

        c2.depositar(50);

        System.out.println();
        printContaCorrente(c1);
        System.out.println();
        printContaCorrente(c2);

        c1.sacar(20);
        c2.sacar(40);

        System.out.println();
        printContaCorrente(c1);
        System.out.println();
        printContaCorrente(c2);


    }


}

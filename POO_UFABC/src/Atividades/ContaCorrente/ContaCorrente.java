package Atividades.ContaCorrente;

public class ContaCorrente {
    //public -> modificador de acesso; nesse contexto podemos tirar;
    //é usual fazer a seguinte oredem -> propriedades -> construtor;
    //CarnelCase;

    String numero;
    String titular;
    float saldo;

    //construtor
    ContaCorrente(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        saldo = 0.0f;
    }
    float sacar(float amount) {
        this.saldo -= amount;

        return saldo;
    }

    float depositar (float amount) {
        this.saldo += amount;

        return this.saldo;
    }
}

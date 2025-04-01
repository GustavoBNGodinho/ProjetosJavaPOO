package ExemplosPoo.Loja;

public abstract class Desconto {
    protected Pedido pedido;

    public Desconto(Pedido pedido) {
        this.pedido = pedido;
    }


    /**
     * Calcula o valor monetário do desconto
     * segundo a política adorada;
     */
    public abstract double getDesconto();
}

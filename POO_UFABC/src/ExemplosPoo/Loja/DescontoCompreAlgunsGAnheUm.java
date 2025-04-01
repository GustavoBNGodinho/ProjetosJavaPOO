package ExemplosPoo.Loja;

public final class DescontoCompreAlgunsGAnheUm extends Desconto {
    private int n;
    public DescontoCompreAlgunsGAnheUm(Pedido pedido, int n) {
        super(pedido);
        this.n = n;
    }

    @Override
    public double getDesconto() {
        return pedido.getQuantidade() / n * pedido.getPrecoUnitario();
    }
}

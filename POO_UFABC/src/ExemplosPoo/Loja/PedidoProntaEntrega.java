package ExemplosPoo.Loja;

public class PedidoProntaEntrega  extends Pedido{
    private static double TAXA_DESCONTO = 0.03;

    public PedidoProntaEntrega(int quantidade, double precoUnitario, Cliente cliente, MeioPagamento meioPagamento) {
        super(quantidade, precoUnitario, cliente, meioPagamento);
        addDesconto(new DescontoFixo(this, TAXA_DESCONTO));
    }

    public double getAcrescimos() {
        return 0.0;
    }
}

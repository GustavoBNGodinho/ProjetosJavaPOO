package ExemplosPoo.Loja;

public final class DescontoGrandesQuantidades extends Desconto{
    private double taxaDesconto;
    private int quantidadeMinima;

    public DescontoGrandesQuantidades(Pedido pedido, double percentage, int quantidadeMinima) {
        super(pedido);
        this.taxaDesconto = percentage;
        this.quantidadeMinima = quantidadeMinima;
    }


    @Override
    public double getDesconto() {
        return pedido.getQuantidade() <= quantidadeMinima
                ? pedido.getPrecoTotal() * taxaDesconto
                : 0;
    }
}

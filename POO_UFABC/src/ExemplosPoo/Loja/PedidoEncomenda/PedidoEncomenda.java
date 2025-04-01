package ExemplosPoo.Loja.PedidoEncomenda;

import ExemplosPoo.Loja.Cliente;
import ExemplosPoo.Loja.Pedido;

public class PedidoEncomenda extends Pedido {
    private String enderecoEntrega;
    private double frete;

    public PedidoEncomenda(int quantidade, double precoUnitario, Cliente cliente, MeioPagamento meioPagamento, String enderecoEntrega, double frete) {
        super(quantidade, precoUnitario, cliente, meioPagamento);
        this.enderecoEntrega = enderecoEntrega;
        this.frete = frete;
    }

    public double getAcrescimos() {
        return 0;
    }
}

package ExemplosPoo.Loja;

import java.util.ArrayList;

public abstract class Pedido {
    private int quantidade;
    private double precoUnitario;
    private Cliente cliente;
    ArrayList<Desconto> descontos;
    private MeioPagamento meioPagamento;
    public enum MeioPagamento {
        DINHERO, CARTAO, PIX
    }
    public Pedido(int quantidade, double precoUnitario, Cliente cliente, MeioPagamento meioPagamento) {
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.cliente = cliente;
        this.meioPagamento = meioPagamento;
        this.descontos = new ArrayList<Desconto>();

        if (cliente.isFidelidade()) {
            addDesconto(new DescontoFixo(this, 0.05));
        }

        if (meioPagamento == MeioPagamento.DINHERO
        || meioPagamento == MeioPagamento.PIX) {
            addDesconto(new DescontoFixo(this, 0.04));
        }
    }

    public final double preçoFinal() {
        return getPrecoTotal() - getDescontoTotal() + getAcrescimos();
    }

    public abstract double getAcrescimos();
    //determina o valor monetário acumulado resultante da aplicação de todos os descontos
    public double getDescontoTotal() {
        double total = 0;

        for (Desconto desconto : descontos) {
            total += desconto.getDesconto();
        }
        return total;
    }

    public void addDesconto(Desconto desconto) {
        this.descontos.add(desconto);
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getPrecoTotal() {
        return getQuantidade() * getPrecoUnitario();
    }


}

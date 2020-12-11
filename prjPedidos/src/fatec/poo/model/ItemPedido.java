package fatec.poo.model;

/**
 *
 * @author Jean
 */
public class ItemPedido {

    private int sequencia;
    private double qntdVendida;
    private Produto produto;
    private Pedido pedido;

    public ItemPedido(int sequencia, double qntdVendida, Produto produto) {
        this.sequencia = sequencia;
        this.qntdVendida = qntdVendida;
        this.produto = produto;
        produto.setQtdeEstoque(produto.getQtdeEstoque() - qntdVendida);
    }

    public void setQntdVendida(double qntdVendida) {
        this.qntdVendida = qntdVendida;
    }

    public int getSequencia() {
        return sequencia;
    }

    public double getQntdVendida() {
        return qntdVendida;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

}

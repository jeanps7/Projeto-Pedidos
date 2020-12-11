package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Jean
 */
public class Vendedor extends Pessoa {

    private double salarioBase;
    private double taxaComissao;
    private ArrayList<Pedido> pedido;

    public Vendedor(String cpf, String nome, double salarioBase) {
        super(cpf, nome);
        this.salarioBase = salarioBase;
        this.pedido = new ArrayList<Pedido>();
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void addPedido(Pedido p) {
        pedido.add(p);
        p.setVendedor(this);
    }

    public ArrayList<Pedido> getPedido() {
        return pedido;
    }

}

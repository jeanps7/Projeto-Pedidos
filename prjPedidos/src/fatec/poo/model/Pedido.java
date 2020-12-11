package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Jean
 */
public class Pedido {

    private String numero;
    private String dataEmissao;
    private String dataPagto;
    private boolean formaPagto;
    private boolean situacao;
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<ItemPedido> itemPedido;

    public Pedido(String numero, String dataEmissao) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        itemPedido = new ArrayList<ItemPedido>();
    }

    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public void setFormaPagto(boolean formaPagto) {
        this.formaPagto = formaPagto;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public String getNumero() {
        return numero;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public String getDataPagto() {
        return dataPagto;
    }

    public boolean getFormaPagto() {
        return formaPagto;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void addItemPedido(ItemPedido i) {
        double valor = this.cliente.getLimiteDisp() - i.getProduto().getPreco();
        itemPedido.add(i);
        i.setPedido(this);
        this.cliente.setLimiteDisp(valor);
    }

    public ArrayList<ItemPedido> getItemPedido() {
        return itemPedido;
    }

    public static boolean validaData(String data) {
        boolean validacao = false;
        //formato "01/01/2020"
        try {
            int dia = Integer.parseInt(data.substring(0, 2));
            int mes = Integer.parseInt(data.substring(3, 5));
            int ano = Integer.parseInt(data.substring(6, 10));
            if (mes >= 1 && mes <= 12) {  //valida mes
                //verifica qtd dias dos mes
                int maxD = (mes == 2 ? (ano % 4 == 0 ? 29 : 28)
                        : mes <= 7 ? (mes % 2 == 0 ? 30 : 31)
                                : (mes % 2 == 0 ? 31 : 30));

                if (dia >= 1 && dia <= maxD) {
                    validacao = true;
                }
            }
        } catch (Exception e) {
            return validacao;
        }

        return validacao;
    }

}

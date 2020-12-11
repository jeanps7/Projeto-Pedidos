package fatec.poo.model;

/**
 *
 * @author Jean
 */
public class Produto {

    private String codigo;
    private String descricao;
    private double qtdeEstoque;
    private String unidadeMedida;
    private double preco;
    private double estoqueMinimo;

    public Produto(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQtdeEstoque(double qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setEstoqueMinimo(double estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getQtdeEstoque() {
        return qtdeEstoque;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public double getPreco() {
        return preco;
    }

    public double getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public static boolean validarCodigo(String codigo) {
        String cod = codigo;
        if (codigo.length() > 0) {
            for (int i = 0; i < cod.length(); i++) {
                Character digito = cod.charAt(i);
                if (!Character.isDigit(digito)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public String getCodigo() {
        return codigo;
    }

}

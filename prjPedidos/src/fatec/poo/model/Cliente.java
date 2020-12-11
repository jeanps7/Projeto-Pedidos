package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Jean
 */
public class Cliente extends Pessoa {

    private double limiteCred;
    private double limiteDisp;
    private boolean sexo;
    private ArrayList<Pedido> pedido;

    public Cliente(String cpf, String nome, double limiteCred) {
        super(cpf, nome);
        this.limiteCred = limiteCred;
        this.limiteDisp = limiteCred;
        this.pedido = new ArrayList<Pedido>();
    }

    public void setLimiteCred(double limiteCred) {
        this.limiteDisp += (limiteCred - this.limiteCred);
        this.limiteCred = limiteCred;
    }

    public double getLimiteCred() {
        return limiteCred;
    }

    public double getLimiteDisp() {
        return limiteDisp;
    }

    public void addPedido(Pedido p) {
        pedido.add(p);
        p.setCliente(this);
    }

    public void setLimiteDisp(double limiteDisp) {
        this.limiteDisp = limiteDisp;
    }

    public ArrayList<Pedido> getPedido() {
        return pedido;
    }

    public boolean getSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

}

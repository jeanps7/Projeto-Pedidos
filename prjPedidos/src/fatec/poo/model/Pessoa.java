package fatec.poo.model;

/**
 *
 * @author Jean
 */
public class Pessoa {

    private String cpf;
    private String nome;
    private String endereco;
    private String cidade;
    private String uf;
    private String cep;
    private String ddd;
    private String telefone;

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public String getCep() {
        return cep;
    }

    public String getDdd() {
        return ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static boolean validaCPF(String CPF) {
        CPF = CPF.replaceAll("[./-]", "");

        if (CPF.equals("00000000000")
                || CPF.equals("11111111111")
                || CPF.equals("22222222222") || CPF.equals("33333333333")
                || CPF.equals("44444444444") || CPF.equals("55555555555")
                || CPF.equals("66666666666") || CPF.equals("77777777777")
                || CPF.equals("88888888888") || CPF.equals("99999999999")
                || (CPF.length() != 11)) {
            return false;
        }

        if (CPF.length() == 11) {
            //Calculo do 1º Digito
            int digitoUm = 0;
            for (int i = 0; i < 9; i++) {
                int num = (int) (CPF.charAt(i) - 48);
                digitoUm = digitoUm + (num * (i + 1));
            }
            digitoUm = digitoUm % 11;
            if (digitoUm == 10) {
                digitoUm = 0;
            }
            //Calculo do 2º Digito
            float digitoDois = 0;
            int mult = 11;
            for (int i = 0; i < 9; i++) {
                int num = (int) (CPF.charAt(i) - 48);
                digitoDois = digitoDois + (num * mult);
                mult--;
            }
            digitoDois = digitoDois + (digitoUm * 2);
            digitoDois = digitoDois * 10;
            digitoDois = digitoDois % 11;

            if (digitoDois == 10) {
                digitoDois = 0;
            }

            //Conversão
            int digUm = Integer.parseInt(String.valueOf(CPF.charAt(9)));
            int digDois = Integer.parseInt(String.valueOf(CPF.charAt(10)));

            //Valida se os digitos verificadores são iguais aos dois ultimos do CPF
            if (digitoUm == digUm && digitoDois == digDois) {
                return true;
            }
        } else {
            return false;
        }
        return false;
    }

}

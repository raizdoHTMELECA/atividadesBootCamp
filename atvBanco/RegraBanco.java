public class RegraBanco {

    private String nomeDoTitular;

    private int numeroDaConta;

    private int saldo;


    public RegraBanco(){
        this.nomeDoTitular = nomeDoTitular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return this.saldo = saldo;
    }

    public void deposito (int quantidade) {
        saldo += quantidade;
    }

    public void saque (int quantidade) {
        saldo -= quantidade + 5;
    }

}


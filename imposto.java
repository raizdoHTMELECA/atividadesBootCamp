public class imposto {
    public String name;
    public double valorSalario;
    public double impostoValor;

    public double calculoImposto(){
        return valorSalario - impostoValor;
    }
    public void porcentagemImposto(double porcentagem) { // Mudou para double
        this.valorSalario += this.valorSalario * (porcentagem / 100.0);

    }

}

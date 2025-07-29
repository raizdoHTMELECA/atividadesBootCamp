public class Estoque {
    public String nameProduto;

    public double valorProduto;

    public int quantidadeProduto;

    public double valorTotalEstoque(){
        return valorProduto * quantidadeProduto;
    };

    public void addProduto(int quantidadeProduto){
        this.quantidadeProduto += quantidadeProduto;

    };

    public void removerProduto(int quantidadeProduto){
        this.quantidadeProduto -= quantidadeProduto;

    };

}

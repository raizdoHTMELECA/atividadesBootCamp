public class regraCarro {
    private String modelo;
    private int anoFabricacao;
    private int atual = 2025;

    public String setModelo(String modelo) {
        this.modelo = modelo;
        return modelo;
    }

    public int getcalculo(int anoFabricacao) {
        this.anoFabricacao = atual - anoFabricacao;
        if (this.anoFabricacao < 10){
            System.out.printf("%s: Apto", modelo);
        }else {
            System.out.println("Nao apto");

        };
        return anoFabricacao;
    }

}

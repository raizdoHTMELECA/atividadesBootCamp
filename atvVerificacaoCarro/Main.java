import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var novaVerificacao = new regraCarro();

        String modelo = sc.next();
        novaVerificacao.setModelo(modelo);

        var anoFabricacao = sc.nextInt();
        novaVerificacao.getcalculo(anoFabricacao);
    }
}

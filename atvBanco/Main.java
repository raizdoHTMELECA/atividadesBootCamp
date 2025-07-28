import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var novoUser = new RegraBanco();

        System.out.println("Informe o número da conta:");
        var numeroDaConta = sc.nextInt();
        novoUser.setNumeroDaConta(numeroDaConta);

        System.out.println("Nome do Titular: ");
        var nome = sc.next();
        novoUser.setNomeDoTitular(nome);

        System.out.println("Deseja realizar um depósito inicial? (S/N): ");
        var decisao = sc.next().toUpperCase();
        if (decisao.equals("s".toUpperCase())) {
            System.out.println("Digite o valor do deposito inicial: ");

            var saldo = sc.nextInt();
            novoUser.setSaldo(saldo);
        }else {novoUser.setSaldo(0);};

        System.out.println("Deposite um valor: ");
        var deposito = sc.nextInt();
        novoUser.deposito(deposito);


        System.out.println("Digite um valor para saque: ");
        var saque = sc.nextInt();
        novoUser.saque(saque);

        System.out.printf("Atualização: Número da conta: %s, Titular da conta: %s, Saldo: %s", novoUser.getNumeroDaConta(),novoUser.getNomeDoTitular(), novoUser.getSaldo());

        sc.close();
    }
}

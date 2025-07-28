import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var novoImposto = new imposto();
        Scanner sc = new Scanner(System.in);

        System.out.println("Name: \n");
        novoImposto.name = sc.next();

        System.out.println("Gloss salary: ");
        novoImposto.valorSalario = sc.nextDouble();

        System.out.println("Tax: ");
        novoImposto.impostoValor = sc.nextDouble();

        System.out.printf("Employee: %s, $ %s\n", novoImposto.name, novoImposto.calculoImposto());
        System.out.println("Which percentage to increase salary? ");
        double porcentagem = sc.nextInt();
        novoImposto.porcentagemImposto(porcentagem);

        System.out.printf("Update data: %s, $ %.2f", novoImposto.name, novoImposto.calculoImposto());

    }
    }

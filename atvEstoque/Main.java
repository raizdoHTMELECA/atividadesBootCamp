import java.util.Scanner;

    public static void Main(String[] args) {
        var novoProduto = new Estoque();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        novoProduto.nameProduto = sc.next();

        System.out.println("Price: ");
        novoProduto.valorProduto = sc.nextDouble();

        System.out.println("Quantity in Stock:  ");
        novoProduto.quantidadeProduto = sc.nextInt();
        System.out.println(novoProduto.quantidadeProduto);


        System.out.println("Enter the number of products to be added in stock: ");
        int quantidadeProduto = sc.nextInt();
        novoProduto.addProduto(quantidadeProduto);
        System.out.println(novoProduto.quantidadeProduto);

        System.out.printf("Updated data: %s, $ %s, %s units, Total: $ %s \n", novoProduto.nameProduto, novoProduto.valorProduto, novoProduto.quantidadeProduto, novoProduto.valorTotalEstoque());

        System.out.println("Enter the number of products to be removed form Stock: ");
        int tirarProduto = sc.nextInt();
        novoProduto.removerProduto(tirarProduto);
        System.out.println(novoProduto.quantidadeProduto);

        System.out.printf("Updated data: %s, $ %s, %s units, Total: $ %s \n", novoProduto.nameProduto, novoProduto.valorProduto, novoProduto.quantidadeProduto, novoProduto.valorTotalEstoque());


    }

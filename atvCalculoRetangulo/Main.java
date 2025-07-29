import java.util.Scanner;

public static void Main(String[] args) {
        var novoRetangulo = new Regras();
        System.out.println("Enter rectangle width and height: ");
        Scanner sc = new Scanner(System.in);

        novoRetangulo.largura = sc.nextDouble();
        novoRetangulo.altura = sc.nextDouble();

        System.out.printf("Value Area: %s\n", novoRetangulo.areaRetangulo());
        System.out.printf("Value Perimeter: %s\n", novoRetangulo.perimetroRetangulo());
        System.out.printf("Value Diagonal: %s", novoRetangulo.diagonalRetangulo());
}

void main() {
}



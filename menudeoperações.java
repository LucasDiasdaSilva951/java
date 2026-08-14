import java.util.Scanner;

class menudeoperações {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite o primeiro número: ");
    double primeironúmero = entrada.nextDouble();
    System.out.println("Digite o segundo número: ");
    double segundonúmero = entrada.nextDouble();
    System.out.println("1 - Somar");
    System.out.println("2 - Subtrair");
    System.out.println("3 - Multiplicar");
    System.out.println("4 - Dividir");
    System.out.println("0 - Sair");
    System.out.println("Escolha uma opção: ");
    int opção = entrada.nextInt();
    
    switch (opção) {
        case 1:
            double resultado = primeironúmero + segundonúmero;
            System.out.println("O resultado é " + resultado);
            break;
        case 2:
            double result = primeironúmero - segundonúmero;
            System.out.println("O resultado é " + result);
            break;
        case 3:
            double res = primeironúmero * segundonúmero;
            System.out.println("O resultado é " + res);
            break;
        case 4: 
            double re = primeironúmero / segundonúmero;
            System.out.println("O resultado é " + re); 
            break;
        case 0: 
            System.out.println("Programa encerrado.");
            break;
        default:
            System.out.println("Opção Inválida.");
        }
        entrada.close();
    } 
}
import java.util.Scanner;

public class maioremenor {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int[] numeros = new int[8];
    int maior = numeros[0];
    int menor = numeros[0];
    for (int cont = 0; cont <  numeros.length; cont++) {
        System.out.print("Digite o " + (cont+1) + "° número: ");
        numeros[cont] = entrada.nextInt()
        ;
        if (numeros[cont] > maior) {
            maior = numeros[cont];
        }
        if (numeros[cont] < menor) {
            menor = numeros[cont];
        }
    }
    System.out.println("O maior número digitado é " + maior);
    System.out.println("O menor número digitado é " + menor);
    entrada.close();
    }
}

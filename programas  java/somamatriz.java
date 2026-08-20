import java.util.Scanner;

public class somamatriz {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner entrada = new Scanner (System.in);
        int somamatriz = 0;
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 1; y < matriz.length; y++)
            {
                System.out.print("Digite o número para a posição " + "[" + x + "]" + "[" + y + "]" + ": ");
                matriz[x][y] = entrada.nextInt();
                somamatriz += matriz[x][y];
            }
        }
    System.out.println("A soma de todos os elementos adicionados na matriz é " + somamatriz);
    entrada.close();
    }
}

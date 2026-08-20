import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Scanner;

public class filadeatendimento {
    public static void main(String[] args) {
        Queue <String> fila = new ArrayDeque<>();
        Scanner entrada = new Scanner(System.in);
        int cont = 0;
        while (cont < 5) {
            System.out.print("Digite o nome da " + (cont+1) + "° pessoa: ");
            String pessoa = entrada.nextLine();
            fila.offer(pessoa);
            System.out.println("\033[32mPessoa cadastrada na fila com sucesso!\033[m");
            cont++;
        }
        System.out.println("Fila de Espera: " + fila);
        System.out.println("A primeira pessoa da fila é (o/a) " + fila.peek());
        fila.poll();
        System.out.println("\033[31mPrimeira pessoa da fila removida com sucesso!\033[m");
        System.out.println("Primeira pessoa da fila após o primeiro atendimento do dia: " + fila.peek());
        System.out.println("Fila de Espera Atualizada: " + fila);
    entrada.close();
    }
}

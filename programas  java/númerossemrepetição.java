import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class númerossemrepetição {
    public static void main(String[] args) {
        Set <Integer> numeros = new HashSet<>();
        Scanner entrada = new Scanner (System.in);
        for (int cont = 0; cont < 8; cont++) {
            System.out.print("Digite o " + (cont+1) + "° número: ");
            int num = entrada.nextInt();   
            numeros.add(num); 
        }   
        System.out.println("Lista completa de números: " + numeros);
        System.out.println("A quantidade de números cadastrados é de " + numeros.size() + " números.");
        entrada.close();
    }
}
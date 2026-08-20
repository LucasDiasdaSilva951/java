import java.util.Scanner;
import java.util.ArrayList;
public class nomes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        for (int cont = 1; cont < 6; cont++) {
            System.out.print("Nome " + cont + ": ");
            String nome = entrada.next();
            nomes.add(nome);
        }
        System.out.println("Todos os nomes cadastrados: ");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.print(nomes.get(i) + " ");
        }
        if (nomes.contains("Lucas")) {
            System.out.println("\n\033[32mO nome Lucas se encontra dentro do banco de dados!\033[m");
        }
        else {
            nomes.remove(4);
            System.out.println("\n\033[31mO nome Lucas não se encontra dentro do banco de dados!\033[m"); 
            nomes.add("Lucas");
            System.out.println
            ("\033[32mPronto! Agora o nome Lucas está cadastrado no sistema!\033[m");
            System.out.println("Todos os nomes cadastrados atualizados: ");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.print(nomes.get(i) + " ");
            }
        }
        System.out.println("\nQuantidade de nomes: " + nomes.size() + " elementos");
        System.out.println("\033[32mNomes cadastrados com sucesso!\033[m"); 
        entrada.close();   
    }
    
}

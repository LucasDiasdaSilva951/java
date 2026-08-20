import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class dicionáriodepalavras {
    public static void main(String[] args) {
        Map <String, String> dicionário = new HashMap<>();
        Scanner entrada = new Scanner (System.in);
        int cont = 0;
        while (true) {
            System.out.print("Digite a " + (cont+1) + "° palavra: ");  
            String palavra = entrada.nextLine();
            System.out.print ("Digite o significado dessa " + (cont+1) + "° palavra: ");
            
            String significado = entrada.nextLine();
            dicionário.put("Palavra: " + palavra, "Significado: " + significado);
            System.out.println("\033[32mPalavra cadastrada com sucesso!\033[m");
            cont++;
            if (cont == 5) {
                break;
            }  
        } 
        System.out.println("Dicionário completo: ");
        for (Map.Entry<String, String> item: dicionário.entrySet()) {
            System.out.println(item.getKey() + " -> " + item.getValue());
        }
        entrada.close();
    }
}

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class listadecompras {
    public static void main(String[] args) {
    List <String> compras = new ArrayList<>();
    Scanner entrada = new Scanner (System.in);
    int cont = 0;
    while (cont < 5) {
        System.out.print("Digite o " + (cont+1) + "° produto: ");
        String produto = entrada.nextLine();
        compras.add(produto);
        cont ++;
    }
    System.out.println("Lista Completa: " + compras);
    System.out.println("Quantidade de itens na lista: " + compras.size() + " produtos");
    while (true) {
        System.out.print("Digite o produto que você deseja remover: ");
        String removerproduto = entrada.nextLine();
        if (compras.contains(removerproduto)) {
            compras.remove(removerproduto);
            System.out.println("\033[32mProduto removido com sucesso!\033[m");
            System.out.println("Lista Atualizada: " + compras);
            System.out.println("Quantidades de produtos na lista: " + compras.size() + " produtos");
            entrada.close();
            break;  
        }
        else {
            System.out.println("\033[31mO produto digitado não existe no sistema!\033[m");
            continue;
        }     
    } 
    }
}

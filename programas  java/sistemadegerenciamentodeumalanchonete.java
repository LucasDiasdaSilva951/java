import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class sistemadegerenciamentodeumalanchonete {
    public static void main(String[] args) {
    String[] categorias = {"Bebidas", "Lanches", "Sobremesas"};
    ArrayList<Integer> notas = new ArrayList<>();
    ArrayList<Object> produtosgerais = new ArrayList<>();
    HashMap <String, Float> produtoscadastrados = new HashMap<>();produtosgerais.add(produtoscadastrados);
    float soma = 0;
    float media = 0;
    Scanner entrada = new Scanner(System.in);

    while (true) {
    System.out.println("\n===== CATEGORIAS =====");
    System.out.println("1 - Mostrar categorias");
    System.out.println("2 - Avaliações dos produtos");
    System.out.println("3 - Gerenciar Produtos");
    System.out.println("4 - Códigos promocionais");
    System.out.println("5 - Preços dos produtos");
    System.out.println("6 - Fila de pedidos");
    System.out.println("0 - Sair do programa");
    System.out.println("======================");
    System.out.print("Digite a opção desejada: ");
    int opcao = entrada.nextInt();
    if (opcao == 1) {
        System.out.print("Categorias do restaurante: ");
        for (String valor : categorias) {
            System.out.print(valor + " | ");
        }
    } else if (opcao == 2) {
        while (true) {
            System.out.println("\n===== AVALIAÇÕES =====");
            System.out.println("1 - Cadastrar avaliações");
            System.out.println("2 - Mostrar avaliações");
            System.out.println("3 - Calcular médias");
            System.out.println("0 - Voltar");
            System.out.println("======================");
            System.out.print("Digite a opção desejada: ");
            int opc = entrada.nextInt();
            if (opc == 1) {
            for (int cont = 1; cont < 4; cont++) {
            System.out.println("===== CADASTRO DE NOTAS =====");
            while (true) {
             System.out.print("Digite a nota 1: ");   
             int nota1 = entrada.nextInt();  
             if (nota1 > 10 || nota1 < 0) {
                System.out.println("\033[31mERRO: Nota inválida. Digite uma nota válida.\033[m");
             } 
             else {
                notas.add(nota1);
                break;
             }
            }
            while (true) {
             System.out.print("Digite a nota 2: ");   
             int nota2 = entrada.nextInt();  
             if (nota2 > 10 || nota2 < 0) {
                System.out.println("\033[31mERRO: Nota inválida. Digite uma nota válida.\033[m");
             } 
             else {
                notas.add(nota2);
                break;
             }
            }
            System.out.println("======================");
            cont+=1-1;
            System.out.println(cont);
        }
            }
            else if (opc == 2) {
                System.out.print("Todas as avaliações cadastradas: ");
                for (Integer valor : notas) {
                    System.out.print(valor + " | ");
                }
            }
            else if (opc == 3) {
                for (Integer valor : notas) {
                    soma += valor;
                }
            media = soma / notas.size();
            System.out.println("Média total de cada nota: " + media);
            }
            else if (opc == 0) {
                System.out.println("\033[32mSaída concluída com sucesso!\033[m");
                break;
            }
            else {
                System.out.println("\033[31mERRO: Opção inválida.\033[m");
            }
        }
    
    } else if (opcao == 3) {
        while (true) {
            System.out.println("\n===== PRODUTOS =====");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Mostrar Lista de produtos");
            System.out.println("3 - Remover produto");
            System.out.println("0 - Voltar");
            System.out.println("======================");
            System.out.print("Escolha uma opção: ");
            int opc = entrada.nextInt();
            if (opc == 1) {
                System.out.print("Nome do produto: ");
                String nomedoproduto = entrada.next();
                System.out.print("Preço: R$");
                float preço = entrada.nextFloat();
                produtoscadastrados.put(nomedoproduto, preço);
            }
            else if (opc == 2) {
                System.out.println("===== PRODUTOS CADASTRADOS =====");
                System.out.print("Produtos cadastrados: " + produtosgerais);     
            }
            else if (opc == 3) {
                System.out.println("===== REMOVER PRODUTOS CADASTRADOS =====");
                System.out.print("Digite o nome do produto: ");
                String nomedoprodutoapesquisar = entrada.next();
                if (produtoscadastrados.containsKey(nomedoprodutoapesquisar)) {
                    produtoscadastrados.remove(nomedoprodutoapesquisar);
                    System.out.println("\033[32mProduto removido com sucesso!\033[m");
                }
                else if (!produtosgerais.contains(nomedoprodutoapesquisar) ) {
                    System.out.println("\033[31mERRO: O nome digitado não existe no sistema!\033[m");
                }
            }
            else if (opc == 0) {
                System.out.println("\033[32mSaída concluída com sucesso!\033[m");
                break;
            }
            else {
                System.out.println("ERRO: Opção inválida.");
            }
        }
    } else if (opcao == 0) {
        System.out.println("\033[32mPrograma encerrado com sucesso! Volte Sempre!\033[m");
        break;
    
    } else {
        System.out.println("\033[31mERRO: Valor inválido\033[m");
        }
    }
    entrada.close();
    }
}

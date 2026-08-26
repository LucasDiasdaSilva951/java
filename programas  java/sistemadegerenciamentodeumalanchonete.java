import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class sistemadegerenciamentodeumalanchonete {
    public static void Opcao1doMenu() {
        String[] categorias = {"Bebidas", "Lanches", "Sobremesas"};
        System.out.print("Categorias do restaurante: ");
        for (String valor : categorias) {
            System.out.print(valor + " | ");
        }
    }
    public static void Opcao2doMenu() {
        ArrayList<Integer> notas = new ArrayList<>();
        float soma = 0;
        float media = 0;
        Scanner entrada = new Scanner(System.in);
        while (true) {
        System.out.println("\n===== AVALIAÇÕES =====");
        System.out.println("1 - Cadastrar avaliações");
        System.out.println("2 - Mostrar avaliações");
        System.out.println("3 - Calcular médias");
        System.out.println("0 - Voltar");
        System.out.println("======================");
        System.out.print("Digite a opção desejada: ");
        int opc = entrada.nextInt();
        System.out.println("======================");
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
            System.err.println("\033[31mERRO: Nota inválida. Digite uma nota válida.\033[m");
            } 
            else {
            notas.add(nota2);
            break;
            }
        }
    }
        }
        else if (opc == 2) {
            System.out.print("Todas as avaliações cadastradas: ");
            for (Integer valor : notas) {
                System.out.print(valor + " | ");
            }
        }
        else if (opc == 3) {
            if (!notas.isEmpty()) {
                soma = 0;
            for (Integer valor : notas) {
                soma += valor;
            }
            media = soma / notas.size();
            System.out.println("Média total de cada nota: " + media); 
            }
            else {
                System.out.println("\033[31mNão existem avaliações cadastradas!\033[m");
            }
            
        }
        else if (opc == 0) {
            System.out.println("\033[32mSaída concluída com sucesso!\033[m");
            break;
        }
        else {
            System.out.println("\033[31mERRO: Opção inválida.\033[m");
        }
    }
    entrada.close();
}
    public static void Opcao3doMenu() {
        ArrayList<Object> produtosgerais = new ArrayList<>();
        HashMap <String, Float> produtoscadastrados = new HashMap<>();produtosgerais.add(produtoscadastrados);
        Scanner entrada = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== PRODUTOS =====");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Mostrar Lista de produtos");
            System.out.println("3 - Remover produto");
            System.out.println("0 - Voltar");
            System.out.println("======================");
            System.out.print("Escolha uma opção: ");
            int opc = entrada.nextInt();
            System.out.println("======================");
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
                else if (!produtoscadastrados.containsKey(nomedoprodutoapesquisar) ) {
                    System.out.println("\033[31mERRO: O nome digitado não existe no sistema!\033[m");
                }
            }
            else if (opc == 0) {
                System.out.println("\033[32mSaída concluída com sucesso!\033[m");
                break;
            }
            else {
                System.err.println("\033[31mERRO: Opção inválida.\033[m");
            }
        }
        entrada.close();
    }
    public static void Opcao4doMenu() {
        HashSet <String> códigospromocionais = new HashSet<>();
        Scanner entrada = new Scanner(System.in);
        while (true) {
        System.out.println("===== CÓDIGOS PROMOCIONAIS =====");
        System.out.println("1 - Adicionar código");
        System.out.println("2 - Listar códigos");
        System.out.println("3 - Verificar código");
        System.out.println("0 - Voltar");
        System.out.println("======================");
        System.out.print("Escolha uma opção: ");
        int opc = entrada.nextInt();
        entrada.nextLine();
        System.out.println("======================");
        if (opc == 1) {
            while (true) {
               System.out.print("Digite o código promocional: ");
                String codigopromo = entrada.nextLine(); 
                if (códigospromocionais.contains(codigopromo)) {
                   System.out.println("\033[31mO código promocional digitado já existe no sistema!\033[m");
                }
                else {
                    códigospromocionais.add(codigopromo);
                    System.out.println("\033[32mCódigo promocional cadastrado com sucesso!\033[m");
                    break;
                }
            }
        }  
        else if (opc == 2) {
            
            if (códigospromocionais.size() == 0) {
            System.out.println("\033[31mNão existem códigos promocionais cadastrados no sistema!\033[m");
            }
            else {
                for (String valor : códigospromocionais) {
                System.out.println(valor); }
                System.out.println("Quantidade de códigos promocionais cadastrados no sistema: Existem " + códigospromocionais.size() + ".");
            }
        }
        else if (opc == 3) {
            System.out.print("Digite o código: ");
            String codigoexiste = entrada.nextLine();
            if (códigospromocionais.contains(codigoexiste)) {
                System.out.println("\033[32mCódigo encontrado com sucesso!\033[m");
            }
            else {
                System.out.println("\033[31mCódigo não encontrado!\033[m");
            }
        }
        else if (opc == 0) {
            System.out.println("\033[32mSaída concluída com sucesso!\033[m");
            break;
        } else { 
            System.err.println("\033[31mERRO: Digite um valor válido.\033[m");
            }
        }
        entrada.close();
    }
    public static void Opcao5doMenu() {
        HashMap <String, Float> nomedoprodutoeseuspreços = new HashMap<>();
        Scanner entrada = new Scanner(System.in);
        while (true) {
            System.out.println("===== PREÇO DOS PRODUTOS =====");
            System.out.println("1 - Cadastrar preço");
            System.out.println("2 - Consultar preço");
            System.out.println("3 - Alterar preço");
            System.out.println("4 - Remover preço");
            System.out.println("0 - Voltar");
            System.out.println("======================");
            System.out.print("Escolha uma opção: ");
            int opc = entrada.nextInt();
            System.out.println("======================");
            if (opc == 1) {
                while (true) {
                System.out.print("Digite o nome do produto: ");
                String nomedoproduto = entrada.next();
                System.out.print("Digite o preço: R$");
                float preçodoproduto = entrada.nextFloat();
                if (nomedoprodutoeseuspreços.containsKey(nomedoproduto)) {
                    System.out.println("\033[31mProduto já cadastrado! Digite outro produto válido.\033[m");
                }
                else {
                    nomedoprodutoeseuspreços.put(nomedoproduto, preçodoproduto);
                    System.out.println("\033[32mProduto adicionado com sucesso!\033[m");
                    System.out.println(nomedoprodutoeseuspreços);
                    break;
                }  
            }    
            } 
            else if (opc == 2) {
                while (true) {
                    System.out.print("Digite o nome do produto: ");
                    String produtoaencontrar = entrada.next();
                    if (nomedoprodutoeseuspreços.containsKey(produtoaencontrar)) {
                    System.out.println("Produto: " + produtoaencontrar);
                    System.out.println("Preço: " + nomedoprodutoeseuspreços.get(produtoaencontrar));
                    break;
                    }
                    else {
                        System.out.println("\033[31mNão existem produtos cadastrados!\033[m");
                        break;
                    }
                }
            }
                else if (opc == 3) {
                    while (true) {
                    System.out.print("Digite o nome do produto: ");
                    String nomedoproduto = entrada.next();
                    System.out.println(nomedoprodutoeseuspreços);
                    if (nomedoprodutoeseuspreços.containsKey(nomedoproduto)) {
                        System.out.print("Digite o preço: R$");
                        float preçodoproduto = entrada.nextFloat();
                        nomedoprodutoeseuspreços.replace(nomedoproduto, preçodoproduto);
                        System.out.println("\033[32mPreço alterado com sucesso!\033[m"); 
                        System.out.println(nomedoprodutoeseuspreços);
                        break;
                    }
                    else if (!nomedoprodutoeseuspreços.containsKey(nomedoproduto)) {
                        System.err.println("\033[31mProduto não encontrado! Digite um produto existente válido.\033[m");
                        break;
                        }
                    } 
                } 
                else if (opc == 4) {
                    while (true) {
                        System.out.print("Digite o nome do produto: ");
                    String nomedoproduto = entrada.next();
                    if (nomedoprodutoeseuspreços.containsKey(nomedoproduto)) {
                        nomedoprodutoeseuspreços.remove(nomedoproduto, nomedoprodutoeseuspreços.get(nomedoproduto));
                        System.out.println("\033[32mPreço removido com sucesso!\033[m");
                        break;
                    }
                    else if (!nomedoprodutoeseuspreços.containsKey(nomedoproduto)) {
                        System.err.println("\033[31mProduto não encontrado! Digite um produto existente válido.\033[m");
                        break;
                        }
                    }
                } 
                else if (opc == 0) {
                    System.out.println("\033[32mSaída concluída com sucessso!\033[m");
                    break;
                }
                else {
                    System.err.println("\033[31mERRO: Opção inválida.\033[m");
                }
            }
            entrada.close();
        }
    public static void Opcao6doMenu() {
        Queue <String> filadepedidos = new LinkedList<>();
        Scanner entrada = new Scanner(System.in);
         while (true) {
        System.out.println("===== FILA DE PEDIDOS =====");
        System.out.println("1 - Adicionar pedido");
        System.out.println("2 - Ver próximo pedido");
        System.out.println("3 - Preparar próximo pedido");
        System.out.println("4 - Mostrar fila");
        System.out.println("0 - Voltar");
        System.out.println("======================");
        System.out.print("Digite a opção desejada: ");
        int opc = entrada.nextInt();
        entrada.nextLine();
        System.out.println("======================");
        if (opc == 1) {
            System.out.print("Digite o pedido: ");
            String pedido = entrada.next();
            filadepedidos.add(pedido);
            System.out.println("\033[32mPedido adicionado à fila com sucesso!\033[m");
        } else if (opc == 2) {
            if (!filadepedidos.isEmpty()) {
                System.out.println("Próximo pedido a ser entregue: " + filadepedidos.peek());
                System.out.println("\033[32mO próximo pedido está em preparação. Aguarde um pouco!\033[m");
            }
            else {
                System.out.println("\033[31mNão existem pedidos na fila!\033[m");
            }
        } else if (opc == 3) {
            if (!filadepedidos.isEmpty()) {
                System.out.println("Pedido preparado: " + filadepedidos.peek());
                filadepedidos.poll();
                System.out.println("\033[32mPedido removido com sucesso!\033[m");
            }
            else {
                System.out.println("\033[31mNão existem pedidos na fila!\033[m");
            }
        } else if (opc == 4) {
            int cont = 1;
            if (filadepedidos.size() > 0) {
              for (String valor : filadepedidos) {
                System.out.println(cont + "º - " + valor);
                cont++;
                }  
            } else {
                System.out.println("\033[31mA fila não possui pedidos no momento!\033[m");
            }
            
        } else if (opc == 0) {
            System.out.println("\033[32mSaída concluída com sucessso!\033[m");
                break;
        } else {
            System.err.println("\033[31mERRO: Opção inválida.\033[m");
            }  
        }
        entrada.close();
    }
    public static void main(String[] args) {
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
            Opcao1doMenu();
        } else if (opcao == 2) {
            Opcao2doMenu();
        } else if (opcao == 3) {
            Opcao3doMenu();
        } else if (opcao == 4) {
            Opcao4doMenu();
        } else if (opcao == 5) {
            Opcao5doMenu();
        } else if (opcao == 6) {
            Opcao6doMenu();
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
import java.util.ArrayList;
import java.util.Scanner;

public class listadecontatos {
    public static int VerificaOpcao(Scanner entradadevalores) {
        try {
          String valor = entradadevalores.nextLine();
        if (valor.trim().isEmpty()) {
            System.out.println("\033[31mERRO: Digite uma opção válida.\033[m");
            return -1;
        }
        return Integer.parseInt(valor.trim());  
        } catch (NumberFormatException erro) {
            System.out.println("\033[31mERRO: Digite um valor válido.\033[m");
            return -1;
        }
    }
    public static void main(String[] args) {
        ArrayList <String> contatos = new ArrayList<>();
        String nome;
        String telefone;
        Scanner entrada = new Scanner(System.in);
        while (true) {
        System.out.println("===== LISTA DE CONTATOS =====");
        System.out.println("1 - Adicionar contato");
        System.out.println("2 - Mostrar contato");
        System.out.println("0 - Sair");
        System.out.println("=============================");
        System.out.print("Digite a opção desejada: ");
        int opcao = VerificaOpcao(entrada);
        if (opcao == -1) {
            continue;
        } if (opcao > 2 || opcao < 0) {
            System.out.println("\033[31mERRO: Digite valores entre 0 e 2!\033[m");
        } else if (opcao == 1) {
            System.out.println("===== ADICIONAR CONTATO =====");
            while (true) {
                System.out.print("Nome: ");
                nome = entrada.nextLine();
                if (nome.trim().isEmpty()) {
                    System.out.println("\033[31mERRO: Digite um nome válido.\033[m");
                    continue;
                } else {
                    break;
                    } 
                }
            while (true) {
                System.out.print("Telefone: ");
                telefone = entrada.nextLine();
                if (telefone.length() != 11) {
                    System.out.println("\033[31mERRO: Telefone inválido. Digite um telefone válido.\033[m");
                    continue;
                }
                break;
            }
            contatos.add("Nome do Contato: " + nome + " -> " + "Telefone de contato: " + telefone);
            System.out.println("\033[32mContato adicionado com sucesso!\033[m");
        } else if (opcao == 2) {
            if (contatos.size() == 0) {
                System.out.println("\033[31mNão há contatos cadastrados no sistema ainda!\033[m");
            }
            else {
                for (String contato : contatos) {
                    System.out.println("Contato = " + contato);
                }
            }
        } else if (opcao == 0) {
            System.out.println("\033[32mPrograma finalizado com sucesso. Volte Sempre!\033[m");
            System.out.println("=============================");
            break;
            }
        }
    }
}
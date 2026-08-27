import java.util.ArrayList;
import java.util.Scanner;
public class operadoresmat {
    public static int SomarValores(int n1, int n2) {
        return n1 + n2;
    }
    public static int SubtrairValores(int n1, int n2) {
        return n1 - n2;
    }
    public static int MultiplicarValores (int n1, int n2) {
        return n1*n2;
    }
    public static int VerificaInt(Scanner entradadevalores, String msg) {
        while (true) {
            try {
               System.out.print(msg);
            String num = entradadevalores.nextLine();
            if (num.trim().isEmpty()) {
            System.out.println("\033[31mERRO: Digite um número inteiro válido.\033[m");
            continue;
            }  
            int numero = Integer.parseInt(num.trim());
            if (numero < 0) {
                System.out.println("\033[31mValor inválido: Digite um número inteiro positivo!\033[m");
                continue;
            }  
            return numero;
            } catch (NumberFormatException erro) {
                System.out.println("\033[31mERRO: Digite um número inteiro válido.\033[m");
            }
        }
    }
    public static int VerificaEntrada(Scanner entradadevalores) {
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
    public static void main(String[] args) 
        {
        Scanner entrada = new Scanner(System.in);
        while (true) {
        System.out.println("=== MENU DA MATEMÁTICA ===");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("0 - Sair do programa");  
        System.out.print("Selecione a operação desejada: ");
        int opcao = VerificaEntrada(entrada);
        if (opcao > 4 || opcao < 0) {
            System.err.println("\033[31mValor inválido. Digite uma opção entre 0 e 4.\033[m");
        }
        switch (opcao) {
            case 1:
                // Parte da soma (feito)
                ArrayList<Integer> soma = new ArrayList<>();
                int num1soma = VerificaInt(entrada, "Digite o primeiro número: ");
                if (num1soma > 0 || num1soma < 0) {
                    soma.add(num1soma);
                }    
                int num2soma = VerificaInt(entrada, "Digite o segundo número: "); 
                if (num2soma > 0 || num2soma < 0) {
                    soma.add(num2soma);
                }
                System.out.println("A soma entre " + soma.get(0) + " + " + soma.get(1) +  " é " + SomarValores(soma.get(0), soma.get(1)) + ".");   
                break;            
            case 2:
                // Parte da subtração (feito)
                ArrayList<Integer> subtração = new ArrayList<>();
                int num1subtração = VerificaInt(entrada, "Digite o primeiro número: ");
                if (num1subtração > 0) {
                    subtração.add(num1subtração);
                } 
                int num2subtração = VerificaInt(entrada, "Digite o segundo número: "); 
                if (num2subtração > 0) {
                    subtração.add(num2subtração);
                } 
                System.out.println("A subtração entre " + subtração.get(0) + " - " + subtração.get(1) + " é " + SubtrairValores(num1subtração, num2subtração));
                break;
            case 3:
                // Parte da multiplicação (em andamento)
                break;
            case 4:
                // Parte da divisão (em andamento)
                break;
            }
            if (opcao == 0) {
                // Encerramento do programa
                System.out.println("\033[32mPrograma encerrado com sucesso. Volte sempre!\033[m");
                break;
            }
        }        
    }
}
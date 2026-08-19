import java.util.Scanner;

public class sistemadenotasdaturma {
    public static void sistemadealunos(Scanner entrada) {
    System.out.print("Quantos alunos deseja cadastrar? ");
    int qalunos = entrada.nextInt();
    int q = 0;
    for (q = 1; q <= qalunos; q++) {
        System.out.println("--- ALUNO " + q + " ---");
        System.out.println("Nome do Aluno: ");
        String aluno = entrada.next();
        System.out.print("Nota 1: ");
        float nota1 = entrada.nextFloat();
        System.out.print("Nota 2: ");
        float nota2 = entrada.nextFloat();
        System.out.print
        ("Nota 3: ");
        float nota3 = entrada.nextFloat();   
        System.out.println("");
        float média = (nota1 + nota2 + nota3) / 3; 
        System.out.println("=== RESULTADOS DO ALUNO ==="); 
        
        if (média >= 7) {
            String situaçãodoaluno = "Aprovado";
            System.out.println("Aluno: " + aluno);
            System.out.println("Média: " + média);
            System.out.println("Situação: " + situaçãodoaluno);
        }
        else if (6.9 >= média && média >= 5) {
            String situaçãodoaluno = "Em recuperação";
            System.out.println("Aluno: " + aluno);
            System.out.println("Média: " + média);
            System.out.println("Situação: " + situaçãodoaluno);
        }
        else if (média < 5 && média >= 0) {
            String situaçãodoaluno = "Reprovado";
            System.out.println("Aluno: " + aluno);
            System.out.println("Média: " + média);
            System.out.println("Situação: " + situaçãodoaluno);
        }
        else {
            System.err.println("Número inválido, tente novamente.");
        }
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        while (true) {
            System.out.println("========== MENU ==========");
            System.out.println("1 - Cadastrar alunos e Mostrar Resultados");
            System.out.println("0 - Sair");
            System.out.print("Digite a opção desejada: ");
            int opção = entrada.nextInt();
            if (opção == 0) {
            System.out.println
            ("Programa encerrado. Volte Sempre!");
                break;
            }         
            else if (opção == 1)  {
            sistemadealunos(entrada);
            }
            else {
                System.err.println("Valor inválido, tente novamente.");
            }
        }
    }
}
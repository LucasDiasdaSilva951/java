import java.util.Scanner;
class verificadordeidade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 

        System.out.println("Nome: ");
        String nome = entrada.nextLine(); 
        
        System.out.println("Idade: ");
        int idade = entrada.nextInt();

        if (idade >= 18) 
            System.out.println("Olá " + nome + ", Você é maior de idade!"); 
        else  
            System.out.println("Olá " + nome + ", Você é menor de idade!");
        entrada.close();
    }
}
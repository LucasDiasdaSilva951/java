import java.util.Scanner;

class contadoresgerais {
    public static void main(String[] args) {
        System.out.println("\n========= MENU PRINCIPAL =========");
        System.out.println("1 - Contar para frente");
        System.out.println("2 - Contar para trás");
        System.out.println("3 - Contar de X até Y");
        System.out.println("4 - Contar Pares");
        System.out.println("5 - Contar Ímpares");
        System.out.println("6 - Contar com passo");
        Scanner entrada = new Scanner(System.in);
        System.out.println("====================");
        System.out.print("Escolha uma opção: ");
        int opção = entrada.nextInt();
        System.out.println("====================");
        if (opção == 1) {
            System.out.print("Digite um número: "); 
            int número = entrada.nextInt();
            System.out.print("Contador progressivo: ");
            for (int i = 1; i <= número; i++) {
                System.out.print(i + " ");}
        } else if (opção == 2) {
            System.out.print("Digite um número: "); 
            int número = entrada.nextInt();
            System.out.print("Contador regressivo: ");
            int contador = número;
            while (contador >= 1) {
                System.out.print(contador + " "); 
                contador--;
            }
        } else if (opção == 3) {
            System.out.print("Digite o primeiro número: ");
            int n1 = entrada.nextInt();
            System.out.print("Digite o segundo número: ");
            int n2 = entrada.nextInt();
            if (n2 > n1) {
                System.out.print("Contador progressivo: ");
                for (int i = n1; i <= n2; i++) {
                    System.out.print(i + " ");
                } 
            } else if (n1 > n2) {
                System.out.print("Contador regressivo: ");
                int contador = n1;
                while (contador >= n2) {
                    System.out.print(contador + " "); 
                contador--;
                }
            }
        } else if (opção == 4) {
            int contador = 1;
            System.out.print("Qual o limite da contagem que você quer ter? ");
            int limite = entrada.nextInt();
            System.out.print("Contagem de números pares: ");
            do {
                if (contador % 2 == 0) {
                    System.out.print(contador +  " ");
                }
                contador++;
            } while (contador <= limite);
        } else if (opção == 5) {
            int contador = 1;
            System.out.print("Qual o limite da contagem que você quer ter? ");
            int limite = entrada.nextInt();
            System.out.print("Contagem de números ímpares: ");
            do {
                if (contador % 2 != 0) {
                    System.out.print(contador + " ");
                }
                contador++;
            } while (contador <= limite);
        } else if (opção == 6) {
            System.out.print("Digite o primeiro número: ");
            int n1 = entrada.nextInt();
            System.out.print("Digite o segundo número: ");
            int n2 = entrada.nextInt();
            System.out.print("Escolha o passo da contagem: ");
            int passo = entrada.nextInt();
            if (n2 > n1) {
                int contador = n1;
                System.out.print("Contador progressivo: ");
                do {
                    System.out.print(contador + " ");contador+=passo; 
                } 
                while (contador <= n2);
            } else if (n1 > n2) {
                int contador = n1;
                System.out.print("Contador regressivo: ");
                do {
                    System.out.print(contador + " ");
                    contador-=passo;
                } while (contador >= n2);
            }
        }
        entrada.close(); 
    } 
}  

public class númerospareseimpares {
    public static void main(String[] args) {
        int[] numeros = {10, 7, 4, 9, 2, 15};
        int pares = 0;
        int impares = 0;
        int somapares = 0;
        int somaimpares = 0;
        System.out.print("Contagem de números pares: ");
        for (int i = 0; i < numeros.
        length; i++) {
            if (numeros[i] % 2 == 0){
                System.out.print(numeros[i] + " ");
                pares++;
                somapares += numeros[i];
            }
            else {
                impares++;
                somaimpares += numeros[i];
            }
        }
    System.out.println("\nQuantidade de pares: " + pares);
    System.out.println("A soma total dos pares é " + somapares);
    System.out.println("Quantidade de ímpares: " + impares);
    System.out.println("A soma total dos ímpares é " + somaimpares);
    }
}

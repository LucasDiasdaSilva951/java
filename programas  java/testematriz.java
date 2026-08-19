public class testematriz {
    public static void main(String[] args) {
        int[][] matriz = {{3, 2, 7, 1}, {9, 11, 15, 13}, {12, 18, 6, 4}, {8, 5, 0, 10}};
        int somamatriz = 0;
        System.out.print("Matriz completa: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
                somamatriz = somamatriz + matriz[i][j];
            }
        }
    System.out.println("\nA soma dos elementos dessa matriz é " + somamatriz);
    }
}

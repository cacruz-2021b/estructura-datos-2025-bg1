package corte1;

public class MatricesDemo {

    public static void ejecutar() {
        System.out.println("=== Ejemplo de Matrices ===");

        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("Contenido de la matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int suma = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                suma += valor;
            }
        }

        System.out.println("Suma total: " + suma);
    }
}

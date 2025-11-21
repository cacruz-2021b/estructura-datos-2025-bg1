package corte1;

public class ArraysDemo {

    public static void ejecutar() {
        System.out.println("=== Ejemplo de Arreglos ===");

        int[] numeros = {5, 12, 3, 8, 1};

        System.out.println("Elementos del arreglo:");
        for (int n : numeros) {
            System.out.println(n);
        }

        int max = numeros[0];
        int min = numeros[0];
        int suma = 0;

        for (int n : numeros) {
            if (n > max) max = n;
            if (n < min) min = n;
            suma += n;
        }

        double promedio = (double) suma / numeros.length;

        System.out.println("Maximo: " + max);
        System.out.println("Minimo: " + min);
        System.out.println("Promedio: " + promedio);
    }
}

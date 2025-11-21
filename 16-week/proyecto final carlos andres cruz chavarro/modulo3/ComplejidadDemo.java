package corte3;

public class ComplejidadDemo {

    public static void ejecutar() {
        System.out.println("=== Complejidad Algorítmica ===");

        int n = 100000;

        long t1 = System.nanoTime();
        operacionLineal(n);
        long t2 = System.nanoTime();

        long t3 = System.nanoTime();
        operacionConstante();
        long t4 = System.nanoTime();

        System.out.println("Tiempo O(n): " + (t2 - t1) + " ns");
        System.out.println("Tiempo O(1): " + (t4 - t3) + " ns");
    }

    static void operacionLineal(int n) {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += i;
        }
    }

    static void operacionConstante() {
        int a = 1 + 1;
    }
}

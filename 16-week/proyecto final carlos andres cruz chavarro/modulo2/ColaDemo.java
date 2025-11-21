package corte2;

import java.util.LinkedList;
import java.util.Queue;

public class ColaDemo {

    public static void ejecutar() {
        System.out.println("=== Ejemplo de Cola (Queue) ===");

        Queue<String> cola = new LinkedList<>();

        cola.add("Cliente 1");
        cola.add("Cliente 2");
        cola.add("Cliente 3");

        System.out.println("Cola actual: " + cola);

        System.out.println("Atendiendo:");
        while (!cola.isEmpty()) {
            System.out.println("Atendido: " + cola.poll());
        }
    }
}

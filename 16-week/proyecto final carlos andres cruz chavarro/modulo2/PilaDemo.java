package corte2;

import java.util.Stack;

public class PilaDemo {

    public static void ejecutar() {
        System.out.println("=== Ejemplo de Pila (Stack) ===");

        Stack<String> pila = new Stack<>();

        pila.push("A");
        pila.push("B");
        pila.push("C");

        System.out.println("Contenido de la pila: " + pila);

        System.out.println("Elemento en la cima: " + pila.peek());

        System.out.println("Quitando elementos:");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }
    }
}

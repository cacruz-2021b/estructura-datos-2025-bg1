package corte1;

public class ListaSimpleDemo {

    static class Nodo {
        int dato;
        Nodo siguiente;

        Nodo(int d) {
            dato = d;
        }
    }

    public static void ejecutar() {
        System.out.println("=== Lista Enlazada Simple ===");

        Nodo head = new Nodo(10);
        head.siguiente = new Nodo(20);
        head.siguiente.siguiente = new Nodo(30);

        System.out.println("Elementos de la lista:");
        Nodo temp = head;
        while (temp != null) {
            System.out.println(temp.dato);
            temp = temp.siguiente;
        }
    }
}

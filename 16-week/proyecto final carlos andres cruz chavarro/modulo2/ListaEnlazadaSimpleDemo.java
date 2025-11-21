package corte2;

public class ListaEnlazadaSimpleDemo {

    static class Nodo {
        int dato;
        Nodo sig;

        Nodo(int d) {
            dato = d;
        }
    }

    public static void ejecutar() {
        System.out.println("=== Lista Enlazada Simple ===");

        Nodo n1 = new Nodo(1);
        Nodo n2 = new Nodo(2);
        Nodo n3 = new Nodo(3);

        n1.sig = n2;
        n2.sig = n3;

        Nodo temp = n1;
        System.out.println("Elementos:");
        while (temp != null) {
            System.out.println(temp.dato);
            temp = temp.sig;
        }
    }
}

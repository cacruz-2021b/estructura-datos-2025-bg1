package corte3;

public class BSTDemo {

    static class Nodo {
        int dato;
        Nodo izq, der;

        Nodo(int d) {
            dato = d;
        }
    }

    static Nodo raiz;

    public static void ejecutar() {
        System.out.println("=== Árbol Binario de Búsqueda ===");

        insertar(8);
        insertar(3);
        insertar(10);
        insertar(1);
        insertar(6);

        System.out.println("Recorrido InOrden:");
        inOrden(raiz);
        System.out.println();

        System.out.println("Buscando 6:");
        System.out.println(buscar(raiz, 6) ? "Encontrado" : "No encontrado");
    }

    static void insertar(int v) {
        raiz = insertarRec(raiz, v);
    }

    static Nodo insertarRec(Nodo r, int v) {
        if (r == null) return new Nodo(v);
        if (v < r.dato) r.izq = insertarRec(r.izq, v);
        else if (v > r.dato) r.der = insertarRec(r.der, v);
        return r;
    }

    static boolean buscar(Nodo r, int v) {
        if (r == null) return false;
        if (r.dato == v) return true;
        return v < r.dato ? buscar(r.izq, v) : buscar(r.der, v);
    }

    static void inOrden(Nodo r) {
        if (r != null) {
            inOrden(r.izq);
            System.out.print(r.dato + " ");
            inOrden(r.der);
        }
    }
}

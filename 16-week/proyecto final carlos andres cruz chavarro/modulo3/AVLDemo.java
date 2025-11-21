package corte3;

public class AVLDemo {

    static class Nodo {
        int dato, altura;
        Nodo izq, der;

        Nodo(int d) {
            dato = d;
            altura = 1;
        }
    }

    static Nodo raiz;

    public static void ejecutar() {
        System.out.println("=== Árbol AVL ===");

        insertar(30);
        insertar(20);
        insertar(40);
        insertar(10); // causa rotación

        System.out.println("Recorrido InOrden:");
        inOrden(raiz);
        System.out.println();
    }

    static int altura(Nodo n) {
        return n == null ? 0 : n.altura;
    }

    static int balance(Nodo n) {
        return n == null ? 0 : altura(n.izq) - altura(n.der);
    }

    static Nodo rotDer(Nodo y) {
        Nodo x = y.izq;
        Nodo t2 = x.der;

        x.der = y;
        y.izq = t2;

        y.altura = Math.max(altura(y.izq), altura(y.der)) + 1;
        x.altura = Math.max(altura(x.izq), altura(x.der)) + 1;

        return x;
    }

    static Nodo rotIzq(Nodo x) {
        Nodo y = x.der;
        Nodo t2 = y.izq;

        y.izq = x;
        x.der = t2;

        x.altura = Math.max(altura(x.izq), altura(x.der)) + 1;
        y.altura = Math.max(altura(y.izq), altura(y.der)) + 1;

        return y;
    }

    static void insertar(int v) {
        raiz = insertarRec(raiz, v);
    }

    static Nodo insertarRec(Nodo n, int v) {
        if (n == null) return new Nodo(v);

        if (v < n.dato)
            n.izq = insertarRec(n.izq, v);
        else if (v > n.dato)
            n.der = insertarRec(n.der, v);
        else
            return n;

        n.altura = 1 + Math.max(altura(n.izq), altura(n.der));
        int b = balance(n);

        if (b > 1 && v < n.izq.dato)
            return rotDer(n);

        if (b < -1 && v > n.der.dato)
            return rotIzq(n);

        if (b > 1 && v > n.izq.dato) {
            n.izq = rotIzq(n.izq);
            return rotDer(n);
        }

        if (b < -1 && v < n.der.dato) {
            n.der = rotDer(n.der);
            return rotIzq(n);
        }

        return n;
    }

    static void inOrden(Nodo n) {
        if (n != null) {
            inOrden(n.izq);
            System.out.print(n.dato + " ");
            inOrden(n.der);
        }
    }
}

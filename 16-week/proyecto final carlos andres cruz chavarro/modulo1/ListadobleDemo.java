public package corte1;

public class ListaDobleDemo {

    static class NodoD {
        int dato;
        NodoD ant;
        NodoD sig;

        NodoD(int d) {
            dato = d;
        }
    }

    public static void ejecutar() {
        System.out.println("=== Lista Doblemente Enlazada ===");

        NodoD n1 = new NodoD(5);
        NodoD n2 = new NodoD(15);
        NodoD n3 = new NodoD(25);

        n1.sig = n2;
        n2.ant = n1;
        n2.sig = n3;
        n3.ant = n2;

        System.out.println("Recorrido hacia adelante:");
        NodoD temp = n1;
        while (temp != null) {
            System.out.println(temp.dato);
            temp = temp.sig;
        }

        System.out.println("Recorrido hacia atras:");
        temp = n3;
        while (temp != null) {
            System.out.println(temp.dato);
            temp = temp.ant;
        }
    }
}
{
    
}

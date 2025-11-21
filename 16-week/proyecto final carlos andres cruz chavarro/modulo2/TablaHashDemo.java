package corte2;

import java.util.Hashtable;

public class TablaHashDemo {

    public static void ejecutar() {
        System.out.println("=== Ejemplo de Tabla Hash ===");

        Hashtable<Integer, String> tabla = new Hashtable<>();

        tabla.put(1, "Ana");
        tabla.put(2, "Luis");
        tabla.put(3, "Maria");

        System.out.println("Contenido de la tabla:");
        for (Integer clave : tabla.keySet()) {
            System.out.println("Clave: " + clave + "  Valor: " + tabla.get(clave));
        }

        System.out.println("Buscando clave 2:");
        if (tabla.containsKey(2)) {
            System.out.println("Encontrado: " + tabla.get(2));
        } else {
            System.out.println("No existe");
        }

        tabla.remove(1);
        System.out.println("Después de eliminar la clave 1:");

        for (Integer clave : tabla.keySet()) {
            System.out.println("Clave: " + clave + "  Valor: " + tabla.get(clave));
        }
    }
}

import java.util.Scanner;

import corte1.ArraysDemo;
import corte1.MatricesDemo;
import corte1.ListaSimpleDemo;
import corte1.ListaDobleDemo;

import corte2.PilaDemo;
import corte2.ColaDemo;
import corte2.ListaEnlazadaSimpleDemo;
import corte2.TablaHashDemo;

import corte3.BSTDemo;
import corte3.AVLDemo;
import corte3.ComplejidadDemo;

public class MenuPrincipal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("==== MENU PRINCIPAL ====");
            System.out.println("1. Corte 1");
            System.out.println("2. Corte 2");
            System.out.println("3. Corte 3");
            System.out.println("0. Salir");
            System.out.print("Seleccione: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    menuCorte1(sc);
                    break;

                case 2:
                    menuCorte2(sc);
                    break;

                case 3:
                    menuCorte3(sc);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);

        sc.close();
    }

    private static void menuCorte1(Scanner sc) {
        int op;
        do {
            System.out.println("=== CORTE 1 ===");
            System.out.println("1. Arrays");
            System.out.println("2. Matrices");
            System.out.println("3. Lista Simple");
            System.out.println("4. Lista Doble");
            System.out.println("0. Volver");
            System.out.print("Seleccione: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    ArraysDemo.ejecutar();
                    break;
                case 2:
                    MatricesDemo.ejecutar();
                    break;
                case 3:
                    ListaSimpleDemo.ejecutar();
                    break;
                case 4:
                    ListaDobleDemo.ejecutar();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        } while (op != 0);
    }

    private static void menuCorte2(Scanner sc) {
        int op;
        do {
            System.out.println("=== CORTE 2 ===");
            System.out.println("1. Pila");
            System.out.println("2. Cola");
            System.out.println("3. Lista Enlazada Simple");
            System.out.println("4. Tabla Hash");
            System.out.println("0. Volver");
            System.out.print("Seleccione: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    PilaDemo.ejecutar();
                    break;
                case 2:
                    ColaDemo.ejecutar();
                    break;
                case 3:
                    ListaEnlazadaSimpleDemo.ejecutar();
                    break;
                case 4:
                    TablaHashDemo.ejecutar();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        } while (op != 0);
    }

    private static void menuCorte3(Scanner sc) {
        int op;
        do {
            System.out.println("=== CORTE 3 ===");
            System.out.println("1. Árbol BST");
            System.out.println("2. Árbol AVL");
            System.out.println("3. Complejidad Algorítmica");
            System.out.println("0. Volver");
            System.out.print("Seleccione: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    BSTDemo.ejecutar();
                    break;
                case 2:
                    AVLDemo.ejecutar();
                    break;
                case 3:
                    ComplejidadDemo.ejecutar();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        } while (op != 0);
    }
}

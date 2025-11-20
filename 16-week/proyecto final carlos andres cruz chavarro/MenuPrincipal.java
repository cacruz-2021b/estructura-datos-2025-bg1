package src;

import java.util.Scanner;
import modulo1.*;
import modulo2.*;
import modulo3.*;

public class MenuPrincipal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int op;
        do{
            System.out.println("===== MENU PRINCIPAL =====");
            System.out.println("1. Corte 1");
            System.out.println("2. Corte 2");
            System.out.println("3. Corte 3");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            op = sc.nextInt();
            switch(op){
                case 1:
                    ArraysDemo1.ejecutar();
                    ListaSimpleDemo1.ejecutar();
                    ListaDobleDemo1.ejecutar();
                    LogicaBasicaDemo1.ejecutar();
                    break;
                case 2:
                    StackDemo.ejecutar();
                    QueueDemo.ejecutar();
                    HashTableDemo.ejecutar();
                    BinaryTreeDemo.ejecutar();
                    break;
                case 3:
                    AVLTreeDemo.ejecutar();
                    BSTDemo.ejecutar();
                    GraphDemo.ejecutar();
                    ComplejidadDemo.ejecutar();
                    break;
            }
        }while(op!=0);
        System.out.println("Fin del programa.");
    }
}

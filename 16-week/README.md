# Proyecto de Estructuras de Datos en Java

Este proyecto contiene implementaciones básicas de varias estructuras de datos en Java, organizadas en tres cortes académicos. Cada corte posee ejercicios independientes y un menú principal permite ejecutar cada uno desde consola.

## Estructura del Proyecto

proyecto-final/
├── src/
│   ├── MenuPrincipal.java
│   │
│   ├── corte1/
│   │   ├── ArraysDemo.java
│   │   ├── MatricesDemo.java
│   │   ├── ListaSimpleDemo.java
│   │   └── ListaDobleDemo.java
│   │
│   ├── corte2/
│   │   ├── PilaDemo.java
│   │   ├── ColaDemo.java
│   │   ├── ListaEnlazadaSimpleDemo.java
│   │   └── TablaHashDemo.java
│   │
│   └── corte3/
│       ├── BSTDemo.java
│       ├── AVLDemo.java
│       └── ComplejidadDemo.java
│
└── README.md

## Corte 1
Incluye implementaciones básicas:
- Arreglos
- Matrices
- Lista enlazada simple
- Lista doblemente enlazada

## Corte 2
Incluye estructuras lineales y tabla hash:
- Pila
- Cola
- Lista enlazada simple
- Tabla Hash

## Corte 3
Incluye estructuras avanzadas:
- Árbol binario de búsqueda (BST)
- Árbol AVL
- Medición básica de tiempos de ejecución

## Requisitos
- Java 17 o superior
- Visual Studio Code o cualquier IDE de Java

## Compilación y Ejecución

### Consola
1. Abrir la carpeta del proyecto
2. Compilar:

javac -d bin src/*.java src/corte1/*.java src/corte2/*.java src/corte3/*.java

3. Ejecutar:

java -cp bin MenuPrincipal

### Visual Studio Code
1. Abrir la carpeta del proyecto
2. Ejecutar MenuPrincipal.java con el botón Run

## Uso
El programa permite elegir entre los cortes y ejecutar cada ejercicio usando un menú interactivo en consola.

## Notas
El proyecto está organizado por carpetas y es totalmente funcional para prácticas académicas o para estudiar estructuras de datos en Java.

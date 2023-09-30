/* Autor. André Aguilar
Fecha. 30 de Septiembre 2023
Programa que recibe 20 numeros enteros del usuario y muestre cada elemento del arreglo
junto con su cuadrado y cubo*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arreglo[];
        arreglo = new int[20];
        Scanner sc = new Scanner(System.in);

        // Leer 20 números enteros desde el teclado y almacenarlos en el arreglo
        for (int i = 0; i < 20; i++) {
            System.out.println("Ingrese el numero " + (i + 1) + ": ");
            arreglo[i] = sc.nextInt();
        }

        // Mostrar cada elemento del arreglo junto con su valor al cuadrado y al cubo
        System.out.println("Número\tCuadrado\tCubo");
        for (int i = 0; i < arreglo.length; i++) {
            int numero = arreglo[i];
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;
            System.out.println(numero + "\t\t" + cuadrado + "\t\t\t" + cubo);
        }
    }
}

package ui;

import model.CalculadoraVenta;

import java.util.Scanner;

public class Main {

    public static CalculadoraVenta calc = new CalculadoraVenta();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        System.out.println("=== SISTEMA DE VENTAS DE TIENDA ===");

        while (!salir) {
            System.out.println("\n1. Agregar producto");
            System.out.println("2. Ver Total");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese precio del producto: ");
                    double precio = scanner.nextDouble();
                    calc.agregarProducto(precio);
                    break;
                case 2:
                    System.out.println("Total a pagar: $" + calc.calcularTotalFinal());
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
        scanner.close();
    }
}
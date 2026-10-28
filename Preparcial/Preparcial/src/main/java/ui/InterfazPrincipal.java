package ui;

import model.ListaEnlazadaDobleJuanGarcia;
import model.ListaEnlazadaSimpleJuanGarcia;
import model.NodoDobleJuanGarcia;
import model.NodoSimpleJuanGarcia;

public class InterfazPrincipal {

    public static void main(String[] args) {

        // ===== LISTA ENLAZADA SIMPLE =====
        System.out.println("=== LISTA ENLAZADA SIMPLE ===");
        ListaEnlazadaSimpleJuanGarcia<String> listaSimple = new ListaEnlazadaSimpleJuanGarcia<>();

        System.out.println("Antes: " + listaSimple.mostrarElementos());

        NodoSimpleJuanGarcia<String> s1 = new NodoSimpleJuanGarcia<>("A");
        NodoSimpleJuanGarcia<String> s2 = new NodoSimpleJuanGarcia<>("B");
        NodoSimpleJuanGarcia<String> s3 = new NodoSimpleJuanGarcia<>("C");
        NodoSimpleJuanGarcia<String> s4 = new NodoSimpleJuanGarcia<>("D");

        listaSimple.agregarNodoFinal(s1);
        listaSimple.agregarNodoFinal(s2);
        listaSimple.agregarNodoFinal(s3);
        System.out.println("Después de agregar al final A, B, C: " + listaSimple.mostrarElementos());

        listaSimple.agregarNodo(s4, 1);
        System.out.println("Después de agregar D en la posición 1: " + listaSimple.mostrarElementos());

        listaSimple.eliminarNodo(s2);
        System.out.println("Después de eliminar B: " + listaSimple.mostrarElementos());

        listaSimple.eliminarNodoFinal();
        System.out.println("Después de eliminar el nodo final: " + listaSimple.mostrarElementos());

        try {
            listaSimple.agregarNodo(new NodoSimpleJuanGarcia<>("X"), 10);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error controlado: " + e.getMessage());
        }

        // ===== LISTA ENLAZADA DOBLE =====
        System.out.println();
        System.out.println("=== LISTA ENLAZADA DOBLE ===");
        ListaEnlazadaDobleJuanGarcia<Integer> listDouble = new ListaEnlazadaDobleJuanGarcia<>();

        System.out.println("Antes: " + listDouble.mostrarElementos());

        NodoDobleJuanGarcia<Integer> d1 = new NodoDobleJuanGarcia<>(10);
        NodoDobleJuanGarcia<Integer> d2 = new NodoDobleJuanGarcia<>(20);
        NodoDobleJuanGarcia<Integer> d3 = new NodoDobleJuanGarcia<>(30);
        NodoDobleJuanGarcia<Integer> d4 = new NodoDobleJuanGarcia<>(15);

        listDouble.agregarNodoFinal(d1);
        listDouble.agregarNodoFinal(d2);
        listDouble.agregarNodoFinal(d3);
        System.out.println("Después de agregar al final 10, 20, 30: " + listDouble.mostrarElementos());

        listDouble.agregarNodo(d4, 1);
        System.out.println("Después de agregar 15 en la posición 1: " + listDouble.mostrarElementos());

        listDouble.eliminarNodo(d2);
        System.out.println("Después de eliminar 20: " + listDouble.mostrarElementos());

        listDouble.eliminarNodoFinal();
        System.out.println("Después de eliminar el nodo final: " + listDouble.mostrarElementos());

        try {
            listDouble.agregarNodo(new NodoDobleJuanGarcia<>(99), -1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error controlado: " + e.getMessage());
        }
    }
}
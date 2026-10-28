package model;

public class ListaEnlazadaSimpleJuanGarcia<T> {

    private NodoSimpleJuanGarcia<T> cabeza;
    private int tamanio;

    public ListaEnlazadaSimpleJuanGarcia() {
        this.cabeza = null;
        this.tamanio = 0;
    }

    public int getTamanio() {
        return tamanio;
    }

    public String mostrarElementos() {
        if (cabeza == null) {
            return "Lista vacía";
        }
        StringBuilder sb = new StringBuilder();
        NodoSimpleJuanGarcia<T> actual = cabeza;
        while (actual != null) {
            sb.append(actual.getDato());
            if (actual.getSiguiente() != null) {
                sb.append(" -> ");
            }
            actual = actual.getSiguiente();
        }
        return sb.toString();
    }

    public void eliminarNodoFinal() {
        if (cabeza == null) {
            return; // lista vacía: no hay nada que eliminar
        }
        if (cabeza.getSiguiente() == null) {
            cabeza = null; // un solo nodo
        } else {
            NodoSimpleJuanGarcia<T> actual = cabeza;
            while (actual.getSiguiente().getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(null);
        }
        tamanio--;
    }

    public void eliminarNodo(model.NodoSimpleJuanGarcia nodo) {
        if (nodo == null || cabeza == null) {
            return;
        }
        if (cabeza == nodo) {
            cabeza = cabeza.getSiguiente();
            nodo.setSiguiente(null);
            tamanio--;
            return;
        }
        NodoSimpleJuanGarcia<T> actual = cabeza;
        while (actual.getSiguiente() != null && actual.getSiguiente() != nodo) {
            actual = actual.getSiguiente();
        }
        if (actual.getSiguiente() == nodo) {
            actual.setSiguiente(nodo.getSiguiente());
            nodo.setSiguiente(null);
            tamanio--;
        }
        // si no se encontró el nodo, no se hace nada
    }

    public void agregarNodoFinal(model.NodoSimpleJuanGarcia nodo) {
        if (nodo == null) {
            return;
        }
        nodo.setSiguiente(null);
        if (cabeza == null) {
            cabeza = nodo;
        } else {
            NodoSimpleJuanGarcia<T> actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nodo);
        }
        tamanio++;
    }

    /**
     * Agrega un nodo en la posición indicada (la primera posición es 0).
     * Posiciones válidas: de 0 a tamaño de la lista (inclusive).
     */
    public void agregarNodo(model.NodoSimpleJuanGarcia nodo, int posicion) {
        if (nodo == null) {
            return;
        }
        if (posicion < 0 || posicion > tamanio) {
            throw new IndexOutOfBoundsException(
                    "Posición inválida: " + posicion + " (tamaño de la lista: " + tamanio + ")");
        }
        if (posicion == 0) {
            nodo.setSiguiente(cabeza);
            cabeza = nodo;
        } else {
            NodoSimpleJuanGarcia<T> anterior = cabeza;
            for (int i = 0; i < posicion - 1; i++) {
                anterior = anterior.getSiguiente();
            }
            nodo.setSiguiente(anterior.getSiguiente());
            anterior.setSiguiente(nodo);
        }
        tamanio++;
    }
}
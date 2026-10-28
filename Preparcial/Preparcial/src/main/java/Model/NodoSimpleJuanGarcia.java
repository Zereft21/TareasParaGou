package model;

public class NodoSimpleJuanGarcia<T> {

    private T dato;
    private NodoSimpleJuanGarcia<T> siguiente;

    public NodoSimpleJuanGarcia(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoSimpleJuanGarcia<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSimpleJuanGarcia<T> siguiente) {
        this.siguiente = siguiente;
    }
}
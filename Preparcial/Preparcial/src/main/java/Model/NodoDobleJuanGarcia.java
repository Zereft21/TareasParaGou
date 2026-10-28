package model;

public class NodoDobleJuanGarcia<T> {

    private T dato;
    private NodoDobleJuanGarcia<T> siguiente;
    private NodoDobleJuanGarcia<T> anterior;

    public NodoDobleJuanGarcia(T dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoDobleJuanGarcia<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDobleJuanGarcia<T> siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDobleJuanGarcia<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDobleJuanGarcia<T> anterior) {
        this.anterior = anterior;
    }
}
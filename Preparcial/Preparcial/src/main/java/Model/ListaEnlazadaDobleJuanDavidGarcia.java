package Model;

class ListaEnlazadaDobleJuanGarcia<T> {

    private model.NodoDobleJuanGarcia<T> cabeza;
    private model.NodoDobleJuanGarcia<T> cola;
    private int tamanio;

    public ListaEnlazadaDobleJuanGarcia() {
        this.cabeza = null;
        this.cola = null;
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
        model.NodoDobleJuanGarcia<T> actual = cabeza;
        while (actual != null) {
            sb.append(actual.getDato());
            if (actual.getSiguiente() != null) {
                sb.append(" <-> ");
            }
            actual = actual.getSiguiente();
        }
        return sb.toString();
    }

    public void eliminarNodoFinal() {
        if (cola == null) {
            return; // lista vacía: no hay nada que eliminar
        }
        if (cabeza == cola) {
            cabeza = null; // un solo nodo
            cola = null;
        } else {
            model.NodoDobleJuanGarcia<T> nuevaCola = cola.getAnterior();
            nuevaCola.setSiguiente(null);
            cola.setAnterior(null);
            cola = nuevaCola;
        }
        tamanio--;
    }

    public void eliminarNodo(model.NodoDobleJuanGarcia nodo) {
        if (nodo == null || cabeza == null) {
            return;
        }
        // Verifica que el nodo pertenezca a la lista
        model.NodoDobleJuanGarcia<T> actual = cabeza;
        while (actual != null && actual != nodo) {
            actual = actual.getSiguiente();
        }
        if (actual == null) {
            return; // el nodo no está en la lista
        }

        model.NodoDobleJuanGarcia<T> previo = nodo.getAnterior();
        model.NodoDobleJuanGarcia<T> proximo = nodo.getSiguiente();

        if (previo == null) {
            cabeza = proximo; // se elimina la cabeza
        } else {
            previo.setSiguiente(proximo);
        }

        if (proximo == null) {
            cola = previo; // se elimina la cola
        } else {
            proximo.setAnterior(previo);
        }

        nodo.setAnterior(null);
        nodo.setSiguiente(null);
        tamanio--;
    }

    public void agregarNodoFinal(model.NodoDobleJuanGarcia nodo) {
        if (nodo == null) {
            return;
        }
        nodo.setSiguiente(null);
        nodo.setAnterior(null);
        if (cabeza == null) {
            cabeza = nodo;
            cola = nodo;
        } else {
            cola.setSiguiente(nodo);
            nodo.setAnterior(cola);
            cola = nodo;
        }
        tamanio++;
    }

    /**
     * Agrega un nodo en la posición indicada (la primera posición es 0).
     * Posiciones válidas: de 0 a tamaño de la lista (inclusive).
     */
    public void agregarNodo(model.NodoDobleJuanGarcia nodo, int posicion) {
        if (nodo == null) {
            return;
        }
        if (posicion < 0 || posicion > tamanio) {
            throw new IndexOutOfBoundsException(
                    "Posición inválida: " + posicion + " (tamaño de la lista: " + tamanio + ")");
        }
        if (posicion == tamanio) {
            agregarNodoFinal(nodo);
            return;
        }
        if (posicion == 0) {
            nodo.setAnterior(null);
            nodo.setSiguiente(cabeza);
            cabeza.setAnterior(nodo);
            cabeza = nodo;
        } else {
            model.NodoDobleJuanGarcia<T> actual = cabeza;
            for (int i = 0; i < posicion; i++) {
                actual = actual.getSiguiente();
            }
            model.NodoDobleJuanGarcia<T> previo = actual.getAnterior();
            nodo.setAnterior(previo);
            nodo.setSiguiente(actual);
            previo.setSiguiente(nodo);
            actual.setAnterior(nodo);
        }
        tamanio++;
    }
}
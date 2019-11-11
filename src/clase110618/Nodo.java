package clase110618;

public class Nodo {

    public Object dato;
    public Nodo siguiente;

    public Nodo(Object dato, Nodo siguiente) {
        setDato(dato);
        setSiguiente(siguiente);
    }

    public Nodo(Object dato) {
        this(dato, null);
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /*public Object getdDato() {
        return dato;
    }*/
/*
    public Nodo getSiguiente() {
        return siguiente;
    }*/

}

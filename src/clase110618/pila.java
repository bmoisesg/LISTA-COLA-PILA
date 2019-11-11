
package clase110618;

class Pila extends Lista {

    public Pila() {
        System.out.println("soy una pila...");
    }

    public void push(Object dato) {
        super.insertarAlFreente(dato);
    }

    public Object pop() {
        return super.eliminarAlfrente();
    }

    public boolean estavacia() {
        return super.estaVacia();
    }

    public void imprimir() {
        super.imprimir();
    }
}

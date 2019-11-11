
package clase110618;


 class cola extends Lista{
    
    public cola() {
        System.out.println("soy una cola...");
    }

    public void agregar(Object dato) {
        super.insertarAlFreente(dato);
    }

    public Object sacar() {
        return super.eliminarAlFinal();
    }

    public boolean estavacia() {
        return super.estaVacia();
    }

    public void imprimir() {
        super.imprimir();
    }
}

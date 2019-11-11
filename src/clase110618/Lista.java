package clase110618;



class Lista {

    private String nombre;
    private Nodo ini, fin;

    public Lista(String nombre) {
        this.nombre = nombre;
        System.out.println(nombre);
        ini = fin;
    }

    public Lista() {
        this("mi lista");
    }

    public boolean estaVacia() {
        return null == ini;
    }

    public void insertarAlFreente(Object dato) {
        if (estaVacia()) {
            ini = fin = new Nodo(dato);
        } else {
            ini = new Nodo(dato, ini);

        }
    }

    public void insertarAlFinal(Object dato) {
        if (estaVacia()) {
            ini = fin = new Nodo(dato);
        } else {
            fin = fin.siguiente = new Nodo(dato, null);

        }
    }

    public Object eliminarAlfrente() {

        Object dato = null;
        if (estaVacia()) {
            System.out.println("esta vacia...");
        }
        if (ini == null && fin==null) {

            return dato;
        }
        if (ini == fin) {
            dato = ini.dato;
            ini = fin = null;
            System.out.println("ya no hay elementos...");
        } else {
            dato = ini.dato;
            ini = ini.siguiente;

        }

        return dato;

    }

    public Object eliminarAlFinal() {
        Nodo actual = ini;

        while (actual != null) {
            if (ini == fin) {
                ini = fin = null;
                break;
            }

            if (actual.siguiente == fin) {
                fin = actual;
                fin.siguiente = null;
                break;
            }
            actual = actual.siguiente;
        }
        return 0;

    }

    public void imprimir() {
        if (ini == null) {
            System.out.println("esta vacia");
        } else {
            Nodo actual = ini;
            while (actual != null) {
                System.out.println(actual.dato);
                actual = actual.siguiente;

            }
        }
    }

}

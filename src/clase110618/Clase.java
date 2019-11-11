package clase110618;

public class Clase {

    public static void main(String[] args) {
        
        Lista lista = new Lista("listaEDD");

        lista.insertarAlFreente(5);
        lista.insertarAlFreente(10);
        lista.insertarAlFinal(17);
        lista.insertarAlFreente(100);
        lista.imprimir();

        System.out.println("------");
        lista.eliminarAlfrente();
        lista.imprimir();

        System.out.println("------");
        lista.eliminarAlFinal();
        lista.imprimir();

        System.out.println("------");
        lista.eliminarAlFinal();
        lista.imprimir();

        System.out.println("------");
        lista.eliminarAlFinal();
        lista.imprimir();


         
        /*
        Pila pila = new Pila();
        pila.push(10);
        pila.push(4);
       
       
        pila.imprimir();
        System.out.println("-------");

        pila.pop();
        pila.imprimir();
        System.out.println("-------");

        pila.pop();
        pila.imprimir();
        System.out.println("-------");
        pila.pop();
        pila.imprimir();
        System.out.println("-------");
         */

        /*
        cola micola = new cola();
        micola.agregar(12);
        micola.agregar(22);
        micola.agregar(14);
        micola.imprimir();

        System.out.println("-------");
        micola.sacar();
        micola.imprimir();
        System.out.println("-------");
        micola.sacar();
        micola.imprimir();
         */
    }

}

class Nodo {
    char dato;
    Nodo siguiente;

    public Nodo(char dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

class Pila {
    private Nodo cima;

    public Pila() {
        this.cima = null;
    }

    public void push(char x) {
        Nodo nuevoNodo = new Nodo(x);  
        nuevoNodo.siguiente = cima;   
        cima = nuevoNodo;              
    }

    public char pop() {
        char valor = cima.dato;             
        cima = cima.siguiente;             
        return valor;                       
    }

    // Función que verifica si la pila está vacía
    public boolean pilaVacia() {
        return cima == null;
    }

    // Función que recorre y muestra los elementos de la pila
    public void mostrarPila() {
        if (pilaVacia()) {
            System.out.println("La pila está vacía");
        } else {
            Nodo nodoActual = cima;
            while (nodoActual != null) {
                System.out.print(nodoActual.dato + " ");
                nodoActual = nodoActual.siguiente;
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Pila pila = new Pila();  // Inicializa la pila
        System.out.println("Haciendo push: Hola");
        pila.push('H');  // Inserta 'H' en la pila
        pila.push('o');  // Inserta 'o' en la pila
        pila.push('l');  // Inserta 'l' en la pila
        pila.push('a');  // Inserta 'a' en la pila

        System.out.println("Recorriendo la pila");
        pila.mostrarPila();  // Muestra los elementos de la pila

        for (int i = 0; i < 4; i++) {
            System.out.println("Haciendo pop: " + pila.pop());  // Elimina y muestra cada valor
        }

        if (pila.pilaVacia()) {
            System.out.println("La pila está vacía");
        }
    }
}

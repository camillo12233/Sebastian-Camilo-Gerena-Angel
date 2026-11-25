class Nodo {
    int dato;
    Nodo siguiente;

    Nodo(int dato) {
        this.dato = dato;
    }
}

public class ListaSimple {
    private Nodo cabeza;

    // O(1): enlaza el nuevo nodo con la cabeza actual y lo convierte en cabeza
    public void insertarInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }

    // O(n): recorre hasta el último nodo y lo enlaza con el nuevo
    public void insertarFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }
        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevo;
    }

    // O(n): recorre desde la cabeza hasta null mostrando cada dato
    public void imprimir() {
        for (Nodo actual = cabeza; actual != null; actual = actual.siguiente) {
            System.out.print(actual.dato + " -> ");
        }
        System.out.println("null");
    }

    // Ejemplo para probar la lista
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();

        System.out.println("Lista vacía:");
        lista.imprimir();                 // null

        lista.insertarInicio(20);
        lista.insertarInicio(10);
        lista.insertarFinal(30);

        System.out.println("Después de insertar 20, 10 al inicio y 30 al final:");
        lista.imprimir();                 // 10 -> 20 -> 30 -> null
    }
}

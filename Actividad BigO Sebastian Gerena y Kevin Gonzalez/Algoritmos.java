public class Main {

    public static void main(String[] args) {
        int[] datos = {10, 20, 30};

        System.out.println("--- Ejercicio 1: O(1) ---");
        mostrarPrimero(datos);

        System.out.println("--- Ejercicio 2: O(n) ---");
        mostrarElementos(datos);

        System.out.println("--- Ejercicio 3: O(n^2) ---");
        compararTodos(datos);

        System.out.println("--- Ejercicio 4: O(log n) ---");
        reducir(16);

        System.out.println("--- Ejercicio 5: O(n log n) ---");
        ejemploNLogN(8);
        System.out.println("(no imprime nada, solo hace el trabajo)");

        System.out.println("--- Experimento: tiempos ---");
        int[] tamanos = {100, 1_000, 5_000, 10_000};
        System.out.println("n\tO(n) ns\tO(n^2) ns");
        for (int n : tamanos) {
            long inicioLineal = System.nanoTime();
            algoritmoLineal(n);
            long tiempoLineal = System.nanoTime() - inicioLineal;

            long inicioCuadratico = System.nanoTime();
            algoritmoCuadratico(n);
            long tiempoCuadratico = System.nanoTime() - inicioCuadratico;

            System.out.println(n + "\t" + tiempoLineal + "\t" + tiempoCuadratico);
        }
    }

    // Ejercicio 1
    public static void mostrarPrimero(int[] datos) {
        System.out.println(datos[0]);
    }

    // Ejercicio 2
    public static void mostrarElementos(int[] datos) {
        for (int i = 0; i < datos.length; i++) {
            System.out.println(datos[i]);
        }
    }

    // Ejercicio 3
    public static void compararTodos(int[] datos) {
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos.length; j++) {
                System.out.println(datos[i] + " - " + datos[j]);
            }
        }
    }

    // Ejercicio 4
    public static void reducir(int n) {
        while (n > 1) {
            n = n / 2;
            System.out.println(n);
        }
    }

    // Ejercicio 5
    public static void ejemploNLogN(int n) {
        for (int i = 0; i < n; i++) {
            int valor = n;
            while (valor > 1) {
                valor = valor / 2;
            }
        }
    }

    // Experimento: Algoritmo A
    public static long algoritmoLineal(int n) {
        long contador = 0;
        for (int i = 0; i < n; i++) {
            contador++;
        }
        return contador;
    }

    // Experimento: Algoritmo B
    public static long algoritmoCuadratico(int n) {
        long contador = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                contador++;
            }
        }
        return contador;
    }
}
public class Main {
    public static void main(String[] args) {
        probarEstudiantes();
        System.out.println("-----------------------------");
        probarProductos();
    }

    public static void probarEstudiantes() {
        int semestre = 3;
        double notaMinima = 3.0;
        boolean activo = true;

        Estudiante estudiante1 = new Estudiante("Laura", 20, 4.2);
        Estudiante estudiante2 = new Estudiante("Carlos", 22, 3.8);

        Estudiante copia = estudiante1;
        copia.setPromedio(4.8);
        System.out.println("Promedio estudiante1: " + estudiante1.getPromedio());
        System.out.println("Promedio copia: " + copia.getPromedio());

        procesarEstudiante(estudiante2);

        estudiante1 = null;
        copia = null;

        System.gc();
        System.out.println("Prueba de estudiantes finalizada.");
    }

    public static void probarProductos() {
        Producto p1 = new Producto(101, "Teclado Mecánico", 150000.0);
        Producto p2 = new Producto(102, "Mouse Inalámbrico", 85000.0);
        Producto p3 = new Producto(103, "Monitor 24\"", 720000.0);

        Producto refP1 = p1;
        refP1.setPrecio(165000.0);

        System.out.println("Precio p1: " + p1.getPrecio());
        System.out.println("Precio refP1: " + refP1.getPrecio());

        p2.actualizarPrecio(95000.0);
        p2.mostrarDatos();
        System.out.println("Producto p3: " + p3.getNombre() + " - " + p3.getPrecio());

        p1 = null;
        refP1 = null;
        System.gc();
        System.out.println("Prueba de productos finalizada.");
    }

    public static void procesarEstudiante(Estudiante estudiante) {
        int puntosExtra = 1;
        double nuevoPromedio = estudiante.getPromedio() + 0.2;
        estudiante.setPromedio(nuevoPromedio);
        estudiante.mostrarDatos();
        System.out.println("Puntos extra: " + puntosExtra);
    }
}
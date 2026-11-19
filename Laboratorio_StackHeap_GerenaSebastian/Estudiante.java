public class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;

    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void mostrarDatos() {
        System.out.println(nombre + " - " + edad + " años - Promedio: " + promedio);
    }

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Laura", 20, 4.2);
        e1.mostrarDatos();

        Estudiante ref = e1;
        ref.setPromedio(4.8);
        System.out.println("Promedio e1: " + e1.getPromedio());
        System.out.println("Promedio ref: " + ref.getPromedio());
    }
}
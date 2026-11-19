public class Producto {
    private int codigo;
    private String nombre;
    private double precio;

    public Producto(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void actualizarPrecio(double nuevoPrecio) {
        double precioAnterior = this.precio;
        this.precio = nuevoPrecio;
        System.out.println("Precio actualizado de " + precioAnterior + " a " + this.precio);
    }

    public void mostrarDatos() {
        System.out.println("[" + codigo + "] " + nombre + " - $" + precio);
    }

    public static void main(String[] args) {
        Producto p1 = new Producto(101, "Teclado Mecánico", 150000.0);
        p1.mostrarDatos();

        Producto ref = p1;
        ref.setPrecio(165000.0);
        System.out.println("Precio p1: " + p1.getPrecio());
        System.out.println("Precio ref: " + ref.getPrecio());
    }
}
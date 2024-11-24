
package taller.pkg4.pkg1.pkg1.lpoo;

// Subclase: Vendedor
public class Vendedor extends Usuario {

    public Vendedor(String nombre) {
        super(nombre);
    }

    @Override
    public void gestionar() {
        System.out.println(nombre + " está gestionando su lista de productos.");
    }

    public void listarProductos() {
        System.out.println("Mostrando todos los productos del vendedor: " + nombre);
    }

    public void verEstadisticas() {
        System.out.println("Mostrando estadísticas de ventas para: " + nombre);
    }
}

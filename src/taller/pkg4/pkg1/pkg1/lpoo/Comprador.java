
package taller.pkg4.pkg1.pkg1.lpoo;

// Subclase: Comprador
public class Comprador extends Usuario {

    public Comprador(String nombre) {
        super(nombre);
    }

    @Override
    public void gestionar() {
        System.out.println(nombre + " está gestionando sus compras.");
    }

    // Sobrecarga de método: buscarProducto
    public void buscarProducto(String categoria) {
        System.out.println("Buscando productos en la categoría: " + categoria);
    }

    public void buscarProducto(String categoria, double precioMaximo) {
        System.out.println("Buscando productos en la categoría: " + categoria + 
                           " con un precio máximo de: $" + precioMaximo);
    }
}

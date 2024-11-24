
package taller.pkg4.pkg1.pkg1.lpoo;

// Clase principal para probar el sistema
public class SistemaEcommerce {
    public static void main(String[] args) {
        // Crear instancias de cada tipo de usuario
        Usuario comprador = new Comprador("Laura");
        Usuario vendedor = new Vendedor("Carlos");
        Usuario administrador = new Administrador("Ana");

        // Polimorfismo: gestionar() se comporta de manera diferente
        comprador.gestionar();
        vendedor.gestionar();
        administrador.gestionar();

        // Cast explícito para acceder a métodos específicos
        ((Comprador) comprador).buscarProducto("Electrónica");
        ((Comprador) comprador).buscarProducto("Electrónica", 500.0);

        ((Vendedor) vendedor).listarProductos();
        ((Vendedor) vendedor).verEstadisticas();

        ((Administrador) administrador).gestionarUsuarios();
        ((Administrador) administrador).asignarPermisos();
    }
}

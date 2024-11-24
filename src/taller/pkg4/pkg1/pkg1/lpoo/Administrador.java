
package taller.pkg4.pkg1.pkg1.lpoo;

// Subclase: Administrador
public class Administrador extends Usuario {

    public Administrador(String nombre) {
        super(nombre);
    }

    @Override
    public void gestionar() {
        System.out.println(nombre + " está gestionando usuarios y permisos.");
    }

    public void gestionarUsuarios() {
        System.out.println("Gestionando todos los usuarios del sistema.");
    }

    public void asignarPermisos() {
        System.out.println("Asignando permisos a los usuarios.");
    }
}

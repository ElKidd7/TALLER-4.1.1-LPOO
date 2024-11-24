
package taller.pkg4.pkg1.pkg1.lpoo;

// Clase base: Usuario
public abstract class Usuario {
    protected String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void iniciarSesion() {
        System.out.println(nombre + " ha iniciado sesión.");
    }

    public void verPerfil() {
        System.out.println("Perfil de " + nombre);
    }

    // Método abstracto que será implementado en las subclases
    public abstract void gestionar();
}

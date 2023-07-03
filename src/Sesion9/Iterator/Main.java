package Sesion9.Iterator;

public class Main {
    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios();
        usuarios.crear(new Usuario("uno", 27));
        usuarios.crear(new Usuario("dos", 24));
        usuarios.crear(new Usuario("tres", 25));
        usuarios.crear(new Usuario("cuatro", 15));

        while (usuarios.hayMas()) {
            Usuario usuario = usuarios.siguiente();
            System.out.println(usuario);
        }

        usuarios.crear(new Usuario("cinco", 22));
        Usuario usuario = usuarios.siguiente();
        System.out.println(usuario);
    }
}

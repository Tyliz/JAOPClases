package Sesion9.Strategy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int tipo = 0;
        Usuarios usuarios;
        if (tipo == 0) {
            usuarios = new UsuariosFichero();
        } else {
            usuarios = new UsuariosMemoria();
        }

        crear(usuarios, "Jhen");
        crear(usuarios, "Lux");
        crear(usuarios, "Alana");
        crear(usuarios, "Jhon");

        listar(usuarios).forEach(usuario -> System.out.println(usuario));
    }

    public static void crear(Usuarios usuarios, String nombre) {
        usuarios.crear(nombre);
    }

    public static ArrayList<String> listar(Usuarios usuarios) {
        return usuarios.listar();
    }
}

package Sesion9.Strategy;

import java.util.ArrayList;

public class UsuariosMemoria implements Usuarios {
    private ArrayList<String> lstUsuarios = new ArrayList<>();

    public void crear(String nombre) {
        lstUsuarios.add(nombre);
    }

    public ArrayList<String> listar() {
        return lstUsuarios;
    }
}

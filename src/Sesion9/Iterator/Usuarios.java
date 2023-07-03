package Sesion9.Iterator;

import java.util.ArrayList;

public class Usuarios implements UsuarioIterator {
    private ArrayList<Usuario> lstUsuarios = new ArrayList<Usuario>();
    private int posicion = 0;

    public void crear(Usuario usuario) {
        lstUsuarios.add(usuario);
    }

    @Override
    public Usuario siguiente() {
        Usuario usuario = lstUsuarios.get(posicion);
        posicion++;
        return usuario;
    }

    @Override
    public boolean hayMas() {
        return posicion < lstUsuarios.size();
    }

    @Override
    public void reinicia() {
        posicion = 0;
    }
}

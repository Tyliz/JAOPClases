package Sesion9.State;

public class EstadoTomandoFoto extends Estado {
    public EstadoTomandoFoto(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "El teléfono se ya encuentra desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "La camara ya esta abierta";
    }

    @Override
    public String tomarFoto() {
        telefono.cambiarEstado(new EstadoBloquedo(telefono));
        return "La foto se tomo";
    }
}

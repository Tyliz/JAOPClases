package Sesion9.State;

public class EstadoCamaraAbierta extends Estado {
    public EstadoCamaraAbierta(Telefono telefono) {
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
        telefono.cambiarEstado(new EstadoTomandoFoto(telefono));
        return "Tomando la foto";
    }
}

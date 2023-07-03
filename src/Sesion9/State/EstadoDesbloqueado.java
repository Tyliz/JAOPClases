package Sesion9.State;

public class EstadoDesbloqueado extends Estado {
    public EstadoDesbloqueado(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "El teléfono se ya encuentra desbloqueado";
    }

    @Override
    public String abrirCamara() {
        telefono.cambiarEstado(new EstadoCamaraAbierta(telefono));
        return "Camara abierta";
    }

    @Override
    public String tomarFoto() {
        return "La camará no esta abierta";
    }
}

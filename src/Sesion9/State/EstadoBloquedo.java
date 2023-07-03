package Sesion9.State;

public class EstadoBloquedo extends Estado {
    public EstadoBloquedo(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        telefono.cambiarEstado(new EstadoDesbloqueado(telefono));
        return "Desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "Abrir camara: La camara esta bloqueada. Desbloquea el móvil.";
    }

    @Override
    public String tomarFoto() {
        return "Tomar foto: La camara esta bloqueada. Desbloquea el móvil.";
    }
}

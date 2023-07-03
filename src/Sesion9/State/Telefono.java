package Sesion9.State;

public class Telefono {
    public Estado estado;

    public Telefono() {
        estado = new EstadoBloquedo(this);
    }

    public void cambiarEstado(Estado estado) {
        System.out.println("Estado inicial: " + this.estado.getClass().getName());
        this.estado = estado;
        System.out.println("Estado final: " + this.estado.getClass().getName());
    }

    public Estado getEstado() {
        return estado;
    }
}

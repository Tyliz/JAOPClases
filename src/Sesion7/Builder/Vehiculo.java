package Sesion7.Builder;

public class Vehiculo {
    private String marca;
    private String tipo;
    private String motor;
    private int Puertas;

    public Vehiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getPuertas() {
        return Puertas;
    }

    public void setPuertas(int puertas) {
        Puertas = puertas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

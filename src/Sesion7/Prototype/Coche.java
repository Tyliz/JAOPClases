package Sesion7.Prototype;

public class Coche implements Cloneable {
    String marca;
    String modelo;
    int puertas;

    public Coche() {}

    public Coche clonar() throws CloneNotSupportedException {
        return (Coche)this.clone();
    }

    @Override
    public String toString() {
        return String.format("{marca: %s, modelo: %s, puertas: %d}", marca, modelo, puertas);
    }
}

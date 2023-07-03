package Builder;

public class CocheBuilder {
    private Vehiculo vehiculo;

    public CocheBuilder(String marca) {
        vehiculo = new Vehiculo();
        vehiculo.setMarca(marca);
    }

    public CocheBuilder setPuertas(int puertas) {
        vehiculo.setPuertas(puertas);
        return this;
    }

    public CocheBuilder setMotor(String motor) {
        vehiculo.setMotor(motor);
        return this;
    }

    public Vehiculo build() {
        return vehiculo;
    }
}

package Adapter;

public class Horno implements Enchufable {
    boolean encendido = false;

    @Override
    public void enciende() {
    }

    @Override
    public void apaga() {
    }

    @Override
    public boolean estaEncendido() {
        return encendido;
    }
}

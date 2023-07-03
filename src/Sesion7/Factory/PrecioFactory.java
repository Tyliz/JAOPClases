package Sesion7.Factory;

public class PrecioFactory {
    private Precio precio;

    public PrecioFactory(String pais) {
        if (pais.equalsIgnoreCase("España"))
            precio = new PrecioEUR();
        else
            precio = new PrecioUSD();
    }

    public double getPrecio() {
        return precio.getPrecio();
    }
}

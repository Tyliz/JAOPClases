package Sesion7.Builder.abstracta;

public abstract class Persona {
    private String nombre;
    private int edad;
    private String direccion;

    protected Persona(Builder<?, ?> builder) {
        this.nombre = builder.nombre;
        this.edad = builder.edad;
        this.direccion = builder.direccion;
    }

    @Override
    public String toString() {
        return "\"nombre\": \"" + getNombre() + "\", \"edad\": " +  + getEdad() + ", \"direccion\": \"" + getDireccion() + "\"";
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }


    public abstract static class Builder<T extends Persona, B extends Builder<T, B>> {
        private String nombre;
        private int edad;
        private String direccion;

        public B setNombre(String nombre) {
            this.nombre = nombre;
            return self();
        }

        public B setEdad(int edad) {
            this.edad = edad;
            return self();
        }

        public B setDireccion(String direccion) {
            this.direccion = direccion;
            return self();
        }

        protected abstract B self();

        public abstract T build();
    }
}

package Sesion7.Builder.abstracta;

/**
 * Empleado
 */
public class Empleado extends Persona {
    private String rol;

    private Empleado(Builder builder) {
        super(builder);
        this.rol = builder.rol;
    }

    @Override
    public String toString() {
        return "{" + super.toString() + ", \"rol\": \"" + getRol() + "\"}";
    }

    public String getRol() {
        return rol;
    }

    public static class Builder extends Persona.Builder<Empleado, Builder> {
        private String rol;

        public Builder setRol(String rol) {
            this.rol = rol;
            return self();
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public Empleado build() {
            return new Empleado(this);
        }
    }
}
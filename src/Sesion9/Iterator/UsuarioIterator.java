package Sesion9.Iterator;

public interface UsuarioIterator {
    /**
     * Retorna true si hay más usuarios en el iterador
     * @return boolean
     */
    boolean hayMas();

    /**
     * Reinicia el contador
     */
    void reinicia();

    /**
     * Retorna una instancia de Usuario
     * @return la instancia siguiente de la clase Usuario en el iterador
     */
    Usuario siguiente();
}

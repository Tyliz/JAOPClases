package Sesion8.Facade;

public class Main {
    public static void main(String[] args) {
        VideoConversorFacade conversor = new VideoConversorFacade();
        conversor.convertVideo("fichero.ogg", "mp4");
    }
}

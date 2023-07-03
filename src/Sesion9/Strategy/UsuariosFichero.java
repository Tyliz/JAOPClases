package Sesion9.Strategy;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuariosFichero implements Usuarios {
    private String rutaFichero = "usuarios.txt";
    private PrintStream fichero;

    public UsuariosFichero() {
        try {
            fichero = new PrintStream(rutaFichero);
        } catch (Exception e) {
            System.out.println("No se puede abrir el archivo:");
            System.out.println("\t" + e.getMessage());
        }
    }

    public void crear(String nombre) {
        fichero.println(nombre);
    }

    public ArrayList<String> listar() {
        ArrayList<String> lstUsuarios = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(rutaFichero));

            while (scanner.hasNext()) {
                lstUsuarios.add(scanner.next());
            }
        } catch (Exception e) {
            System.out.println("No se puede abrir el archivo:");
            System.out.println("\t" + e.getMessage());
        }

        return lstUsuarios;
    }
}

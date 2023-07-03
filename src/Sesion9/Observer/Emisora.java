package Sesion9.Observer;

import java.util.ArrayList;

public class Emisora {
    private ArrayList<Receptor> lstReceptores = new ArrayList<Receptor>();

    public void ingresaReceptor(Receptor receptor) {
        this.lstReceptores.add(receptor);
    }

    public void emite() {
        lstReceptores.forEach(receptor -> receptor.recive());
    }
}

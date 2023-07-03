package Sesion9.Mediator;

import java.util.ArrayList;

public class MediadorConcreto extends Mediator {
    ArrayList<Colega> lstColegas = new ArrayList<Colega>();

    @Override
    void registra(Colega colega) {
        if (!lstColegas.contains(colega)) {
            lstColegas.add(colega);
            colega.setMediator(this);
        }
    }

    @Override
    void reenvia(Colega colega) {
        lstColegas.forEach((actual) -> {
            if (!actual.equals(colega)) {
                actual.recibe();
            }
        });
    }
}

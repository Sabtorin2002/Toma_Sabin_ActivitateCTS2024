package cts.TomaSabin1098.factoryMethod;

import java.util.List;

public class Asistent extends PersonalSpital {

    protected Asistent(String nume, List<String> listaPacienti, int nrPacienti) {
        super(nume, listaPacienti, nrPacienti);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Asistentul " + super.getNume() + " are " + super.getNrPacienti() + " pacienti " + ", cu numele fiecaruia: ");
        for (String pacient : super.getListaPacienti()) {
            System.out.println(pacient);
        }
    }
}

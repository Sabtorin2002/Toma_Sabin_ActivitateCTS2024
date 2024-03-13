package factory_method.fabrici.clase;

public class Raceala extends Medicament {
    private int cantitate;
    protected Raceala(String denumire, float pret) {
        super(denumire, pret);
        this.cantitate = 0;
    }

    protected Raceala(String denumire, float pret, int cantitate) {
        super(denumire, pret);
        this.cantitate = cantitate;
    }

    @Override
    public String afisareDetalii() {
        return "Medicamentul pentru raceala " + super.getDenumire() + " are pretul de " + super.getPret() + " RON";
    }
}

package factory_method.fabrici.clase;

public class Body extends Medicament{
    protected Body(String nume, float pret) {
        super(nume, pret);
    }

    @Override
    public String afisareDetalii() {
        return "Medicamentul pentru body " + super.getDenumire() + " are pretul de " + super.getPret() + "RON.";
    }
}

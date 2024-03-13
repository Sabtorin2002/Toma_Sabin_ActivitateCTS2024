package factory_method.fabrici.clase;

public class Durere extends Medicament{
    protected Durere(String nume, float pret) {
        super(nume, pret);
    }

    @Override
    public String afisareDetalii() {
        return "Medicamentul pentru durere " + super.getDenumire() + " are pretul de " + super.getPret() + " RON.";
    }

}

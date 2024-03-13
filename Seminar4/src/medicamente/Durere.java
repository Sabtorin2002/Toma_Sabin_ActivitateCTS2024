package medicamente;

public class Durere extends Medicament{
    protected Durere(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Medicamentul " + super.getDenumire() + " este un medicament de tip Durere si are pretul de " + super.getPret() + " RON.");
    }
}

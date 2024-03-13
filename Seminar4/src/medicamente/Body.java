package medicamente;

public class Body extends Medicament{
    protected Body(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Medicamentul " + super.getDenumire() + " este un medicament de tip Body si are pretul de " + super.getPret() + " RON.");
    }
}

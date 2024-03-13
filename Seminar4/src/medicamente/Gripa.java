package medicamente;

public class Gripa extends Medicament{
    protected Gripa(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Medicamentul " + super.getDenumire() + " este un medicament de tip Gripa si are pretul de " + super.getPret() + " RON.");
    }
}

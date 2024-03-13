package medicamente;

public class Raceala extends Medicament{
    private int valabilitate;
    protected Raceala(String denumire, float pret) {
        super(denumire, pret);
        this.valabilitate = 0;
    }

    protected Raceala(String denumire, float pret, int valabilitate) {
        super(denumire, pret);
        this.valabilitate = valabilitate;
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Medicamentul " + super.getDenumire() + " este un medicament de tip Raceala, are pretul de " + super.getPret() + " RON. Valabilitate: " + valabilitate + " luni.");
    }
}

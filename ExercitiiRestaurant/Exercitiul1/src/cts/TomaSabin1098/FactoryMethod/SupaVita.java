package cts.TomaSabin1098.FactoryMethod;

public class SupaVita extends SupaAbstracta{
    protected SupaVita(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Supa de "+super.getDenumire()+" costa "+ super.getPret());
    }
}

package cts.TomaSabin1098.FactoryMethod;

public class SupaLegume extends SupaAbstracta{

    protected SupaLegume(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Supa de "+super.getDenumire()+" costa "+ super.getPret());
    }
}

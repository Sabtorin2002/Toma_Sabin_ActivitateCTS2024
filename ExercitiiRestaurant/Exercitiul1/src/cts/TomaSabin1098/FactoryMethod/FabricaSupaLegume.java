package cts.TomaSabin1098.FactoryMethod;

public class FabricaSupaLegume extends FabricaSupe{
    public FabricaSupaLegume(String nume, float pret) {
        super(nume, pret);
    }

    @Override
    public SupaAbstracta creareSupa() {
        return new SupaLegume(super.getNume(),super.getPret());
    }
}

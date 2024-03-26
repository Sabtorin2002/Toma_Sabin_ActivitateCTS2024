package cts.TomaSabin1098.FactoryMethod;

public class FabricaSupaVita extends FabricaSupe{

    public FabricaSupaVita(String nume, float pret) {
        super(nume, pret);
    }

    @Override
    public SupaAbstracta creareSupa() {
        return new SupaVita(super.getNume(),super.getPret());
    }
}

package cts.TomaSabin1098.FactoryMethod;

public class FabricaSupaCiuperci extends FabricaSupe{
    public FabricaSupaCiuperci(String nume, float pret) {
        super(nume, pret);
    }

    @Override
    public SupaAbstracta creareSupa() {
        return new SupaCiuperci(super.getNume(),super.getPret());
    }
}

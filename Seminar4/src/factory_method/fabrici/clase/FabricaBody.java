package factory_method.fabrici.clase;

public class FabricaBody extends FabricaMedicamente{
    public FabricaBody(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public Medicament creareMedicament() {
        return new Body(super.getDenumire(), super.getPret());
    }
}

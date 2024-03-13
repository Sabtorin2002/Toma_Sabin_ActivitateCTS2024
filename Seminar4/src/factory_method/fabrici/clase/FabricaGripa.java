package factory_method.fabrici.clase;

public class FabricaGripa extends FabricaMedicamente{
    public FabricaGripa (String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public Medicament creareMedicament() {
        return new Gripa(super.getDenumire(), super.getPret());
    }
}

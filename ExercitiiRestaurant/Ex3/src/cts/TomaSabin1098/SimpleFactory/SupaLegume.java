package cts.TomaSabin1098.SimpleFactory;

public class SupaLegume extends Supa{
    public SupaLegume(String nume, float pret) {
        super(nume, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Supa de " + super.getNume()+ " are pretul de "+super.getPret()+" RON.");
    }
}

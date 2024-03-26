package cts.TomaSabin1098.SimpleFactory;

public class SupaFactory {
    public static Supa getSupa(TipSupa tip, String nume, float pret){
        switch (tip){
            case VITA:
                return new SupaVita(nume,pret);
            case LEGUME:
                return new SupaLegume(nume,pret);
            case CIUPERCI:
                return new SupaCiuperci(nume,pret);
            default:
                try {
                    throw new RuntimeException("Tipul de supa nu exista");
                }catch (Exception e){
                    throw new RuntimeException(e);
                }
        }
    }
}

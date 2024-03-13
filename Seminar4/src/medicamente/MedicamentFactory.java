package medicamente;

public class MedicamentFactory {
    public static Medicament getMedicament(TipMedicament tip, String denumire, float pret, int valabilitate) {
        switch (tip) {
            case BODY:
                return new Body(denumire, pret);
            case RACEALA:
                return new Raceala(denumire, pret, valabilitate);
            case DURERE:
                return new Durere(denumire, pret);
            case GRIPA:
                return new Gripa(denumire, pret);
            default:
                try {
                    throw new Exception("Tipul de medicament nu exista!");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
        }
    }
}

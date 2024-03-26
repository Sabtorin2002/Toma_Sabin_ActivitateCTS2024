package cts.TomaSabin1098.simpleFactory;

public class PersonalFactory {
    public static PersonalSpital getPersonal(TipPersonal tip, String nume, double salariu, int varsta, int nrSubordonati){
        switch (tip){
            case BRANCARDIER:
                return new Brancardier(nume,salariu,varsta);
            case ASISTENT:
                return new Asistent(nume,salariu,varsta);
            case MEDIC:
                return new Medic(nume,salariu,varsta,nrSubordonati);
            default:
                try {
                    throw new Exception("Tipul de medicament nu exista");
                }catch (Exception e){
                    throw new RuntimeException();
                }
        }
    }
}

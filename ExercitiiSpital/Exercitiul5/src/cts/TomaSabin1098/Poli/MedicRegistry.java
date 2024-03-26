package cts.TomaSabin1098.Poli;

import java.util.HashMap;
import java.util.Map;

public class MedicRegistry {
    private Map<String,Medic>medici;
    private static MedicRegistry instanta=null;

    private MedicRegistry(){
        medici=new HashMap<>();
    }

    public synchronized static MedicRegistry getInstance(){
        if(instanta==null){
            instanta=new MedicRegistry();
        }
        return instanta;
    }

    public void inregistreazaMedic(String numeSpital, String nume, double salariu){
        medici.putIfAbsent(numeSpital,new Medic(numeSpital,nume,salariu));
    }

    public Medic getMedic(String numeSpital){
        return medici.get(numeSpital);
    }
}

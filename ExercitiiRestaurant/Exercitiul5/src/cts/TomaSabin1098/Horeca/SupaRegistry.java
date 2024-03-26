package cts.TomaSabin1098.Horeca;

import java.util.HashMap;
import java.util.Map;

public class SupaRegistry {
    private Map<String, Supa>supe;
    private static SupaRegistry instanta=null;

    private SupaRegistry(){
        supe=new HashMap<>();
    }

    public synchronized static SupaRegistry getInstance(){
        if(instanta==null){
            instanta=new SupaRegistry();
        }
        return instanta;
    }

    public void inregistreazaSupa(String numeRestaurant, String nume, float pret){
        supe.putIfAbsent(numeRestaurant,new Supa(numeRestaurant,nume,pret));
    }

    public Supa getSupa(String numeRestaurant){
        return supe.get(numeRestaurant);
    }
}

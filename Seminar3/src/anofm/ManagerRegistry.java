package anofm;

import java.util.HashMap;
import java.util.Map;

public class ManagerRegistry {
    private Map<String, Manager> manageri;
    private static ManagerRegistry instanta =null;

    private ManagerRegistry(){
        manageri = new HashMap<>();
    }

    public static synchronized ManagerRegistry getInstance(){
        if(instanta==null){
            instanta = new ManagerRegistry();
        }
        return instanta;
    }

    public void inregistreazaManager(String numeFirma, String numeManager, float salariu){

        manageri.putIfAbsent(numeFirma, new Manager(numeFirma, numeManager, salariu));

    }

    public Manager getManager(String numeFirma){
        return manageri.get(numeFirma);
    }
}

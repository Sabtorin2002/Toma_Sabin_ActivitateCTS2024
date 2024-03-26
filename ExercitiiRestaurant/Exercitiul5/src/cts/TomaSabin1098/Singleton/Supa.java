package cts.TomaSabin1098.Singleton;

public class Supa {
    private String nume;
    private float pret;
    private static Supa instanta=null;
    private Supa(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public synchronized static Supa getInstance(String nume, float pret){
        if(instanta==null){
            instanta=new Supa(nume,pret);
        }
        return instanta;
    }

    @Override
    public String toString() {
        return "Supa{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                '}';
    }
    public static Supa getInstance(){
        return new Supa("Perisoare",26);
    }
}

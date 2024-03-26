package cts.TomaSabin1098.singleton.Spital;

public class Medic {
    private String nume;
    private double salariu;
    private int varsta;
    private static Medic instanta=null;

    private Medic(String nume, double salariu, int varsta) {
        this.nume = nume;
        this.salariu = salariu;
        this.varsta = varsta;
    }

    public static synchronized Medic getInstance(String nume, double salariu, int varsta){
        if(instanta==null){
            instanta=new Medic(nume, salariu, varsta);
        }
        return instanta;
    }

    @Override
    public String toString() {
        return "Medic{" +
                "nume='" + nume + '\'' +
                ", salariu=" + salariu +
                ", varsta=" + varsta +
                '}';
    }

    public static Medic getInstance(){
        return getInstance("Laurentiu", 17000,45);
    }
}

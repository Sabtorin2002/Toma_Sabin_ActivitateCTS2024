package companie;

public class Manager {
    private String nume;
    private double salariu;
    private int nrSubordonati;
    public static Manager instanta=null;

    private Manager(String nume, double salariu, int nrSubordonati) {
        this.nume = nume;
        this.salariu = salariu;
        this.nrSubordonati = nrSubordonati;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    public int getNrSubordonati() {
        return nrSubordonati;
    }

    public void setNrSubordonati(int nrSubordonati) {
        this.nrSubordonati = nrSubordonati;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "nume='" + nume + '\'' +
                ", salariu=" + salariu +
                ", nrSubordonati=" + nrSubordonati +
                '}';
    }

    public synchronized static Manager getInstance(String nume, double salariu, int nrSubordonati){
        if(instanta==null){
            instanta=new Manager(nume, salariu, nrSubordonati);
        }
        return instanta;
    }

    public static Manager getInstance(){
     return  getInstance("Nume", 5500, 4);
    }
}

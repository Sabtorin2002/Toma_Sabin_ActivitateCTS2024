package cts.TomaSabin1098.Poli;

public class Medic {
    private String numeSpital;
    private String nume;
    private double salariu;

    protected Medic(String numeSpital, String nume, double salariu) {
        this.numeSpital = numeSpital;
        this.nume = nume;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return "Medic{" +
                "numeSpital='" + numeSpital + '\'' +
                ", nume='" + nume + '\'' +
                ", salariu=" + salariu +
                '}';
    }
}

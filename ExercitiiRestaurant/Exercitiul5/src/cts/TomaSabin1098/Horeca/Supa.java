package cts.TomaSabin1098.Horeca;

public class Supa {
    private String numeRestaurant;
    private String nume;
    private float pret;

    protected Supa(String numeRestaurant, String nume, float pret) {
        this.numeRestaurant = numeRestaurant;
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Supa{" +
                "numeRestaurant='" + numeRestaurant + '\'' +
                ", nume='" + nume + '\'' +
                ", pret=" + pret +
                '}';
    }
}

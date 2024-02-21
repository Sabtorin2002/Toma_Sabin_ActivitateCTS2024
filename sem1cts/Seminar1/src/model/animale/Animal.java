package model.animale;

public abstract class Animal implements Vietate {
    private int age;
    private String nume;
    private int nrPicioare;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrPicioare() {
        return nrPicioare;
    }

    public void setNrPicioare(int nrPicioare) {
        this.nrPicioare = nrPicioare;
    }

    public Animal(int age, String nume, int nrPicioare) {
        this.age = age;
        this.nume = nume;
        this.nrPicioare = nrPicioare;
    }
}

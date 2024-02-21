package model.zoo;

import model.animale.Vietate;

public class ZooKeeper {
    private String nume;

    public void feedAnimal(Vietate vietate, String mancare){
        vietate.eat(mancare);
    }

    public String getNume() {
        return nume;
    }

    public ZooKeeper(String nume) {
        this.nume = nume;
    }
}

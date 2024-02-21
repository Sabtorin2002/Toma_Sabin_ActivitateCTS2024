package testare;

import model.acvatice.Biban;
import model.animale.Lion;
import model.animale.Zebra;
import model.zoo.Zoo;
import model.zoo.ZooKeeper;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("Zoo Bucuresti", new ZooKeeper("Gigel"));
        zoo.adaugaVietate(new Lion(5,"Simba", 4),"carne");
        zoo.adaugaVietate(new Lion(12,"Mufasa", 4),"carne");
        zoo.adaugaVietate(new Lion(9,"Scar", 4),"carne");
        zoo.adaugaVietate(new Zebra(3,"Marty", 4),"iarba");
        zoo.adaugaVietate(new Biban(2, "Caras"), "mamaliga");
        zoo.feedAnimals();

        TipuriMancare tipCarnivor = TipuriMancare.CARNIVOR;
    }
    public enum TipuriMancare{
        CARNIVOR,
        OMNIVOR,
        IERBIVOR
    }
}
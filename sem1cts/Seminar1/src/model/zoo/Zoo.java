package model.zoo;

import model.animale.Vietate;

import java.util.HashMap;
import java.util.Map;

public class Zoo {
    private String nume;
    private ZooKeeper ingrijitor;
    private Map<Vietate, String> animale;

    public Zoo(String nume, ZooKeeper ingrijitor, Map<Vietate, String> animale) {
        this.nume = nume;
        this.ingrijitor = ingrijitor;
        this.animale = animale;
    }

    public Zoo(String nume, ZooKeeper ingrijitor) {
        this.nume = nume;
        this.ingrijitor = ingrijitor;
        this.animale=null;
    }

    public void adaugaVietate(Vietate vietate, String mancare){
        if (animale==null)
        {
          animale = new HashMap<>();
        }
        animale.put(vietate,mancare);
    }

    public void feedAnimals()
    {
        for(Vietate v : animale.keySet())
        {
            ingrijitor.feedAnimal(v, animale.get(v));
        }
    }
}

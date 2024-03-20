package Main;


import Clase.AbstractBuilder;
import Clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        AbstractBuilder abstractBuilder = new Rezervare.BuilderRezervare();
        Rezervare rezervare = abstractBuilder.adaugaBautura().adaugaBautura().adaugaGenMuzical("Jazz").build();
        Rezervare rezervare1 =  abstractBuilder.adaugaMancare().build();
        System.out.println(rezervare);
        System.out.println(rezervare1);
    }
}
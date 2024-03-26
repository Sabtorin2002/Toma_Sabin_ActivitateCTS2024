package cts.TomaSabin1098.main;

import cts.TomaSabin1098.Prototype.AbstractPrototype;
import cts.TomaSabin1098.Prototype.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta = new Reteta(99,78,24);

        AbstractPrototype reteta2=reteta.clone();
        ((Reteta)reteta2).setCantitateNaCl(12);
        ((Reteta) reteta2).setCantitateH2O(28);

        AbstractPrototype reteta3=reteta.clone();
        ((Reteta)reteta3).setCantitateH2SO4(18);

        System.out.println(reteta);
        System.out.println(reteta2);
        System.out.println(reteta3);
    }
}
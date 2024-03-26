package cts.TomaSabin1098.main;

import cts.TomaSabin1098.prototype.AbstractPrototype;
import cts.TomaSabin1098.prototype.Client;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Andrei",21);
        System.out.println(client);
        AbstractPrototype client2 = client.clone();
        ((Client)client2).setVarsta(29);
        System.out.println(client2);

    }
}
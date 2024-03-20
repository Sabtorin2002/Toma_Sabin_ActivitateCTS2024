import Prototip.AbstractPrototype;
import Prototip.Client;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> accesorii = new ArrayList<>();
        accesorii.add("esarfa");
        accesorii.add("sapca");
        Client client1 = new Client("Andrei",16, accesorii);
        AbstractPrototype client2 = client1.clone();
        System.out.println(client1);

        ((Client)client2).setVarsta(29);
        System.out.println(client2);

    }
}
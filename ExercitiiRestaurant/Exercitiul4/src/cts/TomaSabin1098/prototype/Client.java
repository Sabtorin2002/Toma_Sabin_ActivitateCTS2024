package cts.TomaSabin1098.prototype;

import java.awt.datatransfer.Clipboard;

public class Client implements AbstractPrototype{
    private String nume;
    private int varsta;

    public Client(String nume, int varsta) {
        this.nume = nume;
        if(varsta<18){
            throw new RuntimeException("Clientul e minor.");
        }
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }

    public void setVarsta(int varsta) {
        if(varsta<18){
            throw new RuntimeException("Clientul e minor.");
        }
        this.varsta = varsta;
    }

    private Client(){}


    @Override
    public AbstractPrototype clone() {
        Client newClient = new Client();
        newClient.nume=this.nume;
        newClient.varsta=this.varsta;

        return newClient;
    }
}

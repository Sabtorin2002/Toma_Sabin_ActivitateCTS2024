package main;

import companie.Manager;

public class main {
    public static void main(String[] args) {
        Manager manager2 = Manager.getInstance("ASD", 2000, 15);
        Manager manager1 = Manager.getInstance();


        System.out.println(manager1);
        System.out.println(manager2);

    }
}

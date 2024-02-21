package model.animale;

public class Zebra extends Animal{
    public Zebra(int age, String nume, int nrPicioare) {
        super(age, nume, nrPicioare);
    }

    @Override
    public void eat(String mancare) {
        var sb = new StringBuilder();
        sb.append("Zebra ");
        sb.append(getNume());
        sb.append(" mananca ").append(mancare);
        System.out.println(sb);
    }
}

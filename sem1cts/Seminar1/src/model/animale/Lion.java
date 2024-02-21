package model.animale;

public class Lion extends Animal{
    public Lion(int age, String nume, int nrPicioare) {
        super(age, nume, nrPicioare);
    }

    @Override
    public void eat(String mancare) {
        var sb = new StringBuilder();
        sb.append("Leul ");
        sb.append(getNume());
        sb.append(" mananca ").append(mancare);
        System.out.println(sb);
    }
}

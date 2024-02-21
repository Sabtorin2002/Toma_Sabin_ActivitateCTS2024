package model.acvatice;

public class Biban extends Peste{
    public Biban(int nrInotatoare, String rasa) {
        super(nrInotatoare, rasa);
    }

    @Override
    public void eat(String mancare) {
        var sb = new StringBuilder();
        sb.append("Carasul ").append(getRasa()).append(" mananca ").append(mancare);
        System.out.println(sb);
    }
}

package Builder;

public interface AbstractBuilder {

    Rezervare build();

    AbstractBuilder adaugaScaunErgonomic();

    AbstractBuilder adaugaMancare();

    AbstractBuilder adaugaBautura();

    AbstractBuilder adaugaMuzica();
    AbstractBuilder adaugaGenMuzical(String genMuzical);
}

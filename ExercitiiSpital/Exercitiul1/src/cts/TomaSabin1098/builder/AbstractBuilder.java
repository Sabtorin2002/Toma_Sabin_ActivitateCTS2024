package cts.TomaSabin1098.builder;

public interface AbstractBuilder {
    Pacient build();
    AbstractBuilder adaugaPatRabatibil();
    AbstractBuilder adaugaMicDejun();
    AbstractBuilder adaugaPapuciCamera();
    AbstractBuilder adaugaHalatInterior();
}

package cts.TomaSabin1098.Builder;

public interface AbstractBuilder {
    Rezervare build();
    AbstractBuilder asezareGeam();
    AbstractBuilder scaunErgonomic();
    AbstractBuilder masaDecorata();
    AbstractBuilder muzicaAmbientala();
    AbstractBuilder genMuzical(String genMuzical);
}

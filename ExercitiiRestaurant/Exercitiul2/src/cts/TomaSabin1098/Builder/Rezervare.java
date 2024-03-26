package cts.TomaSabin1098.Builder;

public class Rezervare {
    private boolean asezareGeam;
    private boolean scaunErgonomic;
    private boolean masaDecorata;
    private boolean muzicaAmbientala;
    private String genMuzical;

    protected Rezervare(boolean asezareGeam, boolean scaunErgonomic, boolean masaDecorata, boolean muzicaAmbientala, String genMuzical) {
        this.asezareGeam = asezareGeam;
        this.scaunErgonomic = scaunErgonomic;
        this.masaDecorata = masaDecorata;
        this.muzicaAmbientala = muzicaAmbientala;
        this.genMuzical = genMuzical;
    }

    protected Rezervare(){
        this.asezareGeam=false;
        this.scaunErgonomic=false;
        this.masaDecorata=false;
        this.muzicaAmbientala=false;
        this.genMuzical=null;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "asezareGeam=" + asezareGeam +
                ", scaunErgonomic=" + scaunErgonomic +
                ", masaDecorata=" + masaDecorata +
                ", muzicaAmbientala=" + muzicaAmbientala +
                ", genMuzical='" + genMuzical + '\'' +
                '}';
    }

    public static class RezervareBuilder implements AbstractBuilder{
        private boolean asezareGeam;
        private boolean scaunErgonomic;
        private boolean masaDecorata;
        private boolean muzicaAmbientala;
        private String genMuzical;
        @Override
        public Rezervare build() {
            Rezervare rezervare = new Rezervare(asezareGeam,scaunErgonomic,masaDecorata,muzicaAmbientala,genMuzical);
            return rezervare;
        }

        @Override
        public AbstractBuilder asezareGeam() {
            this.asezareGeam=true;
            return this;
        }

        @Override
        public AbstractBuilder scaunErgonomic() {
            this.scaunErgonomic=true;
            return this;
        }

        @Override
        public AbstractBuilder masaDecorata() {
            this.masaDecorata=true;
            return this;
        }

        @Override
        public AbstractBuilder muzicaAmbientala() {
            this.muzicaAmbientala=true;
            return this;
        }

        @Override
        public AbstractBuilder genMuzical(String genMuzical) {
            this.genMuzical=genMuzical;
            return this;
        }
    }
}

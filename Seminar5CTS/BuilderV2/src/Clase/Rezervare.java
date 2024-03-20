package Clase;

public class Rezervare {
    private boolean areMancare;
    private boolean areScaunErgonomic;
    private boolean areMuzica;
    private boolean areBautura;
    String genMuzical;

    protected Rezervare(boolean areManacre, boolean areScaunErgonomic, boolean areMuzica, boolean areBautura, String genMuzical) {
        this.areMancare = areManacre;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areMuzica = areMuzica;
        this.areBautura = areBautura;
        this.genMuzical = genMuzical;
    }

    protected Rezervare() {
        this.areMancare = false;
        this.areScaunErgonomic = false;
        this.areMuzica = false;
        this.areBautura = false;
        this.genMuzical = "";
    }

     public static class BuilderRezervare implements AbstractBuilder{
        private boolean areMancare;
        private boolean areScaunErgonomic;
        private boolean areMuzica;
        private boolean areBautura;
        String genMuzical;

        @Override
        public Rezervare build() {
            Rezervare rezervare = new Rezervare(areMancare, areScaunErgonomic, areMuzica, areBautura, genMuzical);
            return rezervare;
        }

        @Override
        public AbstractBuilder adaugaScaunErgonomic() {
            this.areScaunErgonomic = true;
            return this;
        }

        @Override
        public AbstractBuilder adaugaMancare() {
            this.areMancare=true;
            return this;
        }

        @Override
        public AbstractBuilder adaugaBautura() {
            this.areBautura=true;
            return this;
        }

        @Override
        public AbstractBuilder adaugaMuzica() {
            this.areMuzica=true;
            return this;
        }

        @Override
        public AbstractBuilder adaugaGenMuzical(String genMuzical) {
            this.areMuzica=true;
            this.genMuzical=genMuzical;
            return this;
        }
    }

    protected boolean isAreManacre() {
        return areMancare;
    }

    protected void setAreManacre(boolean areManacre) {
        this.areMancare = areManacre;
    }

    protected boolean isAreScaunErgonomic() {
        return areScaunErgonomic;
    }

    protected void setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
    }

    protected boolean isAreMuzica() {
        return areMuzica;
    }

    protected void setAreMuzica(boolean areMuzica) {
        this.areMuzica = areMuzica;
    }

    protected boolean isAreBautura() {
        return areBautura;
    }

    protected void setAreBautura(boolean areBautura) {
        this.areBautura = areBautura;
    }

    protected String getGenMuzical() {
        return genMuzical;
    }

    protected void setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "areManacre=" + areMancare +
                ", areScaunErgonomic=" + areScaunErgonomic +
                ", areMuzica=" + areMuzica +
                ", areBautura=" + areBautura +
                ", genMuzical='" + genMuzical + '\'' +
                '}';
    }
}

package cts.TomaSabin1098.builder;

public class Pacient {
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuciCamera;
    private boolean halatInterior;

    protected Pacient(boolean patRabatabil, boolean micDejun, boolean papuciCamera, boolean halatInterior) {
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.papuciCamera = papuciCamera;
        this.halatInterior = halatInterior;
    }

    protected Pacient(){
        this.patRabatabil=false;
        this.micDejun=false;
        this.papuciCamera=false;
        this.halatInterior=false;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "patRabatabil=" + patRabatabil +
                ", micDejun=" + micDejun +
                ", papuciCamera=" + papuciCamera +
                ", halatInterior=" + halatInterior +
                '}';
    }

    public static class PacientBuilder implements AbstractBuilder{
        private boolean patRabatabil;
        private boolean micDejun;
        private boolean papuciCamera;
        private boolean halatInterior;
        @Override
        public Pacient build() {
            Pacient pacient = new Pacient(patRabatabil, micDejun, papuciCamera, halatInterior);
            return pacient;
        }

        @Override
        public AbstractBuilder adaugaPatRabatibil() {
            this.patRabatabil=true;
            return this;
        }

        @Override
        public AbstractBuilder adaugaMicDejun() {
            this.micDejun=true;
            return this;
        }

        @Override
        public AbstractBuilder adaugaPapuciCamera() {
            this.papuciCamera=true;
            return this;
        }

        @Override
        public AbstractBuilder adaugaHalatInterior() {
            this.halatInterior=true;
            return this;
        }

    }
}

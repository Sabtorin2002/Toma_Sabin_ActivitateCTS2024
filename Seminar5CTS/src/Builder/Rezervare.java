package Builder;

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
    protected Rezervare(){
        this.areMancare=false;
        this.areScaunErgonomic=false;
        this.areMuzica=false;
        this.areBautura=false;
        this.genMuzical="";
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

package cts.TomaSabin1098.Prototype;

public class Reteta implements AbstractPrototype{
    private float cantitateNaCl;
    private float cantitateH2O;
    private float cantitateH2SO4;

    public Reteta(float cantitateNaCl, float cantitateH2O, float cantitateH2SO4) {
        if(cantitateNaCl>100){
            throw new RuntimeException("Prea mult NaCl");
        }
        this.cantitateNaCl = cantitateNaCl;
        if(cantitateH2O>100){
            throw new RuntimeException("Prea mult H2O");
        }
        this.cantitateH2O = cantitateH2O;
        if(cantitateH2SO4>100){
            throw new RuntimeException("Prea mult H2SO4");
        }
        this.cantitateH2SO4 = cantitateH2SO4;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "cantitateNaCl=" + cantitateNaCl +
                ", cantitateH2O=" + cantitateH2O +
                ", cantitateH2SO4=" + cantitateH2SO4 +
                '}';
    }

    private Reteta(){}

    public void setCantitateNaCl(float cantitateNaCl) {
        this.cantitateNaCl = cantitateNaCl;
    }

    public void setCantitateH2O(float cantitateH2O) {
        this.cantitateH2O = cantitateH2O;
    }

    public void setCantitateH2SO4(float cantitateH2SO4) {
        this.cantitateH2SO4 = cantitateH2SO4;
    }

    @Override
    public AbstractPrototype clone() {
        Reteta newReteta = new Reteta();
        newReteta.cantitateNaCl=this.cantitateNaCl;
        newReteta.cantitateH2O=this.cantitateH2O;
        newReteta.cantitateH2SO4=cantitateH2SO4;

        return newReteta;
    }
}

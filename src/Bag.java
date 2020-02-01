public class Bag {
    private Cilindricheskoe cilindricheskoe;
    private Ploskoe ploskoe;
    private Krugloe[] krugloe;

    public Bag(Cilindricheskoe cilindricheskoe, Ploskoe ploskoe, Krugloe[] krugloe) {
        this.cilindricheskoe = cilindricheskoe;
        this.ploskoe = ploskoe;
        this.krugloe = krugloe;
    }

    public Bag(Putable cola1, Putable book, Krugloe[] apple1) {
        this.cilindricheskoe = cilindricheskoe;
        this.ploskoe = ploskoe;
        this.krugloe = krugloe;
    }

    public Cilindricheskoe getCilindricheskoe() {
        return cilindricheskoe;
    }

    public void setCilindricheskoe(Cilindricheskoe cilindricheskoe) {
        this.cilindricheskoe = cilindricheskoe;
    }

    public Ploskoe getPloskoe() {
        return ploskoe;
    }

    public void setPloskoe(Ploskoe ploskoe) {
        this.ploskoe = ploskoe;
    }

    public Krugloe[] getKrugloe() {
        return krugloe;
    }

    public void setKrugloe(Krugloe[] krugloe) {
        this.krugloe = krugloe;
    }
}

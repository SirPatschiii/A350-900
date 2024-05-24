public class Leg {
    private ESide legSide;
    private Foot foot;

    public Leg(ESide eside) {
        this.legSide = eside;
        this.foot = new Foot(legSide);
    }

    public ESide getLegSide() {
        return legSide;
    }

    public void setLegSide(ESide legSide) {
        this.legSide = legSide;
    }
    @Override
    public String toString() {
        return "Leg{" + "side='" + legSide + '\'' + '}';
    }
}

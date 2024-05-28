public class Leg {
    private ESide legSide;
    private Foot foot;

    public Leg(ESide eside) {
        this.legSide = eside;
        this.foot = new Foot(legSide);
    }

    @Override
    public String toString() {
        return "Leg{" + "side='" + legSide + '\'' + '}';
    }
}

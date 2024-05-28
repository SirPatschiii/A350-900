public class Arm {
    private ESide armSide;
    private Hand hand;

    public Arm(ESide eside, String fingerprint) {
        this.armSide = eside;
        this.hand = new Hand(armSide, fingerprint);
    }


    public ESide getEside() {
        return armSide;
    }

    public void setEside(ESide eside) {
        this.armSide = eside;
    }

    public Hand getHand() {
        return hand;
    }

    @Override
    public String toString() {
        return "Arm{" + "side='" + armSide + '\'' + '}';
    }

}

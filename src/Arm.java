public class Arm {
    private ESide armSide;
    private Hand hand;

    public Arm(ESide eside) {
        this.armSide = eside;
        this.hand = new Hand(armSide);
    }


    public ESide getEside() {
        return armSide;
    }

    public void setEside(ESide eside) {
        this.armSide = eside;
    }

    @Override
    public String toString() {
        return "Arm{" + "side='" + armSide + '\'' + '}';
    }

}

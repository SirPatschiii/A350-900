public class Hand {
    private ESide handSide;

    public Hand(ESide eSide){
        this.handSide = eSide;
    }

    public ESide getHandSide() {
        return handSide;
    }

    public void setHandSide(ESide handSide) {
        this.handSide = handSide;
    }
    @Override
    public String toString() {
        return "Hand{" + "side='" + handSide + '\'' + '}';
    }
}

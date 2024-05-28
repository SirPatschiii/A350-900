public class Hand {
    private ESide handSide;
    private String fingerprint;

    public Hand(ESide eSide, String fingerprint){
        this.handSide = eSide;
        this.fingerprint = fingerprint;
    }

    public ESide getHandSide() {
        return handSide;
    }

    public void setHandSide(ESide handSide) {
        this.handSide = handSide;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    @Override
    public String toString() {
        return "Hand{" + "side='" + handSide + '\'' + '}';
    }
}

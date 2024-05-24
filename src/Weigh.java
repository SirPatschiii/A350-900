public class Weigh {
    private double weight;
    private Baggage baggage;

    public Weigh() {

    }

    public void weighBaggage(Baggage baggage){
        this.weight = baggage.getWeight();
    }

    public double getWeight() {
        return weight;
    }
}

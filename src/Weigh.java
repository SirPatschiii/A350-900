public class Weigh {
    private double weight;

    public Weigh() {

    }

    public void weighBaggage(Baggege baggege){
        this.weight = baggege.getgewicht();
    }

    public double getWeight() {
        return weight;
    }
}

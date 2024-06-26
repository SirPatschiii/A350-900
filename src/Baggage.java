public class Baggage {
    private final double weight;
    private final int id;
    private final EClass eClass;
    private final String owner;

    public Baggage(int id, double weight, String owner, EClass eClass) {
        this.id = id;
        this.weight = weight;
        this.owner = owner;
        this.eClass = eClass;
    }

    public double getWeight() {
        return weight;
    }

    public String getOwner() {
        return owner;
    }
}

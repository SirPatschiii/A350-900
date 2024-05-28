import java.util.Stack;

public class Container {
    private Stack<Baggage> baggageStack;
    private int maxCapacity = 45;
    private final ESide side;
    private double weight;

    public Container(ESide side){
        this.baggageStack = new Stack<>();
        this.side = side;
        weight = 0;
    }

    public void addToStack(Baggage baggage) {
        baggageStack.push(baggage);
    }

    public void calcWeight() {
        Stack<Baggage> bS = (Stack<Baggage>) baggageStack.clone();
        for (Baggage baggage : bS) {
            weight += baggage.getWeight();
        }
    }
    public ESide getSide() {
        return this.side;
    }

    public double getWeight() {
        return weight;
    }

}

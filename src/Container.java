import java.util.Stack;

public class Container {
    private Stack<Baggage> baggageStack;
    private int maxCapacity = 45;

    public Container(){
        this.baggageStack = new Stack<>();
    }

    public void addToStack(Baggage baggage) {
        baggageStack.push(baggage);
    }

    public boolean isEmpty() {
        return baggageStack.isEmpty();
    }

    public boolean isFull() {
        return baggageStack.size() == maxCapacity;
    }

}

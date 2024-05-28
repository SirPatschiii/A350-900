public class Weigh {
    private final ConveyorBelt conveyorBelt;

    public Weigh(ConveyorBelt conveyorBelt) {
        this.conveyorBelt = conveyorBelt;
    }

    public void addBaggage(Baggage baggage) {
        conveyorBelt.addBaggage(baggage);
    }
}

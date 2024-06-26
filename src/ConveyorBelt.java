import java.util.LinkedList;
import java.util.Queue;

public class ConveyorBelt {
    private Queue<Baggage> baggagePieces;
    private boolean conveyorBeltEmpty;

    public ConveyorBelt() {
        baggagePieces = new LinkedList<>();
    }

    public void addBaggage(Baggage baggage){
        baggagePieces.add(baggage);
        conveyorBeltEmpty = false;
    }

    public Baggage pullBaggage(){
        return baggagePieces.poll();
    }

    public boolean allBaggageItemsCheckedIn(){
        return baggagePieces.isEmpty();
    }
}

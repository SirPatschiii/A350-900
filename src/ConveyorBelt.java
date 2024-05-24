import java.util.LinkedList;
import java.util.Queue;

public class ConveyorBelt {
    private Queue<Baggage> baggagePieces;

    public ConveyorBelt() {
        baggagePieces = new LinkedList<>();
    }

    public void addBaggage(Baggage baggage){
        baggagePieces.add(baggage);
    }
    public void pullBaggage(){
        baggagePieces.poll();
    }
}

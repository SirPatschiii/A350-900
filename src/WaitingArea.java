import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class WaitingArea {
    private final Queue<Passenger> queue;
    private final CSVManagement csvManagement;

    public WaitingArea() {
        this.queue = new LinkedList<>();
        csvManagement = new CSVManagement();
        csvManagement.generatePassengers();
    }

    public ArrayList<Passenger> getPassengers() {
        return csvManagement.getPassengers();
    }

    public void addPassenger(Passenger passenger) {
        queue.add(passenger);
    }

    public Passenger getNextPassenger() {
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }



    @Override
    public String toString() {
        return "WaitingArea{" +
                "queue=" + queue +
                '}';
    }
}
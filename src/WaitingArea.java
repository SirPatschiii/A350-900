import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WaitingArea {
    private Queue<Passenger> passengers;
    private final CSVManagement csvManagement;

    public WaitingArea() {
        this.passengers = new LinkedList<>();
        csvManagement = new CSVManagement();
        csvManagement.generatePassengers();
    }

    public ArrayList<Passenger> getPassengers() {
        return csvManagement.getPassengers();
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public boolean isAllPassengersPresent() {
        // Implement the logic to check if all expected passengers are present
        // assume all added passengers are present
        return !passengers.isEmpty();
    }

    public Passenger getNextPassenger() {
        return passengers.poll();
    }

    public List<Passenger> getPassengers() {
        return new LinkedList<>(passengers); // Return a copy of the list to avoid modification
    }

    public boolean isEmpty() {
        return passengers.isEmpty();
    }



    public int getCapacity() {
        return passengers.size(); // Assuming capacity refers to the current number of passengers
    }
}

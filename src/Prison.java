import java.util.ArrayList;
import java.util.List;

public class Prison {
    private String location; //location of the prison
    private int capacity; //maximum capacity of the prison
    private List<Passenger> passengers; //list of passengers in the prison
    private List<Baggage> baggages; //list of baggage items in the prison

    public Prison(String location, int capacity) {
        this.location = location; // starts the location
        this.capacity = capacity; // starts the capacity
        this.passengers = new ArrayList<>(); // starts the list of passengers
        this.baggages = new ArrayList<>(); // starts the list of baggage
    }

    public boolean hasSpace() {
        return passengers.size() < capacity; //checks if there is space available in the prison
    }

    public void addPassenger(Passenger passenger, Baggage baggage) {
        if (hasSpace()) {
            passengers.add(passenger); //adds the passenger to the list
            baggages.add(baggage); //adds the baggage to the list
        } else {
            System.out.println("No space available in this prison."); //quick report if no space is available
        }
    }

    public String getLocation() {
        return location; //returns the location of the prison
    }

    public int getCapacity() {
        return capacity; //returns the capacity of the prison
    }
}

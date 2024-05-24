import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FederalPolice {
    private List<FederalPoliceOfficer> officers; //list of police officers
    private List<Prison> prisons; //list of prisons

    public FederalPolice() {
        officers = new ArrayList<>(); //starts the list of police officers
        prisons = new ArrayList<>(); // starts the list of prisons
    }
// method to add a police officer
    public void addOfficer(FederalPoliceOfficer officer) {
        officers.add(officer);
    }
// method to add a prison
    public void addPrison(Prison prison) {
        prisons.add(prison);
    }
//method to arrest a passenger
    public void arrestPassenger(Passenger passenger, Baggage baggage) {
        // Implementation for arresting a passenger
        Prison prison = findAvailablePrison(); //finds an available prison
        if (prison != null) {
            prison.addPassenger(passenger, baggage); //adds the passenger AND bagagge to the prison
        } else {
            System.out.println("No available prison space for the passenger."); //quick report if space is not available
        }
    }
//again method to find an available prison
    private Prison findAvailablePrison() {
        for (Prison prison : prisons) {
            if (prison.hasSpace()) {
                return prison;
            }
        }
        return null;
    }

    public Collection<Object> getPrisons() {
        return getPrisons();
    }

    public Collection<Object> getOfficers() {
        return getOfficers();
    }
}

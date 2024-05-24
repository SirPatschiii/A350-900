public class FederalPoliceOfficer {
    private String name; //name of police officer
    private int badgeNumber;//badge numb of police officer

    public FederalPoliceOfficer(String name, int badgeNumber) {
        this.name = name; //starts the name
        this.badgeNumber = badgeNumber;//starts the badge number
    }

    public String getName() {
        return name; //returns the name
    }

    public int getBadgeNumber() {
        return badgeNumber;//returns the badge
    }
//method to arrest a passenger
    public void arrestPassenger(Passenger passenger, Baggage baggage, FederalPolice police) {
        police.arrestPassenger(passenger, baggage); //calls the arrest method of federalpolice
    }
}

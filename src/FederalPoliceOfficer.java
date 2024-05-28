public class FederalPoliceOfficer {
    private final FederalPolice police;
    private String name; //name of police officer
    private int badgeNumber;//badge numb of police officer

    public FederalPoliceOfficer(String name, int badgeNumber, FederalPolice federalPolice) {
        this.name = name; //starts the name
        this.badgeNumber = badgeNumber;//starts the badge number
        police = federalPolice;
    }

    public String getName() {
        return name; //returns the name
    }

    public int getBadgeNumber() {
        return badgeNumber;//returns the badge
    }

    //method to arrest a passenger
    public void arrestPassenger(Passenger passenger, Baggage baggage) {
        police.arrestPassenger(passenger, baggage); //calls the arrest method of federalpolice
    }
}

import java.util.ArrayList;
import java.util.List;

public class OrganisationUnit {
    private String name; //name of the organization unit
    private static List<FederalPoliceOfficer> officers; //list of police officers in the unit
    private static List<AutonomicVehicle> vehicles; //list of autonomic vehicles in the unit

    public OrganisationUnit(String name) {
        this.name = name; //starts the name
        this.officers = new ArrayList<>(); //starts list of police officers
        this.vehicles = new ArrayList<>(); //starts list of vehicles
    }

    //method to add a police officer to the unit
    public void addOfficer(FederalPoliceOfficer officer) {
        officers.add(officer);
    }

    //method to add a vehicle to the unit
    public void addVehicle(AutonomicVehicle vehicle) {
        vehicles.add(vehicle);
    }

    public String getName() {
        return name; //returns the name of the unit
    }

    public static List<FederalPoliceOfficer> getOfficers() {
        return officers; //returns the list of police officers
    }

    public static List<AutonomicVehicle> getVehicles() {
        return vehicles; //returns the list of vehicles
    }
}

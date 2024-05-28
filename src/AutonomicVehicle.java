public class AutonomicVehicle {
    private String id; //ID of the vehicle
    private Container container; //the container currently being transported by the vehicle
    private final AirportContainerStorage airportContainerStorage;
    private final Lifter lifter;
    private final CargoArea cargoArea;
    
    public AutonomicVehicle(AirportContainerStorage airportContainerStorage, Lifter lifter, CargoArea cargoArea) {
        this.id = id; //start the ID
        this.container = null; //start the container as null
        this.airportContainerStorage = airportContainerStorage;
        this.lifter = lifter;
        this.cargoArea = cargoArea;
    }

    //method to load a container onto the vehicle
    public void loadContainer(Container container) {
        lifter.liftDown();
        lifter.liftUp();
        lifter.transferContainer(container, cargoArea, container.getSide());
    }

    public String getId() {
        return id; //returns the ID of the vehicle
    }

    public Container getContainer() {
        return container; //returns the container currently being transported
    }
}

public class AutonomicVehicle {
    private Container container; //the container currently being transported by the vehicle
    private final AirportContainerStorage airportContainerStorage;
    private final Lifter lifter;
    private final CargoArea cargoArea;
    
    public AutonomicVehicle(AirportContainerStorage airportContainerStorage, Lifter lifter, CargoArea cargoArea) {
        this.container = null; //start the container as null
        this.airportContainerStorage = airportContainerStorage;
        this.lifter = lifter;
        this.cargoArea = cargoArea;
    }

    public void loadContainer(Container container) {
        lifter.liftDown();
        lifter.liftUp();
        lifter.transferContainer(container, cargoArea, container.getSide());
    }
}

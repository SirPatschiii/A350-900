public class AutonomicVehicle {
    private String id; //ID of the vehicle
    private Container container; //the container currently being transported by the vehicle
    private final AirportContainerStorage airportContainerStorage;
    
    public AutonomicVehicle(AirportContainerStorage airportContainerStorage) {
        this.id = id; //start the ID
        this.container = null; //start the container as null
        this.airportContainerStorage = airportContainerStorage;

    }


    //method to load a container onto the vehicle
    public void loadContainer(Container container) {
        this.container = container;
    }

    //method to transport the container
    public void transportContainer() {
        //application for transporting the container
        System.out.println("Transporting container with ID: " + airportContainerStorage.getContainer1());
        System.out.println("Transporting container with ID: " + airportContainerStorage.getContainer2());
        System.out.println("Transporting container with ID: " + airportContainerStorage.getContainer3());
        System.out.println("Transporting container with ID: " + airportContainerStorage.getContainer4());
        System.out.println("Transporting container with ID: " + airportContainerStorage.getContainer5());
        System.out.println("Transporting container with ID: " + airportContainerStorage.getContainer6());
        System.out.println("Transporting container with ID: " + airportContainerStorage.getContainer7());
        System.out.println("Transporting container with ID: " + airportContainerStorage.getContainer8());


    }

    public String getId() {
        return id; //returns the ID of the vehicle
    }

    public Container getContainer() {
        return container; //returns the container currently being transported
    }
}

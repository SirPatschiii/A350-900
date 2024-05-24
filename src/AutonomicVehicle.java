public class AutonomicVehicle {
    private String id; //ID of the vehicle
    private Container container; //the container currently being transported by the vehicle

    public AutonomicVehicle(String id) {
        this.id = id; //start the ID
        this.container = null; //start the container as null
    }

    //method to load a container onto the vehicle
    public void loadContainer(Container container) {
        this.container = container;
    }

    //method to transport the container
    public void transportContainer() {
        //application for transporting the container
        // TODO uncomment line when container is implemented
        // System.out.println("Transporting container with ID: " + container.getId());
    }

    public String getId() {
        return id; //returns the ID of the vehicle
    }

    public Container getContainer() {
        return container; //returns the container currently being transported
    }
}

import java.util.ArrayList;

public class CargoArea {
    private final ArrayList<Container> storageAreaAirplaneLeft;
    private final ArrayList<Container> storageAreaAirplaneRight;
    private int weightLeft; // in kilograms
    private int weightRight; // in kilograms

    public CargoArea() {
        storageAreaAirplaneLeft = new ArrayList<>();
        storageAreaAirplaneRight = new ArrayList<>();
    }

    private void calculateCargoAreaWeight() {
        // TODO calculate weight of left and right compartment
        weightLeft = 0;
        weightRight = 0;
    }

    /**
     * <p>
     * Adds a container to the left storage area of the airplane.
     * <br>
     * This method appends the specified container to the end of the left storage area's list,
     * representing adding the container to the storage area. In a second step it refreshes the
     * actual weight of the cargo area.
     *
     * @param container The container to be added to the left storage area of the airplane.
     * @throws NullPointerException if the specified container is null.
     * </p>
     */
    public void addContainerLeftStorageArea(Container container) {
        if (container == null) {
            throw new NullPointerException("The container cannot be null!");
        }
        storageAreaAirplaneLeft.addLast(container);
        calculateCargoAreaWeight();
    }

    /**
     * <p>
     * Adds a container to the right storage area of the airplane.
     * <br>
     * This method appends the specified container to the end of the right storage area's list,
     * representing adding the container to the storage area. In a second step it refreshes the
     * actual weight of the cargo area.
     *
     * @param container The container to be added to the right storage area of the airplane.
     * @throws NullPointerException if the specified container is null.
     * </p>
     */
    public void addContainerRightStorageArea(Container container) {
        if (container == null) {
            throw new NullPointerException("The container cannot be null!");
        }
        storageAreaAirplaneRight.addLast(container);
        calculateCargoAreaWeight();
    }

    public ArrayList<Container> getStorageAreaAirplaneLeft() {
        return storageAreaAirplaneLeft;
    }

    public ArrayList<Container> getStorageAreaAirplaneRight() {
        return storageAreaAirplaneRight;
    }
}

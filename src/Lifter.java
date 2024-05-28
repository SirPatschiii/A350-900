public class Lifter {
    private String id; //ID of the lifter
    private String status; //the status of the lifter (up or down)

    public Lifter(String id) {
        this.id = id; //starts the ID
        this.status = "down"; //starts the status as down
    }

    //method to lift up the lifter
    public void liftUp() {
        status = "up";
    }

    //method to lift down the lifter
    public void liftDown() {
        status = "down";
    }

    //method to transfer a container to the cargo area of the airplane
    public void transferContainer(Container container, CargoArea cargoArea, ESide side) {
        if ("up".equals(status)) {
            if (side == ESide.LEFT) {
                cargoArea.addContainerLeftStorageArea(container);
            } else if (side == ESide.RIGHT) {
                cargoArea.addContainerRightStorageArea(container);
            }
        } else {
            System.out.println("Lifter is not in the correct position.");
        }
    }
}

import java.util.Stack;

public class RoboterArm {
    private AirportBaggageStorage airportBaggageStorage;
    private ConveyorBelt conveyorBelt;
    private final AirportContainerStorage airportContainerStorage;

    public RoboterArm(AirportBaggageStorage airportBaggageStorage, ConveyorBelt conveyorBelt, AirportContainerStorage airportContainerStorage) {
        this.airportBaggageStorage = airportBaggageStorage;
        this.conveyorBelt = conveyorBelt;
        this.airportContainerStorage = airportContainerStorage;
    }

    public void takeBaggageFromConveyorBelt() {
        while (!conveyorBelt.allBaggageItemsCheckedIn()) {
            Baggage baggage = conveyorBelt.pullBaggage();

            if (baggage != null) {
                airportBaggageStorage.storeBaggage(baggage);
            }
        }
    }

    public void storeBaggageInContainers() {
        Baggage[][][] baggageStorage = airportBaggageStorage.getBaggageStorage();
        Stack<Baggage> baggageStack = new Stack<>();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 5; k++) {
                    if (baggageStorage[i][j][k] != null) {
                        baggageStack.push(baggageStorage[i][j][k]);
                    } else {
                        break;
                    }
                }
            }
        }

        Container container1 = airportContainerStorage.getContainer1();
        Container container2 = airportContainerStorage.getContainer2();
        Container container3 = airportContainerStorage.getContainer3();
        Container container4 = airportContainerStorage.getContainer4();
        Container container5 = airportContainerStorage.getContainer5();
        Container container6 = airportContainerStorage.getContainer6();
        Container container7 = airportContainerStorage.getContainer7();
        Container container8 = airportContainerStorage.getContainer8();

        for (int i = 0; i < 38; i++) {
            container1.addToStack(baggageStack.pop());
        }
        for (int i = 0; i < 38; i++) {
            container2.addToStack(baggageStack.pop());
        }
        for (int i = 0; i < 38; i++) {
            container3.addToStack(baggageStack.pop());
        }
        for (int i = 0; i < 38; i++) {
            container4.addToStack(baggageStack.pop());
        }
        for (int i = 0; i < 38; i++) {
            container5.addToStack(baggageStack.pop());
        }
        for (int i = 0; i < 39; i++) {
            container6.addToStack(baggageStack.pop());
        }
        for (int i = 0; i < 39; i++) {
            container7.addToStack(baggageStack.pop());
        }
        for (int i = 0; i < 39; i++) {
            container8.addToStack(baggageStack.pop());
        }
    }
}

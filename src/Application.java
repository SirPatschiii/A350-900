public class Application {
    public static void main(String[] args) {
        // Init of airplane
        Airplane airplane = new Airplane("Lufthansa");

        // Prints data of the airplane and cabin
        System.out.println(airplane);
        System.out.println(airplane.getBody().getCabin().toString());

        // TODO Airport stuff goes here:
        Airport airport = new Airport();

        // Generate baggage
        CSVManagement csvManagement = new CSVManagement();
        csvManagement.generateBaggage();

        // Implement baggage logistic
        ConveyorBelt conveyorBelt = new ConveyorBelt();
        AirportContainerStorage airportContainerStorage = new AirportContainerStorage();
        RoboterArm roboterArm = new RoboterArm(new AirportBaggageStorage(10, 10, 5), conveyorBelt, airportContainerStorage);
        Weigh weigh = new Weigh(conveyorBelt, csvManagement.getBaggages());

        roboterArm.takeBaggageFromConveyorBelt();
        roboterArm.storeBaggageInContainers();








        // TODO please leave it at the end of file
        // Gets reference to the control unit from the engine
        JetEngineMediator jetEngineMediator;
        jetEngineMediator = airplane.getJetEngineMediator();

        // Simulate flight
        jetEngineMediator.startUp();
        jetEngineMediator.setSpeed(481);
        jetEngineMediator.shutdown();
    }
}

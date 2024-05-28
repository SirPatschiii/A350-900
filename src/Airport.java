public class Airport {
    private final CSVManagement csvManagement;
    private final CheckIn checkIn;
    private final FederalPolice federalPolice;

    private final ConveyorBelt conveyorBelt;
    private final AirportContainerStorage airportContainerStorage;
    private final RoboterArm roboterArm;
    private final Weigh weigh;

    private final WaitingArea waitingArea;
    private final Boarding boarding;

    public Airport(Airplane airplane) {
        // Init check in
        csvManagement = new CSVManagement();
        checkIn = new CheckIn(csvManagement, csvManagement.getPassengers());

        // Init police
        federalPolice = new FederalPolice();

        // Init logistics
        conveyorBelt = new ConveyorBelt();
        airportContainerStorage = new AirportContainerStorage();
        roboterArm = new RoboterArm(new AirportBaggageStorage(10, 10, 5), conveyorBelt, airportContainerStorage);
        weigh = new Weigh(conveyorBelt);

        // Start check in
        checkIn.lineupPassangers();
        checkIn.authenticatePassangers(csvManagement.getPassports());
        checkIn.searchForWarrant(federalPolice.getOfficers().getFirst());
        checkIn.lineupBaggages(weigh);
        checkIn.printBoardingPass();

        waitingArea = new WaitingArea();

        checkIn.sendPassangerToWaitingArea(waitingArea);

        boarding = new Boarding(waitingArea);
        boarding.startBoarding(airplane.getBody().getCabin());

        // deliver baggage to airplane
        roboterArm.takeBaggageFromConveyorBelt();
        roboterArm.storeBaggageInContainers();

        // initialize Lifter
        Lifter lifter = new Lifter("Lifter");

        //initialize AutonomicVehicle
        AutonomicVehicle autonomicVehicle1 = new AutonomicVehicle(airportContainerStorage, lifter, airplane.getBody().getCargoArea());
        AutonomicVehicle autonomicVehicle2 = new AutonomicVehicle(airportContainerStorage, lifter, airplane.getBody().getCargoArea());
        AutonomicVehicle autonomicVehicle3 = new AutonomicVehicle(airportContainerStorage, lifter, airplane.getBody().getCargoArea());

        autonomicVehicle1.loadContainer(airportContainerStorage.getContainer1());
        autonomicVehicle1.loadContainer(airportContainerStorage.getContainer2());
        autonomicVehicle1.loadContainer(airportContainerStorage.getContainer3());

        autonomicVehicle2.loadContainer(airportContainerStorage.getContainer4());
        autonomicVehicle2.loadContainer(airportContainerStorage.getContainer5());
        autonomicVehicle2.loadContainer(airportContainerStorage.getContainer6());

        autonomicVehicle3.loadContainer(airportContainerStorage.getContainer7());
        autonomicVehicle3.loadContainer(airportContainerStorage.getContainer8());
    }
}

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
        csvManagement.generatePassengers();

        // Implement baggage logistic
        ConveyorBelt conveyorBelt = new ConveyorBelt();
        AirportContainerStorage airportContainerStorage = new AirportContainerStorage();
        RoboterArm roboterArm = new RoboterArm(new AirportBaggageStorage(10, 10, 5), conveyorBelt, airportContainerStorage);
        Weigh weigh = new Weigh(conveyorBelt, csvManagement.getBaggages());

        roboterArm.takeBaggageFromConveyorBelt();
        roboterArm.storeBaggageInContainers();


        // print Boarding Passes
        Printer.printBoardingPass();


        // FederalPolice, FederalPoliceOfficer and Prison
        // initialize Federal Police and Officers
        FederalPolice federalPolice = new FederalPolice();


        //initialize AutonomicVehicle
        AutonomicVehicle autonomicVehicle = new AutonomicVehicle(airportContainerStorage);

        // initialize Lifter
        Lifter lifter = new Lifter("Lifter");

        // Output the state of the system
        System.out.println("Federal Police Officers: " + federalPolice.getOfficers().size());
        System.out.println("Prisons: " + federalPolice.getPrisons().size());
        System.out.println("Organisation Unit Officers: " + OrganisationUnit.getOfficers().size());
        System.out.println("Organisation Unit Vehicles: " + OrganisationUnit.getVehicles().size());
        System.out.println("Lifter initialized: " + lifter.getId());
        //made the getOfficers and getVehicles var static, means that it belongs to the class itself rather than to instances of the class.





        //start Boarding Process
        Boarding.startBoarding();

        // Generate Reports after Boarding
        Reports.generateReports(Boarding.getBoardingPasses());

        // initialize prison
        Prison prison1 = new Prison();

        //initialize boarding, boardingpass, printes, reports, waitingarea
        WaitingArea waitingArea = new WaitingArea();
        Boarding boarding = new Boarding(waitingArea);
        Printer printer = new Printer();
        Reports reports = new Reports();

        // TODO please leave it at the end of file
        // Gets reference to the control unit from the engine
        JetEngineMediator jetEngineMediator;
        jetEngineMediator = airplane.getJetEngineMediator();
        // TODO add boarding pass vars
        BoardingPass boardingPass = new BoardingPass();






}
}

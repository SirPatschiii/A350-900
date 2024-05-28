public class Application {
    public static void main(String[] args) {
        // Init of airplane
        Airplane airplane = new Airplane("Lufthansa");

        // Prints data of the airplane and cabin
        System.out.println(airplane);
        System.out.println(airplane.getBody().getCabin().toString());

        // Init of airport
        Airport airport = new Airport(airplane);

        // Gets reference to the control unit from the engine
        JetEngineMediator jetEngineMediator;
        jetEngineMediator = airplane.getJetEngineMediator();

        // Simulate flight
        jetEngineMediator.startUp();
        jetEngineMediator.setSpeed(481);
        jetEngineMediator.shutdown();

        Reports reports = new Reports(airplane);
    }
}

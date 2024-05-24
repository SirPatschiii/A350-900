public class Application {
    public static void main(String[] args) {
        final JetEngineMediator jetEngineMediator;

        // Init of airplane
        Airplane airplane = new Airplane("Lufthansa");

        // Prints data of the airplane and cabin
        System.out.println(airplane);
        System.out.println(airplane.getBody().getCabin().toString());

        // TODO Airport stuff goes here:










        // TODO please leave it at the end of file
        // Gets reference to the control unit from the engine
        jetEngineMediator = airplane.getJetEngineMediator();

        // Simulate flight
        jetEngineMediator.startUp();
        jetEngineMediator.setSpeed(481);
        jetEngineMediator.shutdown();
    }
}

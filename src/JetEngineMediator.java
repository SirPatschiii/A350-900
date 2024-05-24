public class JetEngineMediator implements IJetEngineMediator {
    private final JetEngine jetEngineLeft;
    private final JetEngine jetEngineRight;
    private final FuelManagement fuelManagement;

    public JetEngineMediator(JetEngine jetEngineLeft, JetEngine jetEngineRight, FuelManagement fuelManagement) {
        this.jetEngineLeft = jetEngineLeft;
        this.jetEngineRight = jetEngineRight;
        this.fuelManagement = fuelManagement;
    }

    @Override
    public void startUp() {
        jetEngineLeft.setCurrentRPM(0);
        jetEngineRight.setCurrentRPM(0);
        jetEngineLeft.setRunning(true);
        jetEngineRight.setRunning(true);

        System.out.println("Engines are started!");
    }

    @Override
    public void setSpeed(int mph) {
        jetEngineLeft.setCurrentRPM(Configurator.INSTANCE.convertMphKmh(mph) * 10);
        jetEngineRight.setCurrentRPM(Configurator.INSTANCE.convertMphKmh(mph) * 10);
        fuelManagement.simulateFlight();
    }

    @Override
    public void shutdown() {
        jetEngineLeft.setCurrentRPM(0);
        jetEngineRight.setCurrentRPM(0);
        jetEngineLeft.setRunning(false);
        jetEngineRight.setRunning(false);

        System.out.println("Engines are shutdown!");
    }
}

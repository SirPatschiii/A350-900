public class Wing {
    private final ESide direction;
    private final JetEngine jetEngine;
    private final FuelTank fuelTank;

    public Wing(ESide direction) {
        this.direction = direction;
        jetEngine = new JetEngine(direction);
        fuelTank = new FuelTank(Configurator.INSTANCE.capacityWingTank, Configurator.INSTANCE.dimensionsWingTank);
    }

    public JetEngine getJetEngine() {
        return jetEngine;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }
}

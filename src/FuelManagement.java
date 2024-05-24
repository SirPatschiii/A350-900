public class FuelManagement {
    private final JetEngine jetEngineLeft;
    private final JetEngine jetEngineRight;
    private final FuelTank fuelTankLeft;
    private final FuelTank fuelTankRight;
    private final FuelTank fuelTankCenter;

    public FuelManagement(JetEngine jetEngineLeft,
                          JetEngine jetEngineRight,
                          FuelTank fuelTankLeft,
                          FuelTank fuelTankRight,
                          FuelTank fuelTankCenter) {
        this.jetEngineLeft = jetEngineLeft;
        this.jetEngineRight = jetEngineRight;
        this.fuelTankLeft = fuelTankLeft;
        this.fuelTankRight = fuelTankRight;
        this.fuelTankCenter = fuelTankCenter;
    }

    public void simulateFlight() {
        int rpmLeft;
        int rpmRight;
        double fuelConsumptionLeftEngine;
        double fuelConsumptionRightEngine;

        for (int i = 0; i < Configurator.INSTANCE.flightTime; i++) {
            rpmLeft = jetEngineLeft.getCurrentRPM();
            rpmRight = jetEngineLeft.getCurrentRPM();
            fuelConsumptionLeftEngine = (double) (rpmLeft / 2); // in l
            fuelConsumptionRightEngine = (double) (rpmRight / 2); // in l

            double minLeftFuel = (fuelTankLeft.getContent() - fuelConsumptionLeftEngine) / fuelTankLeft.getCapacity();
            double minRightFuel = (fuelTankRight.getContent() - fuelConsumptionRightEngine) / fuelTankRight.getCapacity();

            if (minLeftFuel <= 0.1 || minRightFuel <= 0.1) {
                // emergency backup -> take fuel from center
                fuelTankCenter.decreaseContent((int) (fuelConsumptionLeftEngine + fuelConsumptionRightEngine));
            } else {
                // take fuel from wings
                fuelTankLeft.decreaseContent((int) fuelConsumptionLeftEngine);
                fuelTankRight.decreaseContent((int) fuelConsumptionRightEngine);
            }

            System.out.println(fuelTankLeft.getContent() + " " + fuelTankCenter.getContent() + " " + fuelTankRight.getContent());
        }
    }
}

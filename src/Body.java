public class Body {
    private final Cabin cabin;
    private final CargoArea cargoArea;
    private final FuelTank fuelTank;

    public Body() {
        cabin = new Cabin();
        cargoArea = new CargoArea();
        fuelTank = new FuelTank(Configurator.INSTANCE.capacityCenterTank, Configurator.INSTANCE.dimensionsCenterTank);
    }

    public Cabin getCabin() {
        return cabin;
    }

    public CargoArea getCargoArea() {
        return cargoArea;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }
}

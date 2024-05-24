public class Body {
    private final Cabin cabin;
    private final CargoArea cargoArea;

    public Body() {
        cabin = new Cabin();
        cargoArea = new CargoArea();
    }

    public Cabin getCabin() {
        return cabin;
    }
}

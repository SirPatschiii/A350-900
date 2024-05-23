public class JetEngine {
    private final LowPressureShaft lowPressureShaft;
    private final HighPressureShaft highPressureShaft;
    private final Fan fan;
    private final LowPressureCompressor lowPressureCompressor;
    private final HighPressureCompressor highPressureCompressor;
    private final LowPressureTurbine lowPressureTurbine;
    private final HighPressureTurbine highPressureTurbine;
    private final CombustionChamber combustionChamber;

    private final ESide side;

    public JetEngine(ESide side) {
        lowPressureShaft = new LowPressureShaft();
        highPressureShaft = new HighPressureShaft();
        fan = new Fan(lowPressureShaft);
        lowPressureCompressor = new LowPressureCompressor(lowPressureShaft);
        highPressureCompressor = new HighPressureCompressor(highPressureShaft);
        lowPressureTurbine = new LowPressureTurbine(lowPressureShaft);
        highPressureTurbine = new HighPressureTurbine(highPressureShaft);
        combustionChamber = new CombustionChamber();

        this.side = side;
    }
}

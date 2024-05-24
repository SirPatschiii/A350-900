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
    private boolean isRunning;
    private final int maxRPM;
    private int currentRPM;

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
        isRunning = false;
        maxRPM = Configurator.INSTANCE.maxRPM;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public void setCurrentRPM(int currentRPM) {
        if (currentRPM > maxRPM) {
            throw new IllegalArgumentException("JetEngine can't turn faster than 10500 RPM!");
        }
        this.currentRPM = currentRPM;
    }

    public int getCurrentRPM() {
        return currentRPM;
    }
}

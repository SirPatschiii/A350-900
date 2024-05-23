public class HighPressureCompressor {
    private final Unit[] units;

    public HighPressureCompressor(HighPressureShaft highPressureShaft) {
        units = new Unit[6];

        for (int i = 0; i < 2; i++) {
            units[i] = new Unit(36, EUnitProperties.S, highPressureShaft);
        }
        for (int i = 2; i < 4; i++) {
            units[i] = new Unit(32, EUnitProperties.S, highPressureShaft);
        }
        for (int i = 4; i < 6; i++) {
            units[i] = new Unit(30, EUnitProperties.S, highPressureShaft);
        }
    }
}

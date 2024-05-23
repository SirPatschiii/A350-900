public class HighPressureTurbine {
    private final Unit unitFront;
    private final Unit unitBack;

    public HighPressureTurbine(HighPressureShaft highPressureShaft) {
        unitFront = new Unit(36, EUnitProperties.M, highPressureShaft);
        unitBack = new Unit(36, EUnitProperties.M, highPressureShaft);
    }
}

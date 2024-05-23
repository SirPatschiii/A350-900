public class LowPressureTurbine {
    private final Unit unitFront;
    private final Unit unitBack;

    public LowPressureTurbine(LowPressureShaft lowPressureShaft) {
        unitFront = new Unit(36, EUnitProperties.M, lowPressureShaft);
        unitBack = new Unit(36, EUnitProperties.M, lowPressureShaft);
    }
}

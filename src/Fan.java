public class Fan {
    private final Unit unitFront;
    private final Unit unitBack;

    public Fan(LowPressureShaft lowPressureShaft) {
        unitFront = new Unit(48, EUnitProperties.L, lowPressureShaft);
        unitBack = new Unit(45, EUnitProperties.L, lowPressureShaft);
    }
}

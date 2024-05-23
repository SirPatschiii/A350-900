public class Unit {
    private final int blade;
    private final EUnitProperties size;
    private LowPressureShaft lowPressureShaft;
    private HighPressureShaft highPressureShaft;

    public Unit(int blade, EUnitProperties size, LowPressureShaft lowPressureShaft) {
        this.blade = blade;
        this.size = size;
        this.lowPressureShaft = lowPressureShaft;
    }

    public Unit(int blade, EUnitProperties size, HighPressureShaft highPressureShaft) {
        this.blade = blade;
        this.size = size;
        this.highPressureShaft = highPressureShaft;
    }
}

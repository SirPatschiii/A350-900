public class Seat {
    private final int column;
    private final char row;
    private final EClass travelingClass;

    private final String seatDescription;

    public Seat(int column, char row, EClass travelingClass) {
        this.column = column;
        this.row = row;
        this.travelingClass = travelingClass;

        this.seatDescription = String.format("%d%c", column, row);

        // System.out.println(seatDescription + " " + travelingClass);
    }

    public String getSeatDescription() {
        return seatDescription;
    }
}

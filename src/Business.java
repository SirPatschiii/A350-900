public class Business extends AirplaneClass {
    private final char[] seatLetters;
    private final int[] rows;

    public Business() {
        super();
        seatLetters = new char[]{'A', 'C', 'D', 'G', 'H', 'K'};
        rows = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        addSeats();
    }

    @Override
    protected void addSeats() {
        for (int row : rows) {
            for (char seatLetter : seatLetters) {
                seats.addLast(new Seat(row, seatLetter, EClass.BUSINESS));
            }
        }
    }

    public char[] getSeatLetters() {
        return seatLetters;
    }

    public int[] getRows() {
        return rows;
    }
}

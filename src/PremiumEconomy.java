public class PremiumEconomy extends AirplaneClass {
    private final char[] seatLetters;
    private final int[] rows;

    public PremiumEconomy() {
        super();
        seatLetters = new char[]{'A', 'C', 'D', 'E', 'G', 'H', 'K'};
        rows = new int[]{12, 14, 15};
        addSeats();
    }

    @Override
    protected void addSeats() {
        for (int row : rows) {
            for (char seatLetter : seatLetters) {
                seats.addLast(new Seat(row, seatLetter, EClass.PREMIUM_ECONOMY));
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

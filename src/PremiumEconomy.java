public class PremiumEconomy extends AirplaneClass {
    public PremiumEconomy() {
        super();
        addSeats();
    }

    @Override
    protected void addSeats() {
        char[] seatLetters = {'A', 'C', 'D', 'E', 'G', 'H', 'K'};
        for (int i = 11; i < 12; i++) {
            for (char seatLetter : seatLetters) {
                seats.addLast(new Seat(i + 1, seatLetter, EClass.PREMIUM_ECONOMY));
            }
        }
        for (int i = 13; i < 15; i++) {
            for (char seatLetter : seatLetters) {
                seats.addLast(new Seat(i + 1, seatLetter, EClass.PREMIUM_ECONOMY));
            }
        }
    }
}

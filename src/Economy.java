public class Economy extends AirplaneClass {
    public Economy() {
        super();
        addSeats();
    }

    @Override
    protected void addSeats() {
        char[] seatLetters = {'A', 'C', 'D', 'E', 'G'};
        for (int i = 15; i < 16; i++) {
            for (char seatLetter : seatLetters) {
                seats.addLast(new Seat(i + 1, seatLetter, EClass.ECONOMY));
            }
        }
        seatLetters = new char[]{'A', 'B', 'C', 'D', 'E', 'G', 'H', 'J', 'K'};
        for (int i = 17; i < 26; i++) {
            for (char seatLetter : seatLetters) {
                seats.addLast(new Seat(i + 1, seatLetter, EClass.ECONOMY));
            }
        }
        seatLetters = new char[]{'B', 'C', 'D', 'E', 'G', 'H', 'J'};
        for (int i = 26; i < 27; i++) {
            for (char seatLetter : seatLetters) {
                seats.addLast(new Seat(i + 1, seatLetter, EClass.ECONOMY));
            }
        }
        seatLetters = new char[]{'A', 'B', 'C', 'D', 'E', 'G', 'H', 'J', 'K'};
        for (int i = 27; i < 41; i++) {
            for (char seatLetter : seatLetters) {
                seats.addLast(new Seat(i + 1, seatLetter, EClass.ECONOMY));
            }
        }
        seatLetters = new char[]{'A', 'C', 'D', 'E', 'G'};
        for (int i = 41; i < 42; i++) {
            for (char seatLetter : seatLetters) {
                seats.addLast(new Seat(i + 1, seatLetter, EClass.ECONOMY));
            }
        }
    }
}

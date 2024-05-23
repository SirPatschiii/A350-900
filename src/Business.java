public class Business extends AirplaneClass {
    public Business() {
        super();
        addSeats();
    }

    @Override
    protected void addSeats() {
        char[] seatLetters = {'A', 'C', 'D', 'G', 'H', 'K'};
        for (int i = 0; i < Configurator.INSTANCE.capacityBusinessClass / seatLetters.length; i++) {
            for (char seatLetter : seatLetters) {
                seats.addLast(new Seat(i + 1, seatLetter, EClass.BUSINESS));
            }
        }
    }
}

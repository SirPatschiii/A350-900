public class BoardingPass {
    private final String passengerName;
    private final String firstName;
    private final String lastName;
    private final String flight;
    private final String seat;
    private final EClass eClass;

    public BoardingPass(String passengerName, String firstName, String lastName, String flight, String seat, EClass eClass) {
        this.passengerName = passengerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.flight = flight;
        this.seat = seat;
        this.eClass = eClass;
    }

    public String getSeat() {
        return seat;
    }

    public EClass getEClass() {
        return eClass;
    }

    @Override
    public String toString() {
        return "BoardingPass: " + lastName + " " + firstName + "; " + "Class: " + eClass + "; Seat: " + seat;
    }

    public Object getPassenger() {
        return getPassenger();
    }
}

//Informationen, die auf dem BoardingPass angezeigt werden

public class BoardingPass {
    private final String passengerName;
    private final String flight;
    private final String seat;
    private final EClass eClass;

    public BoardingPass(String passengerName, String flight, String seat, EClass eClass) {
        this.passengerName = passengerName;
        this.flight = flight;
        this.seat = seat;
        this.eClass = eClass;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getFlight() {
        return flight;
    }

    public String getSeat() {
        return seat;
    }

    public EClass getEClass() {
        return eClass;
    }

    @Override
    public String toString() {
        return "BoardingPass{" +
                "passengerName='" + passengerName + '\'' +
                ", flight='" + flight + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }

    public Object getPassenger() {
        return getPassenger();
    }
}

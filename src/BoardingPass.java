//Informationen, die auf dem BoardingPass angezeigt werden

public class BoardingPass {
    private final String passengerName;
    private final String flight;
    private final String seat;
    private final String gate;

    public BoardingPass(String passengerName, String flight, String seat, String gate){
        this.passengerName = passengerName;
        this.flight = flight;
        this.seat = seat;
        this.gate = gate;
    }
    public String getPassengerName(){
        return passengerName;
    }
    public String getFlight(){
        return flight;
    }
    public String getSeat(){
        return seat;
    }
    public String getGate(){
        return gate;
    }
    @Override
    public String toString() {
        return "BoardingPass{" +
                "passengerName='" + passengerName + '\'' +
                ", flight='" + flight + '\'' +
                ", seat='" + seat + '\'' +
                ", gate='" + gate + '\'' +
                '}';
    }

    public Object getPassenger() {
        return getPassenger();
    }
}

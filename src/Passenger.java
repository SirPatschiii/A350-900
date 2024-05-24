public class Passenger {
    private int id;
    private Baggage baggage;
    private CSVManagement csv;
    public Passenger () {
        // this.baggage = new Baggage(id);
        Passenger passenger = new Passenger(csv.generatePassengers());
    }


    public Baggage getBaggage() {
        return baggage;
    }
}

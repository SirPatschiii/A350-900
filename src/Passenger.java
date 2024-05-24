public class Passenger {
    private int id;
    private Baggage baggage;

    public Passenger(int id) {
        this.id = id;
        this.baggage = new Baggage(id);
    }

    public int getId() {
        return id;
    }

    public Baggage getBaggage() {
        return baggage;
    }
}

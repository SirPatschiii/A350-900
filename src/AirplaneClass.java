import java.util.ArrayList;

public abstract class AirplaneClass {
    protected final ArrayList<Seat> seats;

    public AirplaneClass() {
        seats = new ArrayList<>();
    }

    protected abstract void addSeats();

    public ArrayList<Seat> getSeats() {
        return seats;
    }
}

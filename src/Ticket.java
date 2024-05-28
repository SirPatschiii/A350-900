import java.util.UUID;

public class Ticket {
    private final UUID uuid;
    private final String bookingID;
    private final String flight;
    private final String from;
    private final String to;
    private final String departure;
    private final String arrival;
    private final EClass bookingClass;
    private final String seat;

    public Ticket(String bookingID, String flight, String from, String to, String departure, String arrival, EClass bookingClass, String seat) {
        this.uuid = UUID.randomUUID();
        this.bookingID = bookingID;
        this.flight = flight;
        this.from = from;
        this.to = to;
        this.departure = departure;
        this.arrival = arrival;
        this.bookingClass = bookingClass;
        this.seat = seat;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getBookingID() {
        return bookingID;
    }

    public String getFlight() {
        return flight;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public EClass getBookingClass() {
        return bookingClass;
    }

    public String getSeat() {
        return seat;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "uuid=" + uuid +
                ", bookingID='" + bookingID + '\'' +
                ", flight='" + flight + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", bookingClass='" + bookingClass + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }
}

import java.time.LocalDate;

public class Passenger extends Human {
    private int id;
    private Baggage baggage;
    private String passportID;
    private final boolean warrant;
    private final String bookingID;
    private BoardingPass boardingPass;

    public Passenger(String firstName,
                     String lastName,
                     EGender gender,
                     LocalDate dateOfBirth,
                     double weight,
                     double height,
                     String hairColor,
                     String passportID,
                     boolean warrant,
                     String bookingID,
                     String fingerprint,
                     String iris) {
        super(firstName, lastName, gender, dateOfBirth, weight, height, hairColor, fingerprint, iris);
        this.passportID = passportID;
        this.warrant = warrant;
        this.bookingID = bookingID;
    }

    public Baggage getBaggage() {
        return baggage;
    }

    public String getPassportID() {
        return passportID;
    }

    public boolean isWarrant() {
        return warrant;
    }

    public String getBookingID() {
        return bookingID;
    }

    public BoardingPass getBoardingPass() {
        return boardingPass;
    }

    public void setBoardingPass(BoardingPass boardingPass) {
        this.boardingPass = boardingPass;
    }
}

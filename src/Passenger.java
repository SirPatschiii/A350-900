import java.time.LocalDate;

public class Passenger extends Human{
    private int id;
    private Baggage baggage;
    private CSVManagement csv;
    private String passport;
    private final boolean warrant;

    public Passenger (String firstName, String lastName, EGender gender, LocalDate dateOfBirth, double weight, double height, String hairColor, String passport, boolean warrant) {
        super(firstName, lastName, gender, dateOfBirth, weight, height, hairColor);
        this.passport = passport;
        this.warrant = warrant;
    }

    public int getId(){
        return id;
    }


    public Baggage getBaggage() {
        return baggage;
    }

    public String getPassport() {
        return passport;
    }

    public boolean isWarrant() {
        return warrant;
    }
}

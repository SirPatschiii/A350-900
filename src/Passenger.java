import java.time.LocalDate;

public class Passenger extends Human{
    private int id;
    private Baggage baggage;
    private CSVManagement csv;
    public Passenger (String firstName, String lastName, String gender, LocalDate dateOfBirth, double weight, double height, String hairColor) {
        super(firstName, lastName, gender, dateOfBirth, weight, height, hairColor);
    }

    public int getId(){
        return id;
    }


    public Baggage getBaggage() {
        return baggage;
    }
}

import java.util.ArrayList;

public class ReaderPassport extends Reader {
    private final CSVManagement csvManagement;

    public ReaderPassport(CSVManagement csvManagement) {
        this.csvManagement = csvManagement;
    }

    @Override
    protected boolean authenticate(ArrayList<Passport> passports, Passenger passenger) {
        String passangerPassportID = passenger.getPassportID();

        for (Passport passport : passports) {
            if (passport.getPassportID().equals(passangerPassportID)) {
                return true;
            }
        }
        return false;
    }
}

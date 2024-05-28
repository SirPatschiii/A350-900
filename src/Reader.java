import java.util.ArrayList;

public abstract class Reader {
    public Reader() {

    }

    protected boolean authenticate(String ident) {
        return false;
    }

    protected boolean authenticate(ArrayList<Passport> passports, Passenger passenger) {
        return false;
    }
}

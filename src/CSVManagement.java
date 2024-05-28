import java.time.LocalDate;
import java.util.ArrayList;
import java.util.TreeMap;

public class CSVManagement {
    private ReadCSV readCSV;
    private ArrayList<String> ownerList;
    private ArrayList<EClass> eClassList;
    private ArrayList<Integer> seqList;
    private ArrayList<ArrayList<Double>> weightList;
    private ArrayList<Integer> amountBaggageList;
    private final ArrayList<Baggage> baggages;
    private final ArrayList<Passenger> passengers;

    private int c;

    private ArrayList<EGender> genderList;
    private ArrayList<String> nameList;
    private ArrayList<LocalDate> dateOfBirthList;
    private ArrayList<String> passportIdList;
    private final boolean[] warrants;
    private final ArrayList<String> bookingIDList;
    private TreeMap<String,Ticket> tickets;

    public CSVManagement() {
        readCSV = new ReadCSV();
        seqList = new ArrayList<>(readCSV.getSeq());
        eClassList = new ArrayList<>(readCSV.getBookingClass());
        ownerList = new ArrayList<>(readCSV.getName());
        weightList = new ArrayList<>(readCSV.getWeightBaggage());
        amountBaggageList = new ArrayList<>(readCSV.getAmountBaggage());
        baggages = new ArrayList<>();
        dateOfBirthList = new ArrayList<>(readCSV.getDateOfBirth());
        genderList = new ArrayList<>(readCSV.getGender());
        passportIdList = new ArrayList<>(readCSV.getPassportID());
        nameList = new ArrayList<>(readCSV.getName());
        warrants = readCSV.getWarrants();
        passengers = new ArrayList<>();
        bookingIDList = new ArrayList<>(readCSV.getBookingID());
        tickets = new TreeMap<>();
    }

    public void generateBaggage() {
        c = 0;
        for (int i = 0; i < seqList.size(); i++) {
            ArrayList<Double> weightL = weightList.removeFirst();

            for (int j = 0; j < weightL.size(); j++) {
                baggages.addLast(new Baggage(c, weightL.removeFirst(), ownerList.getFirst(), eClassList.getFirst()));
                c++;
            }
            ownerList.removeFirst();
            eClassList.removeFirst();
        }
    }

    //generate passengers
    public void generatePassengers() {
        c = 0;
        String firstName;
        String lastName;
        EGender gender;
        LocalDate dateOfBirth;
        boolean warrant;

        for (String passportID : passportIdList) {
            String[] temp = nameList.removeFirst().split(" ");
            firstName = temp[0];
            lastName = temp[1];
            gender = genderList.removeFirst();
            dateOfBirth = dateOfBirthList.removeFirst();
            warrant = warrants[c];

            passengers.addLast(new Passenger(firstName, lastName, gender, dateOfBirth, 70, 175, "brown", passportID, warrant));
            c++;
        }
    }

    public void generateTickets(){
        ArrayList<String> flightList = readCSV.getFlight();
        ArrayList<String> fromList = readCSV.getFrom();
        ArrayList<String> toList = readCSV.getTo();
        ArrayList<String> departureList = readCSV.getDeparture();
        ArrayList<String> arrivalList = readCSV.getArrival();
        ArrayList<EClass> bookingClassList = readCSV.getBookingClass();
        ArrayList<String> seatList = readCSV.getSeat();

        for (String bookingID : bookingIDList) {
            String flight = flightList.removeFirst();
            String from = fromList.removeFirst();
            String to = toList.removeFirst();
            String departure = departureList.removeFirst();
            String arrival =  arrivalList.removeFirst();
            EClass bookingClass = bookingClassList.removeFirst();
            String seat = seatList.removeFirst();

            tickets.put(bookingID, new Ticket(bookingID, flight, from, to, departure, arrival, bookingClass,seat));
        }

    }
    public ArrayList<Baggage> getBaggages() {
        return baggages;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

}

import java.time.LocalDate;
import java.util.ArrayList;

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

    //listen erstelllen aus human name(first, last name), gender, date of birth des was bei human in konstruktor steht an den passenger liefern+id vom passport

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

    public ArrayList<Baggage> getBaggages() {
        return baggages;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

}

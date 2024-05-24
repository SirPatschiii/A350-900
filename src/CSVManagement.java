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


    private int c;

    private ArrayList<EGender> gender;
    private ArrayList<String> firstName;
    private ArrayList<String> lastName;
    private ArrayList<LocalDate> dateOfBirth;
    private ArrayList<String> passportId;
    private ArrayList<String> passengerAttributes;
    //listen erstelllen aus human name(first, last name), gender, date of birth des was bei human in konstruktor steht an den passenger liefern+id vom passport

    public CSVManagement() {
        readCSV = new ReadCSV();
        seqList = new ArrayList<>(readCSV.getSeq());
        eClassList = new ArrayList<>(readCSV.getBookingClass());
        ownerList = new ArrayList<>(readCSV.getName());
        weightList = new ArrayList<>(readCSV.getWeightBaggage());
        amountBaggageList = new ArrayList<>(readCSV.getAmountBaggage());
        baggages = new ArrayList<>();
        dateOfBirth = new ArrayList<>(readCSV.getDateOfBirth());
        gender = new ArrayList<>(readCSV.getGender());
        passportId = new ArrayList<>(readCSV.getPassportID());
        firstName = new ArrayList<>(readCSV.getName());
        lastName = new ArrayList<>(readCSV.getName());
        passengerAttributes = new ArrayList<>(this.passengerAttributes);
    }

    public void generateBaggage() {
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
    public void generatePassengers(){
        for (int i = 0;i<294;i++){
            firstName[i].add(ownerList[i].split(" "),0);
            lastName[i].add(ownerList[i].split(" "),1);

            ArrayList<String> passengerAttributes = passengerAttributes.add(gender.getFirst();
            passengerAttributes[i].add(lastName[i]);
            passengerAttributes[i].add(gender[i]);
            passengerAttributes[i].add(dateOfBirth[i]);
            passengerAttributes[i].add(passportId[i]);
            ;
        }
    }

    public ArrayList<Baggage> getBaggages() {
        return baggages;
    }
}



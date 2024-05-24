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

    public CSVManagement() {
        readCSV = new ReadCSV();
        seqList = new ArrayList<>(readCSV.getSeq());
        eClassList = new ArrayList<>(readCSV.getBookingClass());
        ownerList = new ArrayList<>(readCSV.getName());
        weightList = new ArrayList<>(readCSV.getWeightBaggage());
        amountBaggageList = new ArrayList<>(readCSV.getAmountBaggage());
        baggages = new ArrayList<>();
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

    public ArrayList<Baggage> getBaggages() {
        return baggages;
    }
}

import java.util.ArrayList;

public class CSVManagement {
    private ReadCSV readCSV;
    private ArrayList<String> ownerList;
    private ArrayList<EClass> eClassList;
    private ArrayList<Integer> seqList;
    private ArrayList<ArrayList<Double>> weightList;
    private ArrayList<Integer> amountBaggageList;

    public CSVManagement(){
        readCSV = new ReadCSV();
        seqList = new ArrayList<>(readCSV.getSeq());
        eClassList = new ArrayList<>(readCSV.getBookingClass());
        ownerList = new ArrayList<>(readCSV.getName());
        weightList = new ArrayList<>(readCSV.getWeightBaggage());
        amountBaggageList = new ArrayList<>(readCSV.getAmountBaggage());
    }

    public void generateBaggage(){
        for(int i = 0; i < 354; i++){
            int id = i +1;

        }
    }
}

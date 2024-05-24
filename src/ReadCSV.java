import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadCSV {
    private BufferedReader bufferedReader;

    private final ArrayList<Integer> seq;
    private final ArrayList<String> role;
    private final ArrayList<String> name;
    private final ArrayList<EGender> gender;
    private final ArrayList<LocalDate> dateOfBirth;
    private final ArrayList<String> passportID;
    private final ArrayList<String> iris;
    private final ArrayList<String> fingerprint;
    private final ArrayList<String> bookingID;
    private final ArrayList<String> flight;
    private final ArrayList<String> from;
    private final ArrayList<String> to;
    private final ArrayList<String> departure;
    private final ArrayList<String> arrival;
    private final ArrayList<String> bookingClass;
    private final ArrayList<String> seat;
    private final ArrayList<Integer> amountBaggage;
    private final ArrayList<ArrayList<Double>> weightBaggage;
    private final boolean[] warrants;

    private int c;

    public ReadCSV() {
        seq = new ArrayList<>();
        role = new ArrayList<>();
        name = new ArrayList<>();
        gender = new ArrayList<>();
        dateOfBirth = new ArrayList<>();
        passportID = new ArrayList<>();
        iris = new ArrayList<>();
        fingerprint = new ArrayList<>();
        bookingID = new ArrayList<>();
        flight = new ArrayList<>();
        from = new ArrayList<>();
        to = new ArrayList<>();
        departure = new ArrayList<>();
        arrival = new ArrayList<>();
        bookingClass = new ArrayList<>();
        seat = new ArrayList<>();
        amountBaggage = new ArrayList<>();
        weightBaggage = new ArrayList<>();
        warrants = new boolean[293];

        openReader();
        readFile();
        closeReader();
    }

    public void storeData(String[] tokenArray) {
        seq.addLast(Integer.valueOf(tokenArray[0]));
        role.addLast(tokenArray[1]);
        name.addLast(tokenArray[2]);
        gender.addLast(EGender.valueOf(tokenArray[3]));
        dateOfBirth.addLast(LocalDate.parse(tokenArray[4]));
        passportID.addLast(tokenArray[5]);
        iris.addLast(tokenArray[6]);
        fingerprint.addLast(tokenArray[7]);
        bookingID.addLast(tokenArray[8]);
        flight.addLast(tokenArray[9]);
        from.addLast(tokenArray[10]);
        to.addLast(tokenArray[11]);
        departure.addLast(tokenArray[12]);
        arrival.addLast(tokenArray[13]);
        bookingClass.addLast(tokenArray[14]);
        seat.addLast(tokenArray[15]);
        amountBaggage.addLast(Integer.valueOf(tokenArray[16]));

        String[] tempS = tokenArray[17].split(" ");
        ArrayList<Double> tempD = new ArrayList<>();
        for (String temp : tempS) {
            tempD.addLast(Double.valueOf(temp));
        }
        weightBaggage.addLast(tempD);

        if (tokenArray[18].equals("NO"))
            warrants[c] = false;
        else {
            warrants[c] = true;
        }
        c++;
    }

    private void openReader() {
        try {
            bufferedReader = new BufferedReader(new FileReader(Configurator.INSTANCE.pathCSV));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void readFile() {
        try {
            String line;
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] tokenArray = line.split(Configurator.INSTANCE.csvDelimiter);
                storeData(tokenArray);
                System.out.println(Arrays.toString(tokenArray));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void closeReader() {
        try {
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Integer> getSeq() {
        return seq;
    }

    public ArrayList<String> getRole() {
        return role;
    }

    public ArrayList<String> getName() {
        return name;
    }

    public ArrayList<EGender> getGender() {
        return gender;
    }

    public ArrayList<LocalDate> getDateOfBirth() {
        return dateOfBirth;
    }

    public ArrayList<String> getPassportID() {
        return passportID;
    }

    public ArrayList<String> getIris() {
        return iris;
    }

    public ArrayList<String> getFingerprint() {
        return fingerprint;
    }

    public ArrayList<String> getBookingID() {
        return bookingID;
    }

    public ArrayList<String> getFlight() {
        return flight;
    }

    public ArrayList<String> getFrom() {
        return from;
    }

    public ArrayList<String> getTo() {
        return to;
    }

    public ArrayList<String> getDeparture() {
        return departure;
    }

    public ArrayList<String> getArrival() {
        return arrival;
    }

    public ArrayList<String> getBookingClass() {
        return bookingClass;
    }

    public ArrayList<String> getSeat() {
        return seat;
    }

    public ArrayList<Integer> getAmountBaggage() {
        return amountBaggage;
    }

    public ArrayList<ArrayList<Double>> getWeightBaggage() {
        return weightBaggage;
    }

    public boolean[] getWarrants() {
        return warrants;
    }
}

import java.util.ArrayList;

public class ReaderFingerprint extends Reader {
    private final CSVManagement csvManagement;

    public ReaderFingerprint(CSVManagement csvManagement) {
        this.csvManagement = csvManagement;
    }

    @Override
    protected boolean authenticate(String ident) {
        ArrayList<String> fingerprints = csvManagement.getReadCSV().getFingerprint();

        for (String fingerprint : fingerprints) {
            if (fingerprint.equals(ident)) {
                return true;
            }
        }
        return false;
    }
}

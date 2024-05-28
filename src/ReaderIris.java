import java.util.ArrayList;

public class ReaderIris extends Reader {
    private final CSVManagement csvManagement;

    public ReaderIris(CSVManagement csvManagement) {
        this.csvManagement = csvManagement;
    }

    @Override
    protected boolean authenticate(String ident) {
        ArrayList<String> irises = csvManagement.getReadCSV().getIris();

        for (String iris : irises) {
            if (iris.equals(ident)) {
                return true;
            }
        }
        return false;
    }
}

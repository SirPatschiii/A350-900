import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public enum LogEngine {
    INSTANCE;

    public BufferedWriter bufferedWriter;

    public void init(int index) {
        try {
            switch (index) {
                case 0 -> bufferedWriter = new BufferedWriter(new FileWriter(Configurator.INSTANCE.reportFile1));
                case 1 -> bufferedWriter = new BufferedWriter(new FileWriter(Configurator.INSTANCE.reportFile2));
                case 2 -> bufferedWriter = new BufferedWriter(new FileWriter(Configurator.INSTANCE.reportFile3));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void write(String line) {
        try {
            bufferedWriter.write(line + Configurator.INSTANCE.lineSeparator);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void close() {
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

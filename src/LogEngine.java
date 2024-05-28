import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public enum LogEngine {
    INSTANCE;

    public BufferedWriter bufferedWriter;

    public void init() {
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(Configurator.INSTANCE.logFile));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void write(String line) {
        try {
            bufferedWriter.write(getDateStamp() + " : " + line + Configurator.INSTANCE.lineSeparator);
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    public void close() {
        try {
            bufferedWriter.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    private String getDateStamp() {
        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return Instant.ofEpochSecond(Instant.now().getEpochSecond())
                .atZone(ZoneId.of("GMT+1"))
                .format(dateTimeFormatter);
    }
}
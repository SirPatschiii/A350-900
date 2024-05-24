import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CheckIn {
    private CheckInDesk[] checkInDesks;

    public CheckIn(int numDesks) {
        checkInDesks = new CheckInDesk[numDesks];
        for (int i = 0; i < numDesks; i++) {
            checkInDesks[i] = new CheckInDesk(i + 1);
        }
    }

    public void initializePassengers(List<Passenger> passengers) {
        int deskIndex = 0;
        for (Passenger passenger : passengers) {
            checkInDesks[deskIndex].enqueuePassenger(passenger);
            deskIndex = (deskIndex + 1) % checkInDesks.length;
        }
    }

    public List<Passenger> readPassengersFromCSV(String filePath) {
        List<Passenger> passengers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int id = 1;
            while ((line = br.readLine()) != null) {
                // Assuming each line is a new passenger
                //passengers.add(new Passenger(id));
                id++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return passengers;
    }

    public void startCheckInProcess() {
        boolean allQueuesEmpty;
        do {
            allQueuesEmpty = true;
            for (CheckInDesk desk : checkInDesks) {
                if (!desk.queue.isEmpty()) {
                    desk.processPassenger();
                    allQueuesEmpty = false;
                }
            }
        } while (!allQueuesEmpty);
    }
}

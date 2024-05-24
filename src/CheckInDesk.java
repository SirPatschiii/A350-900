import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class CheckInDesk {
    private int id;
    Queue<Passenger> queue;
    private static final int MAX_CAPACITY = 30;
    private Reader passportReader;
    private Reader irisReader;
    private Reader fingerPrintReader;
    private String conveyorBelt = "ConveyorBelt";
    private String printer = "Printer";

    public CheckInDesk(int id) {
        this.id = id;
        this.queue = new LinkedList<>();
        this.passportReader = new PassportReader();
        this.irisReader = new IrisReader();
        this.fingerPrintReader = new FingerPrintReader();
    }

    public void enqueuePassenger(Passenger passenger) {
        if (queue.size() < MAX_CAPACITY) {
            queue.add(passenger);
            System.out.println("Passenger " + passenger.getId() + " added to queue at Desk " + id);
        } else {
            System.out.println("Queue at Desk " + id + " is full. Passenger " + passenger.getId() + " cannot be added.");
        }
    }

    public void authenticatePassenger(Passenger passenger) {
        Random random = new Random();
        int choice = random.nextInt(3);
        switch (choice) {
            case 0:
                passportReader.authenticate(passenger);
                break;
            case 1:
                irisReader.authenticate(passenger);
                break;
            case 2:
                fingerPrintReader.authenticate(passenger);
                break;
        }
    }

    public void processPassenger() {
        if (!queue.isEmpty()) {
            Passenger passenger = queue.poll();
            authenticatePassenger(passenger);
            System.out.println("Passenger " + passenger.getId() + " is processed at Desk " + id + " using " + conveyorBelt + " and " + printer);
        } else {
            System.out.println("No passengers in queue at Desk " + id);
        }
    }
}

import java.util.Random;

public class WaitingArea {
    private Passenger[][] passengerWaitingArea;

    public WaitingArea() {
        passengerWaitingArea = new Passenger[20][30];
    }

    public void addPassanger(Passenger passenger) {
        Random r = new Random();
        int x1;
        int x2;
        do {
            x1 = r.nextInt(0, 19);
            x2 = r.nextInt(0, 29);
        } while (passengerWaitingArea[x1][x2] != null);

        passengerWaitingArea[x1][x2] = passenger;
    }

    public Passenger[][] getPassengerWaitingArea() {
        return passengerWaitingArea;
    }
}

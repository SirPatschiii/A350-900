import java.util.ArrayList;

public class CheckIn {
    private CheckInDesk[] checkInDesks;
    private final ArrayList<Passenger> passengers;

    public CheckIn(CSVManagement csvManagement, ArrayList<Passenger> passengers) {
        checkInDesks = new CheckInDesk[10];
        initDesks(csvManagement);
        this.passengers = passengers;
    }

    private void initDesks(CSVManagement csvManagement) {
        for (int i = 0; i < 10; i++) {
            checkInDesks[i] = (new CheckInDesk(csvManagement));
        }
    }

    public void lineupPassangers() {
        int c = 0;

        for (Passenger passenger : passengers) {
            checkInDesks[c % 10].appendPassanger(passenger);
            c++;
        }
    }

    public void authenticatePassangers(ArrayList<Passport> passports) {
        for (int i = 0; i < 10; i++) {
            checkInDesks[i].authenticatePassangers(passports);
        }
    }

    public void searchForWarrant(FederalPoliceOfficer federalPoliceOfficer) {
        for (int i = 0; i < 10; i++) {
            checkInDesks[i].searchForWarrant(federalPoliceOfficer);
        }
    }

    public void lineupBaggages(Weigh weigh) {
        for (int i = 0; i < 10; i++) {
            checkInDesks[i].lineupBaggages(weigh);
        }
    }

    public void printBoardingPass() {
        for (int i = 0; i < 10; i++) {
            checkInDesks[i].printBoardingPass();
        }
    }

    public void sendPassangerToWaitingArea(WaitingArea waitingArea) {
        for (int i = 0; i < 10; i++) {
            checkInDesks[i].sendPassangerToWaitingArea(waitingArea);
        }
    }
}

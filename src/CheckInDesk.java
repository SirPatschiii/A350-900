import java.util.*;

public class CheckInDesk {
    private final CSVManagement csvManagement;

    private final Queue<Passenger> passengerQueue;
    private final ReaderIris readerIris;
    private final ReaderFingerprint readerFingerprint;
    private final ReaderPassport readerPassport;
    private final Printer printer;

    ArrayList<Baggage> baggages;

    public CheckInDesk(CSVManagement csvManagement) {
        this.csvManagement = csvManagement;

        passengerQueue = new LinkedList<>();
        readerIris = new ReaderIris(csvManagement);
        readerFingerprint = new ReaderFingerprint(csvManagement);
        readerPassport = new ReaderPassport(csvManagement);
        printer = new Printer();

        baggages = csvManagement.getBaggages();
    }

    public void appendPassanger(Passenger passenger) {
        passengerQueue.add(passenger);
    }

    public void authenticatePassangers(ArrayList<Passport> passports) {
        Random r = new Random();
        int temp;

        for (Passenger passenger : passengerQueue) {
            temp = r.nextInt(0, 2);
            switch (temp) {
                case 0 -> {
                    readerIris.authenticate(passenger.getHead().getIris());
                }
                case 1 -> {
                    readerFingerprint.authenticate(passenger.getLeftArm().getHand().getFingerprint());
                }
                case 2 -> {
                    readerPassport.authenticate(passports, passenger);
                }
                default -> throw new IllegalArgumentException("Wrong random value!");
            }
        }
    }

    public void searchForWarrant(FederalPoliceOfficer federalPoliceOfficer) {
        Stack<Baggage> bagStack = new Stack<>();
        Stack<Passenger> pasStack = new Stack<>();
        for (Passenger passenger : passengerQueue) {
            if (passenger.isWarrant()) {
                for (Baggage baggage : baggages) {
                    if (baggage.getOwner().equals(passenger.firstName + " " + passenger.lastName)) {
                        federalPoliceOfficer.arrestPassenger(passenger, baggage);
                        bagStack.push(baggage);
                    }
                }
                pasStack.push(passenger);
            }
        }
        for (Baggage baggage : bagStack) {
            baggages.remove(baggage);
        }
        for (Passenger passenger : pasStack) {
            passengerQueue.remove(passenger);
        }
    }

    public void lineupBaggages(Weigh weigh) {
        for (Passenger passenger : passengerQueue) {
            for (Baggage baggage : csvManagement.getBaggages()) {
                if (baggage.getOwner().equals(passenger.firstName + " " + passenger.lastName)) {
                    weigh.addBaggage(baggage);
                }
            }
        }
    }

    public void printBoardingPass() {
        HashMap<Passenger, Ticket> passTickMap = csvManagement.getPassengerTicketHashMap();
        Ticket tempTicket;
        String flight;
        String seat;
        EClass eClass;
        for (Passenger passenger : passengerQueue) {
            tempTicket = passTickMap.get(passenger);
            flight = tempTicket.getFlight();
            seat = tempTicket.getSeat();
            eClass = tempTicket.getBookingClass();
            BoardingPass boardingPass = new BoardingPass(passenger.firstName + " " + passenger.lastName, passenger.firstName, passenger.lastName, flight, seat, eClass);
            passenger.setBoardingPass(boardingPass);
            printer.printBoardingPass(boardingPass);
        }
    }

    public void sendPassangerToWaitingArea(WaitingArea waitingArea) {
        for (Passenger passenger : passengerQueue) {
            waitingArea.addPassanger(passenger);
        }
    }
}

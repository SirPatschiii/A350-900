import java.util.ArrayList;
import java.util.List;

public class Boarding {
    private final WaitingArea waitingArea;
    private final List<BoardingPass> boardingPasses;

    public Boarding(WaitingArea waitingArea) {
        this.waitingArea = waitingArea;  // Correct assignment
        this.boardingPasses = new ArrayList<>();
    }

    public void addBoardingPass(BoardingPass boardingPass) {
        boardingPasses.add(boardingPass);
    }

    public void startBoarding() {
        /* if (!waitingArea.isAllPassengersPresent()) {
            System.out.println("Not all passengers are present in the waiting area.");
            return;
        } */

        // Boarding process logic
        for (Passenger passenger : waitingArea.getPassengers()) {
            BoardingPass boardingPass = getBoardingPassForPassenger(passenger);
            if (boardingPass != null) {
                System.out.println("Boarding passenger: " + passenger.getFirstName() + " with seat " + boardingPass.getSeat());
            } else {
                System.out.println("No boarding pass found for passenger: " + passenger.getFirstName());
            }
        }
    }

    private BoardingPass getBoardingPassForPassenger(Passenger passenger) {
        for (BoardingPass boardingPass : boardingPasses) {
            if (boardingPass.getPassengerName().equals(passenger.firstName + " " + passenger.lastName)) {
                return boardingPass;
            }
        }
        return null;
    }

    public List<BoardingPass> getBoardingPasses() {
        return boardingPasses;
    }
}

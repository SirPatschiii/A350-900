import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Boarding {
    private final WaitingArea waitingArea;
    private final Queue<Passenger> passengersBusiness;
    private final Queue<Passenger> passengersPremiumEconomy;
    private final Queue<Passenger> passengersEconomy;

    public Boarding(WaitingArea waitingArea) {
        this.waitingArea = waitingArea;
        passengersBusiness = new LinkedList<>();
        passengersPremiumEconomy = new LinkedList<>();
        passengersEconomy = new LinkedList<>();
    }

    public void startBoarding(Cabin cabin) {
        Passenger[][] passengerWaitingArea = waitingArea.getPassengerWaitingArea();
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 30; j++) {
                Passenger tempPassanger = passengerWaitingArea[i][j];
                if (tempPassanger != null) {
                    switch (tempPassanger.getBoardingPass().getEClass()) {
                        case BUSINESS -> passengersBusiness.add(tempPassanger);
                        case PREMIUM_ECONOMY -> passengersPremiumEconomy.add(tempPassanger);
                        case ECONOMY -> passengersEconomy.add(tempPassanger);
                    }
                }
            }
        }

        ArrayList<Seat> businessSeats = cabin.getBusinessClass().getSeats();
        ArrayList<Seat> premiumEconomySeats = cabin.getPremiumEconomyClass().getSeats();
        ArrayList<Seat> economySeats = cabin.getEconomyClass().getSeats();

        for (Passenger passenger : passengersBusiness) {
            for (Seat seat : businessSeats) {
                if (seat.getSeatDescription().equals(passenger.getBoardingPass().getSeat())) {
                    seat.setPassenger(passenger);
                }
            }
        }

        for (Passenger passenger : passengersPremiumEconomy) {
            for (Seat seat : premiumEconomySeats) {
                if (seat.getSeatDescription().equals(passenger.getBoardingPass().getSeat())) {
                    seat.setPassenger(passenger);
                }
            }
        }

        for (Passenger passenger : passengersEconomy) {
            for (Seat seat : economySeats) {
                if (seat.getSeatDescription().equals(passenger.getBoardingPass().getSeat())) {
                    seat.setPassenger(passenger);
                }
            }
        }
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Reports {
    private final Airplane airplane;
    private ArrayList<Seat> seats;

    public Reports(Airplane airplane) {
        this.airplane = airplane;

        seats = new ArrayList<>();

        getSeatList();

        generateReportBySeat();
        generateReportByName();
        generateReportByEClassAndName();
    }

    private void getSeatList() {
        seats.addAll(airplane.getBody().getCabin().getBusinessClass().getSeats());
        seats.addAll(airplane.getBody().getCabin().getPremiumEconomyClass().getSeats());
        seats.addAll(airplane.getBody().getCabin().getEconomyClass().getSeats());
    }

    public void generateReportBySeat() {
        LogEngine.INSTANCE.init(0);

        for (Seat seat : seats) {
            try {
                LogEngine.INSTANCE.write(seat.getSeatDescription() + " " + seat.getPassenger().getBoardingPass().toString());
            } catch (Exception e) {
                // Do nothing on error, because nothing to log!
            }
        }

        LogEngine.INSTANCE.close();
    }

    public void generateReportByName() {
        LogEngine.INSTANCE.init(1);

        ArrayList<Passenger> passengers = new ArrayList<>();

        for (Seat seat : seats) {
            if (seat.getPassenger() != null) {
                passengers.addLast(seat.getPassenger());
            }
        }

        String[] names = new String[passengers.size()];
        int c = 0;

        for (Passenger passenger : passengers) {
            if (passenger != null) {
                names[c] = passenger.lastName + " " + passenger.firstName;
                c++;
            }
        }

        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        for (String name : names) {
            for (Passenger passenger : passengers) {
                if ((passenger.lastName + " " + passenger.firstName).equals(name)) {
                    LogEngine.INSTANCE.write(passenger.getBoardingPass().toString());
                }
            }
        }

        LogEngine.INSTANCE.close();
    }

    public void generateReportByEClassAndName() {
        LogEngine.INSTANCE.init(2);

        ArrayList<Seat> seatsBusinessClass = new ArrayList<>(airplane.getBody().getCabin().getBusinessClass().getSeats());
        ArrayList<Passenger> passengersBusinessClass = new ArrayList<>();

        for (Seat seat : seatsBusinessClass) {
            if (seat.getPassenger() != null) {
                passengersBusinessClass.addLast(seat.getPassenger());
            }
        }

        String[] namesBusiness = new String[passengersBusinessClass.size()];
        int c1 = 0;

        for (Passenger passenger : passengersBusinessClass) {
            if (passenger != null) {
                namesBusiness[c1] = passenger.lastName + " " + passenger.firstName;
                c1++;
            }
        }

        Arrays.sort(namesBusiness, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        for (String name : namesBusiness) {
            for (Passenger passenger : passengersBusinessClass) {
                if ((passenger.lastName + " " + passenger.firstName).equals(name)) {
                    LogEngine.INSTANCE.write(passenger.getBoardingPass().toString());
                }
            }
        }

        ArrayList<Seat> seatsPremiumEconomyClass = new ArrayList<>(airplane.getBody().getCabin().getPremiumEconomyClass().getSeats());
        ArrayList<Passenger> passengersPremiumEconomyClass = new ArrayList<>();

        for (Seat seat : seatsPremiumEconomyClass) {
            if (seat.getPassenger() != null) {
                passengersPremiumEconomyClass.addLast(seat.getPassenger());
            }
        }

        String[] namesPremiumEconomy = new String[passengersPremiumEconomyClass.size()];
        int c2 = 0;

        for (Passenger passenger : passengersPremiumEconomyClass) {
            if (passenger != null) {
                namesPremiumEconomy[c2] = passenger.lastName + " " + passenger.firstName;
                c2++;
            }
        }

        Arrays.sort(namesPremiumEconomy, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        for (String name : namesPremiumEconomy) {
            for (Passenger passenger : passengersPremiumEconomyClass) {
                if ((passenger.lastName + " " + passenger.firstName).equals(name)) {
                    LogEngine.INSTANCE.write(passenger.getBoardingPass().toString());
                }
            }
        }

        ArrayList<Seat> seatsEconomyClass = new ArrayList<>(airplane.getBody().getCabin().getEconomyClass().getSeats());
        ArrayList<Passenger> passengersEconomyClass = new ArrayList<>();

        for (Seat seat : seatsEconomyClass) {
            if (seat.getPassenger() != null) {
                passengersEconomyClass.addLast(seat.getPassenger());
            }
        }

        String[] namesEconomy = new String[passengersEconomyClass.size()];
        int c3 = 0;

        for (Passenger passenger : passengersEconomyClass) {
            if (passenger != null) {
                namesEconomy[c3] = passenger.lastName + " " + passenger.firstName;
                c3++;
            }
        }

        Arrays.sort(namesEconomy, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        for (String name : namesEconomy) {
            for (Passenger passenger : passengersEconomyClass) {
                if ((passenger.lastName + " " + passenger.firstName).equals(name)) {
                    LogEngine.INSTANCE.write(passenger.getBoardingPass().toString());
                }
            }
        }

        LogEngine.INSTANCE.close();
    }
}

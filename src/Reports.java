import java.util.List;

public class Reports {
    public void generateReportBySeat(List<Ticket> tickets) {
        tickets.sort((t1, t2) -> t1.getSeat().compareTo(t2.getSeat()));
        tickets.forEach(System.out::println);
    }

    public void generateReportByName(List<Passenger> passengers) {
        passengers.sort((p1, p2) -> {
            int lastNameComparison = p1.getLastName().compareTo(p2.getLastName());
            if (lastNameComparison == 0) {
                return p1.getFirstName().compareTo(p2.getFirstName());
            }
            return lastNameComparison;
        });
        passengers.forEach(System.out::println);
    }

    /*
    public void generateReportByClassAndName(List<Passenger> passengers) {
        passengers.sort((p1, p2) -> {
            int classComparison = p1.getTicket().getBookingClass().compareTo(p2.getTicket().getBookingClass());
            if (classComparison == 0) {
                int lastNameComparison = p1.getLastName().compareTo(p2.getLastName());
                if (lastNameComparison == 0) {
                    return p1.getFirstName().compareTo(p2.getFirstName());
                }
                return lastNameComparison;
            }
            return classComparison;
        });
        passengers.forEach(System.out::println);
    }
    */
}
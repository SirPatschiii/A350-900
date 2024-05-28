public class Reports {

    private LogEngine logEngine;

    // added new

    // methode generiert bericht der nach Sitzplatznummer sortiert ist

    public void generateReportBySeat(List<Ticket> tickets) {

        // sortieren der tickets nach sitzplatznummer
        tickets.sort((t1, t2) -> t1.getSeat().compareTo(t2.getSeat()));
        // BufferedWriter um die Daten in die Datei "report01.txt" zu schreiben
        logEngine.write(ticket.toString());

    }

    // methode generiert einen Bericht, der nach Nachname und dann nach Vorname sortiert ist

    public void generateReportByName(List<Passenger> passengers) {
        // sortieren der Passagiere nach Nachname und Vorname
        passengers.sort((p1, p2) -> {
            int lastNameComparison = p1.getLastName().compareTo(p2.getLastName());
            if (lastNameComparison == 0) {
                return p1.getFirstName().compareTo(p2.getFirstName());
            }
            return lastNameComparison;
        });
        // BufferedWriter um die Daten in die Datei "report02.txt" zu schreiben
        logEngine.write(passenger.toString());
    }


    // diese Methode generiert einen Bericht, der nach Buchungsklasse und dann nach Nachname und Vorname sortiert ist
    public void generateReportByClassAndName(List<Passenger> passengers) {
        // sortieren der Passagiere nach Buchungsklasse, Nachname und Vorname
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

        // BufferedWriter um die Daten in die Datei "report03.txt" zu schreiben
        logEngine.write(passenger.toString());

    }
}

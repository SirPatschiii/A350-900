public class Economy extends AirplaneClass {
    private final char[] seatLetters1;
    private final char[] seatLetters2;
    private final char[] seatLetters3;
    private final char[] seatLetters4;
    private final char[] seatLetters5;
    private final int[] rows1;
    private final int[] rows2;
    private final int[] rows3;
    private final int[] rows4;
    private final int[] rows5;

    public Economy() {
        super();
        seatLetters1 = new char[]{'A', 'C', 'D', 'E', 'G'};
        seatLetters2 = new char[]{'A', 'B', 'C', 'D', 'E', 'G', 'H', 'J', 'K'};
        seatLetters3 = new char[]{'B', 'C', 'D', 'E', 'G', 'H', 'J'};
        seatLetters4 = new char[]{'A', 'B', 'C', 'D', 'E', 'G', 'H', 'J', 'K'};
        seatLetters5 = new char[]{'A', 'C', 'D', 'E', 'G'};
        rows1 = new int[]{16};
        rows2 = new int[]{18, 19, 20, 21, 22, 23, 24, 25, 26};
        rows3 = new int[]{27};
        rows4 = new int[]{28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41};
        rows5 = new int[]{42};
        addSeats();
    }

    @Override
    protected void addSeats() {
        for (int row : rows1) {
            for (char seatLetter : seatLetters1) {
                seats.addLast(new Seat(row, seatLetter, EClass.ECONOMY));
            }
        }
        for (int row : rows2) {
            for (char seatLetter : seatLetters2) {
                seats.addLast(new Seat(row, seatLetter, EClass.ECONOMY));
            }
        }
        for (int row : rows3) {
            for (char seatLetter : seatLetters3) {
                seats.addLast(new Seat(row, seatLetter, EClass.ECONOMY));
            }
        }
        for (int row : rows4) {
            for (char seatLetter : seatLetters4) {
                seats.addLast(new Seat(row, seatLetter, EClass.ECONOMY));
            }
        }
        for (int row : rows5) {
            for (char seatLetter : seatLetters5) {
                seats.addLast(new Seat(row, seatLetter, EClass.ECONOMY));
            }
        }
    }

    public char[] getSeatLetters1() {
        return seatLetters1;
    }

    public char[] getSeatLetters2() {
        return seatLetters2;
    }

    public char[] getSeatLetters3() {
        return seatLetters3;
    }

    public char[] getSeatLetters4() {
        return seatLetters4;
    }

    public char[] getSeatLetters5() {
        return seatLetters5;
    }

    public int[] getRows1() {
        return rows1;
    }

    public int[] getRows2() {
        return rows2;
    }

    public int[] getRows3() {
        return rows3;
    }

    public int[] getRows4() {
        return rows4;
    }

    public int[] getRows5() {
        return rows5;
    }
}

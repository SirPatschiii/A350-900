public abstract class Reader {
    public abstract void authenticate(Passenger passenger);
}

class PassportReader extends Reader {
    @Override
    public void authenticate(Passenger passenger) {
        System.out.println("Passenger " + passenger.getId() + " authenticates with Passport.");
    }
}

class IrisReader extends Reader {
    @Override
    public void authenticate(Passenger passenger) {
        System.out.println("Passenger " + passenger.getId() + " authenticates with Iris.");
    }
}

class FingerPrintReader extends Reader {
    @Override
    public void authenticate(Passenger passenger) {
        System.out.println("Passenger " + passenger.getId() + " authenticates with FingerPrint.");
    }
}

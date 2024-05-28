import java.time.LocalDate;

public enum Configurator {
    INSTANCE;

    // General data
    public final String lineSeparator = System.lineSeparator();
    public final String fileSeparator = System.getProperty("file.separator");
    public final String userDirectory = System.getProperty("user.dir");

    public final String reportFile1 = userDirectory + fileSeparator + "report" + fileSeparator + "report01.txt";
    public final String reportFile2 = userDirectory + fileSeparator + "report" + fileSeparator + "report02.txt";
    public final String reportFile3 = userDirectory + fileSeparator + "report" + fileSeparator + "report03.txt";

    public final LocalDate currentDate = LocalDate.now();

    // Airplane data
    public final String model = "350-900";
    public final String id = "D-AIXD";
    public final String serialNumber = "S9VNG45XPI";
    public final LocalDate manufacturingDate = LocalDate.of(2023, 11, 22);
    public final LocalDate deliveryDate = LocalDate.of(2023, 12, 1);

    public final double overallLength = 66.89; // in meters
    public final double cabinLength = 51.04; // in meters
    public final double wingSpan = 64.75; // in meters
    public final double height = 17.05; // in meters

    public final double mmo = 0.89; // in mach
    public final double cruisingSpeed = 0.85; // in mach

    public final int range = 15_372; // in kilometers
    public final int maxTOWeight = 268; // in tons
    public final double fuelConsumption = 2.9; // in l/100 paxkm

    public final int singleEnginePower = 84_000; // in pounds

    public final int capacityBusinessClass = 48;
    public final int capacityPremiumEconomyClass = 21;
    public final int capacityEconomyClass = 224;

    // FuelTank data
    public final int capacityCenterTank = 82500;
    public final int capacityWingTank = 27500;

    public final String dimensionsCenterTank = "125x55x12";
    public final String dimensionsWingTank = "125x22x10";

    // JetEngine data
    public final int maxRPM = 10500;

    // Flight data
    public final int flightTime = 13; // in hours

    // Calculates miles per hours into kilometers per hours
    public int convertMphKmh(int mph) {
        double kmh = mph * 1.60934;
        return (int) (Math.ceil(kmh));
    }

    // File path to .csv
    public final String pathCSV = "./specs/data.csv";

    // CSV delimiter
    public final String csvDelimiter = ",";
}

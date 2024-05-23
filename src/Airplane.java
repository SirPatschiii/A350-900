import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Airplane {
    private final Body body;
    private final Wing wingLeft;
    private final Wing wingRight;

    private final EAirplaneManufacturer manufacturer;
    private final String model;
    private final String id;
    private String carrier;
    private final String serialNumber;
    private final LocalDate manufacturingDate;
    private final LocalDate deliveryDate;

    private final double overallLength; // in meters
    private final double cabinLength; // in meters
    private final double wingSpan; // in meters
    private final double height; // in meters

    private final double mmo; // in mach
    private final double cruisingSpeed; // in mach

    private final int range; // in kilometers
    private final int maxTOWeight; // in tonnes
    private final double fuelConsumption; // in l/100 paxkm

    private final int singleEnginePower; // in pounds
    private final int overallEnginePower; // in pounds

    private final int capacityBusinessClass;
    private final int capacityPremiumEconomyClass;
    private final int capacityEconomyClass;
    private final int overallCapacity;

    public Airplane(String carrier) {
        body = new Body();
        wingLeft = new Wing(ESide.LEFT);
        wingRight = new Wing(ESide.RIGHT);

        manufacturer = EAirplaneManufacturer.AIRBUS;
        model = Configurator.INSTANCE.model;
        id = Configurator.INSTANCE.id;
        this.carrier = carrier;
        serialNumber = Configurator.INSTANCE.serialNumber;
        manufacturingDate = Configurator.INSTANCE.manufacturingDate;
        deliveryDate = Configurator.INSTANCE.deliveryDate;

        overallLength = Configurator.INSTANCE.overallLength;
        cabinLength = Configurator.INSTANCE.cabinLength;
        wingSpan = Configurator.INSTANCE.wingSpan;
        height = Configurator.INSTANCE.height;

        mmo = Configurator.INSTANCE.mmo;
        cruisingSpeed = Configurator.INSTANCE.cruisingSpeed;

        range = Configurator.INSTANCE.range;
        maxTOWeight = Configurator.INSTANCE.maxTOWeight;
        fuelConsumption = Configurator.INSTANCE.fuelConsumption;

        singleEnginePower = Configurator.INSTANCE.singleEnginePower;
        overallEnginePower = singleEnginePower * 2;

        capacityBusinessClass = Configurator.INSTANCE.capacityBusinessClass;
        capacityPremiumEconomyClass = Configurator.INSTANCE.capacityPremiumEconomyClass;
        capacityEconomyClass = Configurator.INSTANCE.capacityEconomyClass;
        overallCapacity = capacityBusinessClass + capacityPremiumEconomyClass + capacityEconomyClass;
    }

    private long determineAirplaneAge() {
        return ChronoUnit.DAYS.between(manufacturingDate, Configurator.INSTANCE.currentDate);
    }

    @Override
    public String toString() {
        String lineSeparator = Configurator.INSTANCE.lineSeparator;
        StringBuilder sB = new StringBuilder();

        sB.append("Data to the aircraft:").append(lineSeparator);
        sB.append("Manufacturer  : ").append(manufacturer).append(lineSeparator);
        sB.append("Model         : ").append(model).append(lineSeparator);
        sB.append("Serial number : ").append(serialNumber).append(lineSeparator);
        sB.append("ID            : ").append(id).append(lineSeparator);
        sB.append("Carrier       : ").append(carrier).append(lineSeparator);
        sB.append("Age in days   : ").append(determineAirplaneAge()).append(lineSeparator);
        return sB.toString();
    }
}

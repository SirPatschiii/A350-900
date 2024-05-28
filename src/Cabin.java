import java.util.Arrays;

public class Cabin {
    private final Business businessClass;
    private final PremiumEconomy premiumEconomyClass;
    private final Economy economyClass;

    public Cabin() {
        businessClass = new Business();
        premiumEconomyClass = new PremiumEconomy();
        economyClass = new Economy();
    }

    public Business getBusinessClass() {
        return businessClass;
    }

    public PremiumEconomy getPremiumEconomyClass() {
        return premiumEconomyClass;
    }

    public Economy getEconomyClass() {
        return economyClass;
    }

    @Override
    public String toString() {
        String lineSeparator = Configurator.INSTANCE.lineSeparator;
        StringBuilder sB = new StringBuilder();

        String bCL = Arrays.toString(businessClass.getSeatLetters());
        String bCR = Arrays.toString(businessClass.getRows()).replace("[", "").replace("]", "");

        String pECL = Arrays.toString(premiumEconomyClass.getSeatLetters());
        String pECR = Arrays.toString(premiumEconomyClass.getRows()).replace("[", "").replace("]", "");

        String eCL1 = Arrays.toString(economyClass.getSeatLetters1());
        String eCL2 = Arrays.toString(economyClass.getSeatLetters2());
        String eCL3 = Arrays.toString(economyClass.getSeatLetters3());
        String eCL4 = Arrays.toString(economyClass.getSeatLetters4());
        String eCL5 = Arrays.toString(economyClass.getSeatLetters5());
        String eCR1 = Arrays.toString(economyClass.getRows1()).replace("[", "").replace("]", "");
        String eCR2 = Arrays.toString(economyClass.getRows2()).replace("[", "").replace("]", "");
        String eCR3 = Arrays.toString(economyClass.getRows3()).replace("[", "").replace("]", "");
        String eCR4 = Arrays.toString(economyClass.getRows4()).replace("[", "").replace("]", "");
        String eCR5 = Arrays.toString(economyClass.getRows5()).replace("[", "").replace("]", "");

        sB.append("Konfiguration of the cabin:").append(lineSeparator);
        sB.append("Cabin : ").append(EClass.BUSINESS + "        : ").append(bCR).append(" ").append(bCL).append(" : ")
                .append(Configurator.INSTANCE.capacityBusinessClass).append(lineSeparator);

        sB.append("        ").append(EClass.PREMIUM_ECONOMY + " : ").append(pECR).append(" ").append(pECL).append(" : ")
                .append(Configurator.INSTANCE.capacityPremiumEconomyClass).append(lineSeparator);

        sB.append("        ").append(EClass.ECONOMY + "         : ").append(eCR1).append(" ").append(eCL1).append(" : ")
                .append(economyClass.getRows1().length * economyClass.getSeatLetters1().length).append(lineSeparator);

        sB.append("                          ").append(eCR2).append(" ").append(eCL2).append(" : ")
                .append(economyClass.getRows2().length * economyClass.getSeatLetters2().length).append(lineSeparator);

        sB.append("                          ").append(eCR3).append(" ").append(eCL3).append(" : ")
                .append(economyClass.getRows3().length * economyClass.getSeatLetters3().length).append(lineSeparator);

        sB.append("                          ").append(eCR4).append(" ").append(eCL4).append(" : ")
                .append(economyClass.getRows4().length * economyClass.getSeatLetters4().length).append(lineSeparator);

        sB.append("                          ").append(eCR5).append(" ").append(eCL5).append(" : ")
                .append(economyClass.getRows5().length * economyClass.getSeatLetters5().length).append(lineSeparator);

        sB.append("                          : ").append(Configurator.INSTANCE.capacityEconomyClass).append(lineSeparator);

        sB.append("        : ").append(Configurator.INSTANCE.capacityBusinessClass
                + Configurator.INSTANCE.capacityPremiumEconomyClass
                + Configurator.INSTANCE.capacityEconomyClass).append(lineSeparator);

        return sB.toString();
    }
}

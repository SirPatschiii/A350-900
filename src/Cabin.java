public class Cabin {
    private final Business businessClass;
    private final PremiumEconomy premiumEconomyClass;
    private final Economy economyClass;

    public Cabin() {
        businessClass = new Business();
        premiumEconomyClass = new PremiumEconomy();
        economyClass = new Economy();
    }

    @Override
    public String toString() {
        // TODO toString() is unfinished
        return "";
    }
}

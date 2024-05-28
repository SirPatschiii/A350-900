public class HumanBody {
    private double weight;
    private double height;

    public HumanBody(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Body{" + "weight=" + weight + "height=" + height + '}';
    }
}

public class Head {
    private String hairColor;
    private final String iris;

    public Head(String hairColor, String iris) {
        this.hairColor = hairColor;
        this.iris = iris;
    }

    public String getIris() {
        return iris;
    }

    @Override
    public String toString() {
        return "Head{" + "haircolor='" + hairColor + '\'' + '}';
    }
}

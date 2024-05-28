public class Head {
    private String hairColor;
    private final String iris;

    public Head(String hairColor, String iris) {
        this.hairColor = hairColor;
        this.iris = iris;
    }

    public String getHaircolor() {
        return hairColor;
    }

    public void setHaircolor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getIris() {
        return iris;
    }

    @Override
    public String toString() {
        return "Head{" + "haircolor='" + hairColor + '\'' + '}';
    }
}

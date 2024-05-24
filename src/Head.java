public class Head {
    private String hairColor;

    public Head(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getHaircolor() {
        return hairColor;
    }

    public void setHaircolor(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "Head{" + "haircolor='" + hairColor + '\'' + '}';
    }
}

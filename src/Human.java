import java.time.LocalDate;

public abstract class Human {
    protected Head head;
    protected HumanBody humanBody;
    protected Arm leftArm;
    protected Arm rightArm;
    protected Leg leftLeg;
    protected Leg rightLeg;

    protected String firstName;
    protected String lastName;
    protected EGender gender;
    protected LocalDate dateOfBirth;

    protected double weight;
    protected double height;
    protected String hairColor;

    public Human(String firstName, String lastName, EGender gender, LocalDate dateOfBirth, double weight, double height,String hairColor, String fingerprint, String iris) {
        this.head = new Head(hairColor, iris);
        this.humanBody = new HumanBody(weight, height);
        this.leftArm = new Arm(ESide.LEFT, fingerprint);
        this.rightArm = new Arm(ESide.RIGHT, fingerprint);
        this.leftLeg = new Leg(ESide.LEFT);
        this.rightLeg = new Leg(ESide.RIGHT);

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public Head getHead() {
        return head;
    }

    public Arm getLeftArm() {
        return leftArm;
    }

    @Override
    public String toString() {
        return "Human{"  + ", head=" + head + ", body=" + humanBody +  "left Arm=" + leftArm + ", right Arm=" + rightArm +
                ", left Leg=" + leftLeg + ", right Leg=" + rightLeg + "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' + ", gender='" + gender + '\'' + ", dateOfBirth=" + dateOfBirth+'}';
    }
}

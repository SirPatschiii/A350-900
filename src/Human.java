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

    public Human(String firstName, String lastName, EGender gender, LocalDate dateOfBirth, double weight, double height,String hairColor) {
        this.head = new Head(hairColor);
        this.humanBody = new HumanBody(weight, height);
        this.leftArm = new Arm(ESide.LEFT);
        this.rightArm = new Arm(ESide.RIGHT);
        this.leftLeg = new Leg(ESide.LEFT);
        this.rightLeg = new Leg(ESide.RIGHT);

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public EGender getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public HumanBody getHumanBody() {
        return humanBody;
    }

    public void setHumanBody(HumanBody humanBody) {
        this.humanBody = humanBody;
    }

    public Arm getLeftArm() {
        return leftArm;
    }

    public void setLeftArm(Arm leftArm) {
        this.leftArm = leftArm;
    }

    public Arm getRightArm() {
        return rightArm;
    }

    public void setRightArm(Arm rightArm) {
        this.rightArm = rightArm;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(Leg leftLeg) {
        this.leftLeg = leftLeg;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(Leg rightLeg) {
        this.rightLeg = rightLeg;
    }

    @Override
    public String toString() {
        return "Human{"  + ", head=" + head + ", body=" + humanBody +  "left Arm=" + leftArm + ", right Arm=" + rightArm +
                ", left Leg=" + leftLeg + ", right Leg=" + rightLeg + "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' + ", gender='" + gender + '\'' + ", dateOfBirth=" + dateOfBirth+'}';
    }
}

public class AirportContainerStorage {
    private Container container1;
    private Container container2;
    private Container container3;
    private Container container4;
    private Container container5;
    private Container container6;
    private Container container7;
    private Container container8;

    public AirportContainerStorage() {
        container1 = new Container(ESide.LEFT);
        container2 = new Container(ESide.RIGHT);
        container3 = new Container(ESide.LEFT);
        container4 = new Container(ESide.RIGHT);
        container5 = new Container(ESide.LEFT);
        container6 = new Container(ESide.RIGHT);
        container7 = new Container(ESide.LEFT);
        container8 = new Container(ESide.RIGHT);
    }

    public Container getContainer1() {
        return container1;
    }

    public Container getContainer2() {
        return container2;
    }

    public Container getContainer3() {
        return container3;
    }

    public Container getContainer4() {
        return container4;
    }

    public Container getContainer5() {
        return container5;
    }

    public Container getContainer6() {
        return container6;
    }

    public Container getContainer7() {
        return container7;
    }

    public Container getContainer8() {
        return container8;
    }
}

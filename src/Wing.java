public class Wing {
    private final ESide direction;
    private final JetEngine jetEngine;

    public Wing(ESide direction) {
        this.direction = direction;
        jetEngine = new JetEngine(direction);
    }
}

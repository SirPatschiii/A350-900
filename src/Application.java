public class Application {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Lufthansa");
        System.out.println(airplane);
        System.out.println(airplane.getBody().getCabin().toString());
    }
}

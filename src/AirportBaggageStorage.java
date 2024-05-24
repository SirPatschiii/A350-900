public class AirportBaggageStorage {
    private Baggage[][][] baggageStorage;
    private int length, width,height;

    public AirportBaggageStorage(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;

        baggageStorage = new Baggage[length][width][height];
    }

    public void storeBaggage(Baggage baggage){
        for(int x = 0; x < baggageStorage.length; x++){
            for(int y = 0; y < baggageStorage[x].length; y++){
                for(int z = 0; z < baggageStorage[x][y].length; z++){
                    baggageStorage[x][y][z] = baggage;
                }
            }

        }
    }

    public int getLength() {

        return length;
    }

    public void setLength(int length) {

        this.length = length;
    }

    public int getWidth() {

        return width;
    }

    public void setWidth(int width) {

        this.width = width;
    }

    public int getHeight() {

        return height;
    }

    public void setHeight(int height) {

        this.height = height;
    }
}

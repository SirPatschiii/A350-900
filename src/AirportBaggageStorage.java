public class AirportBaggageStorage {
    private Baggage[][][] baggageStorage;
    private int length, width,height;
    private int nextCol, nextRow, nextHeight;

    public AirportBaggageStorage(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;

        baggageStorage = new Baggage[length][width][height];
    }

    public void storeBaggage(Baggage baggage){
        baggageStorage[nextCol][nextRow][nextHeight] = baggage;
        if(nextHeight== height -1){
            nextRow++;
            nextHeight = 0;
        }
        if(nextRow == width -1){
            nextCol++;
            nextRow = 0;
        }
        nextHeight++;
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

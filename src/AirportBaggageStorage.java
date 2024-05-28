public class AirportBaggageStorage {
    private Baggage[][][] baggageStorage;
    private int length, width, height;
    private int nextCol, nextRow, nextHeight;

    public AirportBaggageStorage(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;

        baggageStorage = new Baggage[length][width][height];
    }

    public void storeBaggage(Baggage baggage) {
        baggageStorage[nextCol][nextRow][nextHeight] = baggage;
        if (nextHeight == height - 1) {
            nextRow++;
            nextHeight = -1;
        }
        if (nextRow == width) {
            nextCol++;
            nextRow = 0;
        }
        nextHeight++;
    }

    public Baggage[][][] getBaggageStorage() {
        return baggageStorage;
    }
}

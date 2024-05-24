public class FuelTank {
    private final int capacity; // in l
    private int content; // in l
    private final String dimensions; // in length*width*height

    public FuelTank(int capacity, String dimensions) {
        this.capacity = capacity;
        content = capacity;
        this.dimensions = dimensions;
    }

    public void decreaseContent(int amount) {
        if (amount > content) {
            throw new IllegalArgumentException("Not fuel left!");
        }
        content = content - amount;
    }

    public int getContent() {
        return content;
    }

    public int getCapacity() {
        return capacity;
    }
}

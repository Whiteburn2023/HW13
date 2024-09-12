public class Display {
    private final int displaySize;
    private final DisplayType displayType;
    private final double weight;

    public Display(int displaySize, DisplayType displayType, double weight) {
        this.displaySize = displaySize;
        this.displayType = displayType;
        this.weight = weight;
    }

    public int getDisplaySize() {
        return displaySize;
    }

    public DisplayType getDisplayType() {
        return displayType;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Display{" +
                "displaySize=" + displaySize +
                ", displayType=" + displayType +
                ", weight=" + weight +
                '}';
    }
}

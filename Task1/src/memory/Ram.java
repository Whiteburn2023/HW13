package memory;

public class Ram {
    private final RamType ramType;
    private final int ramCapacity;
    private final double weight;

    public Ram(RamType ramType, int ramCapacity, double weight) {
        this.ramType = ramType;
        this.ramCapacity = ramCapacity;
        this.weight = weight;
    }

    public RamType getRamType() {
        return ramType;
    }

    public int getRamCapacity() {
        return ramCapacity;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "memory.Ram{" +
                "ramType=" + ramType +
                ", ramCapacity=" + ramCapacity +
                ", weight=" + weight +
                '}';
    }
}

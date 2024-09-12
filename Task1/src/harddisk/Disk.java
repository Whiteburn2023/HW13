package harddisk;

public class Disk {
    private final DiskStorageType diskStorageType;
    private final double diskCapacity;
    private final double weight;

    public Disk(DiskStorageType diskStorageType, double diskCapacity, double weight) {
        this.diskStorageType = diskStorageType;
        this.diskCapacity = diskCapacity;
        this.weight = weight;
    }

    public DiskStorageType getDiskStorageType() {
        return diskStorageType;
    }

    public double getDiskCapacity() {
        return diskCapacity;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "harddisk.Disk{" +
                "diskStorageType=" + diskStorageType +
                ", diskCapacity=" + diskCapacity +
                ", weight=" + weight +
                '}';
    }
}

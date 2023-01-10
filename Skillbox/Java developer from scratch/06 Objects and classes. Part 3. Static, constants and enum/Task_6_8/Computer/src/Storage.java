public class Storage {
    private final StorageType storageType;
    private final double volume;
    private final double weight;

    public Storage(StorageType storageType, double volume, double weight) {
        this.storageType = storageType;
        this.volume = volume;
        this.weight = weight;
    }

    public StorageType getStorageType() {
        return storageType;
    }

    public double getVolume() {
        return volume;
    }

    public double getWeight() {
        return weight;
    }
}

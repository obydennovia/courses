public class RAM {
    private final RAMType ramType;
    private final double volume;
    private final double weight;

    public RAM(RAMType ramType, double volume, double weight) {
        this.ramType = ramType;
        this.volume = volume;
        this.weight = weight;
    }

    public RAMType getRamType() {
        return ramType;
    }

    public double getVolume() {
        return volume;
    }

    public double getWeight() {
        return weight;
    }
}

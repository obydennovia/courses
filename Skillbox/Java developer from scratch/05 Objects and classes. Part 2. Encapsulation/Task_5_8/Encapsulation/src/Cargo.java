public class Cargo {

    private final Dimensions dimensions;
    private final double weight;
    private final String address;
    private final boolean rotate;
    private final String registrationNumber;
    private final boolean fragile;

    public Cargo(Dimensions dimensions, double weight, String address, boolean rotate, String registrationNumber, boolean fragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.rotate = rotate;
        this.registrationNumber = registrationNumber;
        this.fragile = fragile;
    }

    public Cargo setDimensions(Dimensions dimensions) {
        return new Cargo(dimensions, weight, address, rotate, registrationNumber, fragile);
    }

    public Cargo setWeight(double weight) {
        return new Cargo(dimensions, weight, address, rotate, registrationNumber, fragile);
    }

    public Cargo setAddress(String address) {
        return new Cargo(dimensions, weight, address, rotate, registrationNumber, fragile);
    }
    public Cargo setRotate(boolean rotate) {
        return new Cargo(dimensions, weight, address, rotate, registrationNumber, fragile);
    }

    public Cargo setRegistrationNumber(String registrationNumber) {
        return new Cargo(dimensions, weight, address, rotate, registrationNumber, fragile);
    }

    public Cargo setFragile(boolean fragile) {
        return new Cargo(dimensions, weight, address, rotate, registrationNumber, fragile);
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public String getAddress() {
        return address;
    }

    public boolean getRotate() {
        return rotate;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean getFragile() {
        return fragile;
    }

    public String toString() {
        return dimensions.toString() +
                "weight: " + weight + "\n" +
                "address: " + address + "\n" +
                "rotate: " + rotate + "\n" +
                "registrationNumber: " + registrationNumber + "\n" +
                "fragile: " + fragile + "\n";
    }

}

public class Engine {
    private final EngineType engineType;
    private final double volume;
    private final int power;

    public Engine(EngineType engineType, double volume, int power) {
        this.engineType = engineType;
        this.volume = volume;
        this.power = power;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public double getVolume() {
        return volume;
    }

    public int getPower() {
        return power;
    }
}

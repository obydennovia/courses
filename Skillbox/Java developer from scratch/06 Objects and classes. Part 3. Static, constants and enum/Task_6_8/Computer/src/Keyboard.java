public class Keyboard {
    private final KeyBoardType keyBoardType;
    private final boolean isLight;
    private final double weight;

    public Keyboard(KeyBoardType keyBoardType, boolean isLight, double weight) {
        this.keyBoardType = keyBoardType;
        this.isLight = isLight;
        this.weight = weight;
    }

    public KeyBoardType getKeyBoardType() {
        return keyBoardType;
    }

    public boolean isLight() {
        return isLight;
    }

    public double getWeight() {
        return weight;
    }
}

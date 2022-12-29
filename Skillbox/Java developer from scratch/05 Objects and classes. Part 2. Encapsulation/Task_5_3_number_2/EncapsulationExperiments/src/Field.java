public class Field {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getGreen() {
        return green;
    }

    public void setGreen(boolean green) {
        this.green = green;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String name;
    public boolean green;
    public double sideA;
    public double sideB;
    public double square;

    public Field(String name) {
        this.name = name;
    }
}

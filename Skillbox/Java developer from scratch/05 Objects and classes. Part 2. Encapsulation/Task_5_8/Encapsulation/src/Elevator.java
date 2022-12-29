public class Elevator {
    public int currentFloor = 1;
    public int minFloor;
    public int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor - 1;
    }

    public void moveUp() {
        currentFloor = currentFloor + 1;
    }

    public void move(int floor) {
        if (floor < minFloor || floor > maxFloor) {
            System.out.println("Неверный номер этажа. Допустимые номера этажей с -3-го до 26-го");
        } else if (floor > currentFloor) {
            System.out.println(currentFloor);
            for (int i = currentFloor; i < floor; i = i + 1) {
                moveUp();
                System.out.println(currentFloor);
            }
        } else if (floor < currentFloor) {
            System.out.println(currentFloor);
            for (int i = currentFloor; i > floor; i = i - 1) {
                moveDown();
                System.out.println(currentFloor);
            }
        }
    }
}

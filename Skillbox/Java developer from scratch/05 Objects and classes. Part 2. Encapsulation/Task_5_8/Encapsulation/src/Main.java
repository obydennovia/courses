import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Task 5_8 Second Task begin
        Dimensions dimensions1 = new Dimensions(1,2,3);
        Cargo cargo1 = new Cargo(dimensions1, 10, "addr1", true, "reg1", true);

        Dimensions dimensions2 = new Dimensions(11, 12,13);

        Cargo cargo2 = cargo1.setDimensions(dimensions2);
        Cargo cargo3 = cargo2.setWeight(111);
        Cargo cargo4 = cargo3.setAddress("addrNEW");
        Cargo cargo5 = cargo4.setRotate(false);
        Cargo cargo6 = cargo5.setRegistrationNumber("regNEW");
        Cargo cargo7 = cargo6.setFragile(false);

        System.out.println(cargo1);
        System.out.println(cargo2);
        System.out.println(cargo3);
        System.out.println(cargo4);
        System.out.println(cargo5);
        System.out.println(cargo6);
        System.out.println(cargo7);
        //Task 5_8 Second Task end

        //Task 5_8 First Task begin
        Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }
        //Task 5_8 First Task end
    }
}

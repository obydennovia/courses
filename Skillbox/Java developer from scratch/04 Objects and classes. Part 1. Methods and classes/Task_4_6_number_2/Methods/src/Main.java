public class Main {
    public static void main(String[] args) {
        Employee dmitry = new Employee("Дмитрий", "dmitry@gmail.com");
        Employee petya = new Employee("Петя", 3333);
        Employee vasya = new Employee("Вася", "vasya@gmail.com", 4444);

        dmitry.printInfo();
        petya.printInfo();
        vasya.printInfo();
    }
}

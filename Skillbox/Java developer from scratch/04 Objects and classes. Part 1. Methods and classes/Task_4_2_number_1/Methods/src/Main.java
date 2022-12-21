import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        printCurrentDateTime();
    }

    public static void printCurrentDateTime() {
        System.out.print("Дата и время: ");
        System.out.println(LocalDateTime.now());
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String firstName = "";
        String middleName = "";
        String lastName = "";
        String fio = new Scanner(System.in).nextLine();
        int spaceFirst = fio.indexOf(" ");
        int spaceSecond = fio.lastIndexOf(" ");

        firstName = fio.substring(spaceFirst + 1, spaceSecond);
        middleName = fio.substring(spaceSecond + 1, fio.length());
        lastName = fio.substring(0, spaceFirst);

        System.out.println("Фамилия: " + lastName);
        System.out.println("Имя: " + firstName);
        System.out.println("Отчество: " + middleName);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte i = 0;
        while (i !=2) {
            System.out.println("Введите первую строку: ");
            String str1 = new Scanner(System.in).next();

            System.out.println("Введите вторую строку: ");
            String str2 = new Scanner(System.in).next();

            if (str1.equals(str2)) {
                System.out.println(str1 + " = " + str2);
            } else {
                System.out.println(str1 + " != " + str2);
            }
            i = 2;
        }
    }
}

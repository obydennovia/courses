import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int factorial = 1;

        System.out.println("Введите число, факториал которого нужно рассчитать:");
        int value = new Scanner(System.in).nextInt();
        for (int i = 1; i <= value; i = i + 1) {
            factorial = factorial * i;
        }
        System.out.println("Факториал " + value + " = " + factorial);
    }
}

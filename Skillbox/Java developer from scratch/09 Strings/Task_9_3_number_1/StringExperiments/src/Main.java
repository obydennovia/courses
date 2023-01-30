import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result = 0;

        System.out.println("Введите первое число: ");
        int a = Integer.parseInt(new Scanner(System.in).nextLine());

        System.out.println("Введите арифметический символ: ");
        char c = new Scanner(System.in).nextLine().charAt(0);

        System.out.println("Введите второе число: ");
        int b = Integer.parseInt(new Scanner(System.in).nextLine());

        switch (c) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
        }
        System.out.println(a + " " + c + " " + b + " = " + result);
    }
}

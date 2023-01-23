import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        char c;

        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.
        for (long i = 0L; i <= 4_294_967_295L; i++)
        {
            if (((char) i >= 'А') && ((char) i <= 'я')) {
                System.out.println((char) i + " = " + i);
            }
            if (((char) i == 'Ё') || ((char) i == 'ё')) {
                System.out.println((char) i + " = " + i);
            }
        }
    }
}

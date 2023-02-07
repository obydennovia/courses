package practice.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneCleanerRegex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                scanner.close();
                break;
            }

            // TODO:напишите ваш код тут, результат вывести в консоль.
            String regex = "[0-9]";

            StringBuilder str = new StringBuilder();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            String result = "";

            while (matcher.find()) {
                str.append(matcher.group());
            }

            result = str.toString();

            if ((str.length() < 10) || (str.length() > 11)) {
                result = "Неверный формат номера";
            }

            if (str.length() == 11) {
                if (str.charAt(0) == '8') {
                    result = str.replace(0, 1, "7").toString();
                } else if (str.charAt(0) != '7') {
                    result = "Неверный формат номера";
                }
            }

            if (str.length() == 10) {
                result = str.insert(0, "7").toString();
            }
            System.out.println(result);
        }
    }

}

package practice.string;

import java.util.Scanner;

public class SequentialWordsNumbers {
    public SequentialWordsNumbers(String text) {

    }

    public SequentialWordsNumbers() {

    }

    public static String sequentialWordsNumbers(String text) {
        StringBuilder result = new StringBuilder();
        int spaceCount = 1;
        char ch = ' ';

        if (text.length() == 0) {
            result.append("");
        } else {
            result.append("(" + spaceCount + ") ");

            for (int i = 0; i <= text.length() - 1; i++) {
                result.append(text.charAt(i));
                if (text.indexOf(ch, i) == i) {
                    spaceCount++;
                    result.append("(" + spaceCount + ") ");
                }
            }
            System.out.println(result);
        }
        return result.toString();
    }
}

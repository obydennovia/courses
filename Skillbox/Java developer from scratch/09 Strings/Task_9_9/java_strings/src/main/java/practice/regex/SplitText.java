package practice.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitText {

    public static void main(String[] args) {

    }

    public static String splitTextIntoWords(String text) {
        //TODO реализуйте метод
        String regex = "[\\s0-9,.!?;]+";
        String[] words = text.split(regex);
        StringBuilder str = new StringBuilder();

        for (int i = 0; i <= words.length - 1; i++) {
            if (i < words.length - 1) {
                str.append(words[i] + "\n");
            } else {
                str.append(words[i]);
            }
        }
        return str.toString();
    }

}
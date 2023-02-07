package practice.reverseArray;

public class ReverseArray {

    public static String[] reverse(String[] strings) {
        //TODO: Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
        String[] newArray = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            newArray[strings.length - 1 - i] = strings[i];
        }

        for (int i = 0; i < strings.length; i++) {
            strings[i] = newArray[i];
        }
        return strings;
    }

}
package practice.twoDimensionalArray;

public class TwoDimensionalArray {

    public static final char SYMBOL = 'X';

    public static char[][] getTwoDimensionalArray(int size) {

        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ SYMBOL по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]
        char[][] xArray = new char[size][size];

        for (int i = 0; i < xArray.length; i++) {

            for (int j = 0; j < xArray.length; j++) {
                if ((i == j) || (i + j == (size - 1))) {
                    xArray[i][j] = 'X';
                } else {
                    xArray[i][j] = ' ';
                }
            }
        }

        return xArray;
    }
}

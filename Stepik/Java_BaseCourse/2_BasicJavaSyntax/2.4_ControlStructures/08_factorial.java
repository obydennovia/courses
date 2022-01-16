/**
* Реализуйте метод, вычисляющий факториал заданного натурального числа.
*
* Факториал N вычисляется как 1⋅2⋅...⋅N.
*
* Поскольку это очень быстро растущая функция, то даже для небольших N
* вместимости типов int и long очень скоро не хватит. Поэтому будем
* использовать BigInteger.
*
* Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и
* обработку ввода-вывода добавит проверяющая система.
*/

public static BigInteger factorial(int value) {
    BigInteger result = BigInteger.valueOf(1);
    for (int i=1; i<=value; i++) {
        result = result.multiply(BigInteger.valueOf(i));
    }
    return result;
}

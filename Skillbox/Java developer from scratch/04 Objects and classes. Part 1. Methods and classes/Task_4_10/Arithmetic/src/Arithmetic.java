public class Arithmetic {
    int a;
    int b;

    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void sumAB() {
        System.out.println("Сумма чисел A и B: " + a + b);
    }

    public void multiAB() {
        System.out.println("Произведение чисел A и B: " + a * b);
    }

    public void maxAB() {
        int max =  a >= b ? a : b;
        System.out.println("Максимальное число: " + max);
    }

    public void minAB() {
        int min = a <= b ? a : b;
        System.out.println("Минимальное число: " + min);
    }
}

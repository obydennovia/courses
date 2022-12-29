public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator ar1 = new ArithmeticCalculator(7,5);
        System.out.println(ar1.calculate(Operation.ADD));
        System.out.println(ar1.calculate(Operation.SUBTRACT));
        System.out.println(ar1.calculate(Operation.MULTIPLY));
    }
}

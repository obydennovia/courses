package practice;

public class GeometryCalculator {

    // если значение radius меньше 0, метод должен вернуть -1
    public static double getCircleSquare(double radius) {
        if (radius < 0) {
            return -1.0;
        } else {
            return Math.PI * Math.pow(radius, 2.0);
        }
    }

    // если значение radius меньше 0, метод должен вернуть -1
    public static double getSphereVolume(double radius) {
        if (radius < 0) {
            return -1.0;
        } else {
            return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3.0);
        }
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        boolean isNull;
        boolean isSideSum;
        isNull = ((a == 0) || (b == 0) || (c == 0)) ? false : true;
        isSideSum = ((a + b > c) && (a + c > b) && (b + c > a)) ? true : false;

        return (isNull && isSideSum) ? true : false;
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        double p;
        if (isTrianglePossible(a, b, c)) {
            p = (a + b + c)/2.0;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } else {
            return -1.0;
        }
    }
}

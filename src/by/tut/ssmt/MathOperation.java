package by.tut.ssmt;

public class MathOperation {

    public static double addition(double[] arr) {
        return arr[0] + arr[1];
    }

    public static double subtraction(double[] arr) {
        return arr[0] - arr[1];
    }

    public static double multiplication(double[] arr) {
        return arr[0] * arr[1];
    }

    public static double division(double[] arr) {
        return arr[0] / arr[1];
    }

    public static double power(double[] arr) {
        return Math.pow(arr[0], arr[1]);
    }

    public static double root(double[] arr) {
        return Math.pow(arr[0], 1 / arr[1]);
    }

}

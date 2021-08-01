package by.tut.ssmt;

public class MathOperation {

    public static String addition(double[] arr) {
        return Double.toString(arr[0] + arr[1]);
    }

    public static String subtraction(double[] arr) {
        return Double.toString(arr[0] - arr[1]);
    }

    public static String multiplication(double[] arr) {
        return Double.toString(arr[0] * arr[1]);
    }

    public static String division(double[] arr) {
        if (arr[1] == 0) {
            return "not possible. Division by null";
        } else {
            return Double.toString(arr[0] / arr[1]);
        }
    }


    public static String power(double[] arr) {
        if (arr[0] == 0 && arr[1] == 0) {
            return "not possible. You are trying to raise 0 to the power of 0";
        } else {
            return Double.toString(Math.pow(arr[0], arr[1]));
        }
    }

    public static String root(double[] arr) {
        if (arr[0] < 0) {
            return "not possible. You are trying to extract root of negative value";
        } else {
            return Double.toString(Math.pow(arr[0], 1 / arr[1]));
        }
    }

}

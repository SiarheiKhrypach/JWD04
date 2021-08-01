package by.tut.ssmt;
import java.util.Scanner;

public class Calculator {

    static void main() {

        int i = 1; //Выход из цикла while при смене i

        while (i == 1) {
            TextMessages.greeting();
            Scanner scan = new Scanner(System.in);
            try {
                int choice = scan.nextInt();
                switch (choice) {
                    case (1):
                        operation("\nYour choice is addition.", MathOperation.addition(valueInput()));
                        break;

                    case (2):
                        operation("\nYour choice is subtraction.", MathOperation.subtraction(valueInput()));
                        break;

                    case (3):
                        operation("\nYour choice is multiplication.", MathOperation.multiplication(valueInput()));
                        break;

                    case (4):
                        operation("\nYour choice is division.", MathOperation.division(valueInput()));
                        break;

                    case (5):
                        operation("\nYour choice is exponentiation.", MathOperation.power(valueInput()));
                        break;

                    case (6):
                        operation("\nYour choice is root extraction.", MathOperation.root(valueInput()));
                        break;

                    case (7):
                        System.out.println("\nBye!");
                        i=0;
                        break;

                    default:
                        TextMessages.wrongDataMessage();
                }
            } catch (Exception ex) {
                TextMessages.wrongDataMessage();
            }
        }
    }

    private static void operation(String message, double operation) {
        System.out.println(message);
        System.out.println("\nThe answer is " + operation + "\n" + "Press Enter to continue.");
        pressEnterToContinue();
    }

    private static double[] valueInput() {
        Scanner scanAdd = new Scanner(System.in);
        System.out.println("\nEnter the value A");
        double firstInput = scanAdd.nextDouble();
        System.out.println("\nEnter the value B");
        double secondInput = scanAdd.nextDouble();
        return new double[]{firstInput, secondInput};
    }

    public static void pressEnterToContinue() {
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
    }

}



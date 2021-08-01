package by.tut.ssmt;
import java.util.Scanner;

public class Calculator {

    static void main() {

        int i = 1; //Выход из цикла while при смене i

        while (i == 1) {
            System.out.println(TextMessages.GREETING);
            Scanner scan = new Scanner(System.in);
            try {
                int choice = scan.nextInt();
                switch (choice) {
                    case (1):
                        action (MathOperation.addition(valueInput("\nYour choice is addition.")));
                        break;

                    case (2):
                        action (MathOperation.subtraction(valueInput("\nYour choice is subtraction.")));
                        break;

                    case (3):
                        action (MathOperation.multiplication(valueInput("\nYour choice is multiplication.")));
                        break;

                    case (4):
                            action (MathOperation.division(valueInput("\nYour choice is division.")));
                        break;

                    case (5):
                        action (MathOperation.power(valueInput("\nYour choice is exponentiation.")));
                        break;

                    case (6):
                        action (MathOperation.root(valueInput("\nYour choice is root extraction.")));
                        break;

                    case (7):
                        System.out.println("\nBye!");
                        i=0;
                        break;

                    default:
                        System.out.println(TextMessages.WRONG_DATA_MESSAGE);
                }
            } catch (Exception ex) {
                System.out.println(TextMessages.WRONG_DATA_MESSAGE);;
            }
        }
    }

    private static void action(String operation) {
        System.out.println("\nThe answer is " + operation + "\n" + "Press Enter to continue.");
        pressEnterToContinue();
    }

    private static double[] valueInput(String choice) {
        System.out.println(choice);
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



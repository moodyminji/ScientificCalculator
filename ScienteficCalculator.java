import java.util.*;
import java.util.InputMismatchException;

public class ScienteficCalculator {


    public static void main(String args[]) {
        Scanner SC = new Scanner(System.in);

        while (true) {
            displayMenu();
            try {
                System.out.println("Enter Your Choice :");
                int choice = SC.nextInt();
                if (choice == 0) {
                    System.out.println("Thank You For Using Calc. Exiting Application....");
                    System.exit(0);

                } else {
                    performOperation(SC, choice);
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                SC.next();
            }
        }
    }

    public static void displayMenu() {
        System.out.println("\n--- Scientific Calculator ---");
        System.out.println("1. Add\t\t\t2. Subtract");
        System.out.println("3. Multiply\t\t4. Divide");
        System.out.println("5. Square Root\t\t6. Power");
        System.out.println("7. Sine\t\t\t8. Cosine");
        System.out.println("9. Tangent\t\t10. Natural Log");
        System.out.println("11. Log Base 10\t\t12. Absolute Value");
        System.out.println("13. Round\t\t14. Ceiling");
        System.out.println("15. Floor\t\t16. Minimum");
        System.out.println("17. Maximum\t\t0. Exit");
    }

    private static void performOperation(Scanner SC, int choice) {
        try {
            switch (choice) {
                case 1:
                    System.out.println("Result: " + add(prompt(SC), prompt(SC)));
                    break;
                case 2:
                    System.out.println("Result: " + sub(prompt(SC), prompt(SC)));
                    break;
                case 3:
                    System.out.println("Result: " + mul(prompt(SC), prompt(SC)));
                    break;
                case 4:
                    double d1 = prompt(SC), d2 = prompt(SC);
                    System.out.println("Result: " + (d2 != 0 ? div(d1, d2) : "Error: Division by zero"));
                    break;

                case 5:
                    double sqrtNum = prompt(SC);
                    System.out.println("Result: " + (sqrtNum >= 0 ? calculateSquareRoot(sqrtNum) : "Error: Negative input"));
                    break;
                case 6:
                    System.out.println("Result: " + calculatePower(prompt(SC), prompt(SC)));
                    break;
                case 7:
                    System.out.println("Result: " + calculateSine(prompt(SC)));
                    break;
                case 8:
                    System.out.println("Result: " + calculateCosine(prompt(SC)));
                    break;
                case 9:
                    double angle = prompt(SC);
                    if (angle % 180 == 90) {
                        System.out.println("Error: Tangent undefined at " + angle + "°");
                    } else {
                        System.out.println("Result: " + calculateTangent(angle));
                    }
                    break;
                case 10:
                    double lnInput = prompt(SC);
                    System.out.println("Result: " + (lnInput > 0 ? calculateNaturalLogarithm(lnInput) : "Error: Non-positive input"));
                    break;
                case 11:
                    double log10Input = prompt(SC);
                    System.out.println("Result: " + (log10Input > 0 ? calculateLogarithmBase10(log10Input) : "Error: Non-positive input"));
                    break;
                case 12:
                    System.out.println("Result: " + Math.abs(prompt(SC)));
                    break;
                case 13:
                    System.out.println("Result: " + roundNumber(prompt(SC)));
                    break;
                case 14:
                    System.out.println("Result: " + ceilingNumber(prompt(SC)));
                    break;
                case 15:
                    System.out.println("Result: " + floorNumber(prompt(SC)));
                    break;
                case 16:
                    System.out.println("Result: " + findMin(prompt(SC), prompt(SC)));
                    break;
                case 17:
                    System.out.println("Result: " + findMax(prompt(SC), prompt(SC)));
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values.");
            SC.next();
        }


        }
    private static double prompt(Scanner SC){
        System.out.print("Enter number: ");
        return SC.nextDouble();
    }
    // calculation methods that will be used for performing operations
    public static double add(double num1, double num2) { return num1 + num2; }
    public static double sub(double num1, double num2) { return num1 - num2; }
    public static double mul(double num1, double num2) { return num1 * num2; }
    public static double div(double num1, double num2) { return num1 / num2; }

    public static double calculateSquareRoot(double num) { return Math.sqrt(num); }
    public static double calculatePower(double base, double exponent) { return Math.pow(base, exponent); }

    public static double calculateSine(double degrees) { return Math.sin(Math.toRadians(degrees)); }
    public static double calculateCosine(double degrees) { return Math.cos(Math.toRadians(degrees)); }
    public static double calculateTangent(double degrees) { return Math.tan(Math.toRadians(degrees)); }

    public static double calculateNaturalLogarithm(double num) { return Math.log(num); }
    public static double calculateLogarithmBase10(double num) { return Math.log10(num); }

    public static long roundNumber(double num) { return Math.round(num); }
    public static double ceilingNumber(double num) { return Math.ceil(num); }
    public static double floorNumber(double num) { return Math.floor(num); }

    public static double findMin(double num1, double num2) { return Math.min(num1, num2); }
    public static double findMax(double num1, double num2) { return Math.max(num1, num2); }
}







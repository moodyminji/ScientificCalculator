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
                    double d1 = prompt(SC), double d2 = prompt(SC)
                    System.out.println("Result: " + (d2 != 0 ? div(d1, d2) + "Error : Division by Zero is not Possible")); break;
                break;
                case 5:
                    double sqrtNum = prompt(SC);
                    System.out.println("Result: " + (sqrtNum >= 0 ? calculateSquareRoot(sqrtNum) : "Error: Negative input"));
                    break;
                case 6:
                    System.out.println("Result: " + calculatePower(prompt(scanner), prompt(scanner)));
                    break;
                case 7:
                    System.out.println("Result: " + calculateSine(prompt(scanner)));
                    break;
                case 8:
                    System.out.println("Result: " + calculateCosine(prompt(scanner)));
                    break;
                case 9:
                    double angle = prompt(scanner);
                    if (angle % 180 == 90) {
                        System.out.println("Error: Tangent undefined at " + angle + "°");
                    } else {
                        System.out.println("Result: " + calculateTangent(angle));
                    }
                    break;
                case 10:
                    double lnInput = prompt(scanner);
                    System.out.println("Result: " + (lnInput > 0 ? calculateNaturalLogarithm(lnInput) : "Error: Non-positive input"));
                    break;
                case 11:
                    double log10Input = prompt(scanner);
                    System.out.println("Result: " + (log10Input > 0 ? calculateLogarithmBase10(log10Input) : "Error: Non-positive input"));
                    break;
                case 12:
                    System.out.println("Result: " + Math.abs(prompt(scanner)));
                    break;
                case 13:
                    System.out.println("Result: " + roundNumber(prompt(scanner)));
                    break;
                case 14:
                    System.out.println("Result: " + ceilingNumber(prompt(scanner)));
                    break;
                case 15:
                    System.out.println("Result: " + floorNumber(prompt(scanner)));
                    break;
                case 16:
                    System.out.println("Result: " + findMin(prompt(scanner), prompt(scanner)));
                    break;
                case 17:
                    System.out.println("Result: " + findMax(prompt(scanner), prompt(scanner)));
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



}
    


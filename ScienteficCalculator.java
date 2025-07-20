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
    try{
        switch(choice){
            case 1 : System.out.println("Result: "+ add(prompt(SC)));
        }
    }
    }

}


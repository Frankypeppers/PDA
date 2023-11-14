/**
 * Permissible Dating Age program
 *
 * @author Mr. Jaffe
 * @version 2021-06-22 Version 1.0.0
 */
import java.util.Scanner;
import java.util.InputMismatchException;
public class PDA
{
    /**
     * Constructor for objects of class PDA
     */
    public PDA()
    {
        // We don't need to do anything in the constructor for
        // our program.
    }
    Scanner scanner = new Scanner(System.in);
    /**
     * This is the main event loop for our PDA program
     */
    public void runEventLoop() {
        boolean ShouldContinue = true;
        while(ShouldContinue == true) {
            int age = -1;
            System.out.println("How old are you?");
            System.out.println("Enter 0 to quit");
            try {
                age = scanner.nextInt();
                if (age == 0) {
                    ShouldContinue = false;
                } else if(age == -1) {
                    System.out.println("");
                } else {
                    int LOWER_BOUND = 0;
                    int UPPER_BOUND = 0;
                    LOWER_BOUND = (age/2) + 7;
                    UPPER_BOUND = (age - 7) * 2;
                    if (age < LOWER_BOUND) {
                        System.out.println(age + " is too young!!");
                    } else if (age > UPPER_BOUND) {
                        System.out.println(age + " is too young!!");
                    } else {
                        System.out.println("You can date between " + LOWER_BOUND + " and " + UPPER_BOUND);
                    }
                }
            } catch (InputMismatchException error) {
                System.out.println("Please enter an integer");
                scanner.next();
            }
        } 
    }

    /**
     * The main method instantiates and runs the program
     */
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}


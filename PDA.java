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
    int age = 0;
    Scanner scanner = new Scanner(System.in);
    /**
     * Constructor for objects of class PDA
     */
    public PDA()
    {
        // We don't need to do anything in the constructor for
        // our program.
    }

    /**
     * This is the main event loop for our PDA program
     */
    public void runEventLoop() {
        while(true) {
            System.out.println("How old are you?");
            int LOWER_BOUND = 13;
            try {
                age = scanner.nextInt();
                System.out.println(age);
                if (age < LOWER_BOUND) {
                    System.out.println(age + " is too young!!");
                } else {
                    System.out.println("Computations go here");
                }
            } catch (InputMismatchException error) {
                System.out.println("Please enter an integer");
            }
            scanner.next();
            System.out.println("How old are you?");
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


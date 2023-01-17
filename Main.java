/*
* This is a tower of hanoi program.
*
* @author  Rodas Nega
* @version 1.0
* @since   2023-01-17
*
* This is a tower of hanoi program
*/
import java.util.Scanner;

/**
 * This is Main Class.
 * Main Class.
 */
final class Main {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * This is the hanoi function.
     *
     * @param nOfDisks this is the number of disks.
     * @param startPeg this is the start peg.
     * @param endPeg this is the end peg.
     */
    static void hanoi(final int nOfDisks, final int startPeg,
                             final int endPeg) {
        // This function calculates where the disks should be placed in
        final int pegNumber = 6;
        if (nOfDisks == 1) {
            System.out.println("Move disk 1 from peg " + startPeg + " to peg "
                               + endPeg);
        } else {
            hanoi(nOfDisks - 1, startPeg, pegNumber - startPeg - endPeg);
            System.out.println("Move disk " + nOfDisks + " from the peg "
                            + startPeg + " t0 peg " + endPeg);
            hanoi(nOfDisks - 1, pegNumber - startPeg - endPeg, endPeg);
        }
    }

    /**
     * This starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        final int startPeg = 1;
        final int endPeg = 3;

        System.out.println("Tower of Hanoi");

        // input
        final Scanner userInput = new Scanner(System.in);
        System.out.print("\nHow many disks do you want?: ");

        try {
            final int nOfDisks = userInput.nextInt();
            System.out.println();
            if (nOfDisks > 0) {
                // process
                hanoi(nOfDisks, startPeg, endPeg);
            } else {
                System.out.println("\nPlease enter a positive integer");
            }
        } catch (java.util.InputMismatchException ex) {
            System.err.println("\nThis is an invalid input.");
        }
    }
}


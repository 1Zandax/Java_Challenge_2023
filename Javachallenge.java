/**
 * Represents a class that simulates rolling a six-sided die 20 times and
 * prints out the results.
 */
public class Main {

    /**
     * The main method that serves as the entry point for the program.
     * 
     * @param args Command line arguments, not used in this program.
     */
    public static void main(String[] args) {
        // Loop to simulate rolling the die 20 times.
        for (int i = 1; i <= 20; i++) {
        int roll = generateDieRoll();
        System.out.println("Roll " + i + " = " + roll);
        }
    }

    /**
     * Generates a random number between 1 and 6 (inclusive) to simulate a roll
     * of a six-sided die.
     * 
     * @return A random integer between 1 and 6.
     */
    private static int generateDieRoll() {
        return (int) (Math.random() * 6) + 1;
    }
}
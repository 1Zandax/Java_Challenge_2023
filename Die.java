import java.util.Random;

/**
 * This Die class represents a die with a configurable number of sides.
 */
public class Die {
    private static int totalDiceCreated = 0;  // Keeps track of the total number of dice created
    private final int numberOfSides;
    private int lastRoll = -1;  // Initialize with -1 to indicate it hasn't been rolled yet
    private static Random rand = new Random();

    /**
     * Default constructor, creates a 6-sided die.
     */
    public Die() {
        this(6);
    }

    /**
     * Constructor, creates an N-sided die.
     * @param N Number of sides for the die.
     */
    public Die(int N) {
        this.numberOfSides = N;
        totalDiceCreated++;
    }

    /**
     * Rolls the die and returns the rolled number.
     * @return The rolled number.
     */
    public int roll() {
        lastRoll = rand.nextInt(numberOfSides) + 1;
        return lastRoll;
    }

    /**
     * Returns the number of sides on the die.
     * @return Number of sides.
     */
    public int numSides() {
        return numberOfSides;
    }

    /**
     * Reads the last number rolled.
     * @return The last number rolled, or -1 if the die has not been rolled yet.
     */
    public int readLastRoll() {
        return lastRoll;
    }

    /**
     * Returns the total number of dice created.
     * @return Total dice created.
     */
    public static int totalDiceCreated() {
        return totalDiceCreated;
    }

    public static void main(String[] args) {
        // Roll a set of 3 dice and print out the sum of the die values (3 to 18).
        Die die1 = new Die();
        Die die2 = new Die();
        Die die3 = new Die();
        int sum = die1.roll() + die2.roll() + die3.roll();
        System.out.println("Sum of 3 dice rolls: " + sum);

        // Roll the set of dice 1000 times and print out how many times each value was rolled.
        int[] counts = new int[19];  // Index 3 to 18 for possible sums, 0 to 2 unused
        for (int i = 1; i < 1000; i++) {
            sum = die1.roll() + die2.roll() + die3.roll();
            counts[sum]++;
        }
        for (int i = 3; i <= 18; i++) {
            System.out.println("Number of times " + i + " was rolled: " + counts[i]);
        }
    }
}
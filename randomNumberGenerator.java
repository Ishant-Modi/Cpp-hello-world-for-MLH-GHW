import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();

        // Generating a random integer
        int randomNumber = random.nextInt();  // Generates a random 32-bit integer
        System.out.println("Random Integer: " + randomNumber);

        // Generating a random integer within a specific range (e.g., between 1 and 100)
        int minRange = 1;
        int maxRange = 100;
        int randomInRange = random.nextInt(maxRange - minRange + 1) + minRange;
        System.out.println("Random Integer in Range: " + randomInRange);

        // Generating a random double between 0.0 (inclusive) and 1.0 (exclusive)
        double randomDouble = random.nextDouble();
        System.out.println("Random Double: " + randomDouble);

        // Generating a random boolean
        boolean randomBoolean = random.nextBoolean();
        System.out.println("Random Boolean: " + randomBoolean);
    }
}

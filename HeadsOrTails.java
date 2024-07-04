import java.util.Random;

public class HeadsOrTails {
    public static void main(String[] args) {
        Random random = new Random();
        
        System.out.println("Tossing a coin...");
        int headsCount = 0;
        int tailsCount = 0;
        
        for (int i = 1; i <= 3; i++) {
            boolean coin = random.nextBoolean();
            String result = coin ? "Heads" : "Tails";
            System.out.println("Round "i + ": " + result);
            if (coin) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }
        
        System.out.println("Heads: " + headsCount + ", Tails: " + tailsCount);
    }
}

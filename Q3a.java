import java.util.Random;
public class Q3a {
    
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int randomNumber = rand.nextInt(9999) + 1000;
            System.out.println(randomNumber);
        }
    }
}
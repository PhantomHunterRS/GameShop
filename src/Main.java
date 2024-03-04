import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int quantity = 5;
        int count = 0;
        int times = 20;
        for (int i = 0; i < times; i++) {
            int rou = random.nextInt(100);
            if (rou >=1 && rou <= 100/quantity) {
                System.out.println(rou);
                count++;
            }
        }
        System.out.println("Count - " + count + " - вероятность :" + 100.0*count/times);
    }
}
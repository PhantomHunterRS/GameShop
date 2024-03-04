package Entity;

import java.util.Random;

public class Toy {
    private int id;
    private static int count = 0;
    private String toyTitle;
    private int quantity;
    private int frequencyOfLossToys;

    public Toy(String toyTitle, int quantity) {
        this.id = ++count;
        this.toyTitle = toyTitle;
        this.quantity = quantity;
        this.frequencyOfLossToys = frequencyOfLossToys;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id:" + id +
                ", toyTitle:'" + toyTitle + '\'' +
                ", quantity:" + quantity +
                ", frequencyOfLossToys:" + frequencyOfLossToys +
                '}';
    }
    private int chanceOfFallingOut(int quantity){
        Random random = new Random();
        int countX = 0;
        int times = 20;
        for (int i = 0; i < times; i++) {
            int rou = random.nextInt(100);
            if (rou >=1 && rou <= 100/quantity) {
                System.out.println(rou);
                count++;
            }
        }
        System.out.println("Count - " + count + " - вероятность :" + 100.0*count/times);
        return 100/quantity;
    }
    public double getFrequencyOfLossToys() {
        return frequencyOfLossToys;
    }

    public void setFrequencyOfLossToys(int frequencyOfLossToys) {
        this.frequencyOfLossToys = frequencyOfLossToys;
    }
}

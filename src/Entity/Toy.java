package Entity;

import java.util.Random;

public class Toy {
    private int id;
    private static int count = 0;
    private String toyTitle;
    private int quantity;
    private double frequencyOfLossToys;
    private double probabilityMin;
    private double probabilityMax;

    public Toy(String toyTitle, int quantity) {
        this.id = ++count;
        this.toyTitle = toyTitle;
        this.quantity = quantity;
        this.frequencyOfLossToys = 0;
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
    public double getFrequencyOfLossToys() {
        return frequencyOfLossToys;
    }
    public void setFrequencyOfLossToys(int allQuantity) {
        this.frequencyOfLossToys = (Math.round(((quantity*100.0)/allQuantity)*100))/100.0;

    }

    public void setWinToy() {
        this.quantity--;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getProbabilityMin() {
        return probabilityMin;
    }
    public double getProbabilityMax() {
        return probabilityMax;
    }
    public void setProbability(double probabilityMin) {
        this.probabilityMin = probabilityMin;
        this.probabilityMax = probabilityMin + frequencyOfLossToys;
    }

    public String getToyTitle() {
        return toyTitle;
    }
}

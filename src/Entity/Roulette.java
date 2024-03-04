package Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Roulette {
    List<Toy> toyList = new ArrayList<>();

    public List<Toy> getToyList() {
        return toyList;
    }
    private void beginnigGame() {
        toyList.add(new Toy("Bear", 20));
        toyList.add(new Toy("Rabbit", 15));
        toyList.add(new Toy("Crocodile", 21));
        toyList.add(new Toy("Monkey", 5));
        toyList.add(new Toy("Anaconda", 9));
        toyList.add(new Toy("Cat", 37));
        toyList.add(new Toy("Dog", 26));
        toyList.add(new Toy("Dolphin", 7));
        toyList.add(new Toy("Giraffe", 3));
        toyList.add(new Toy("Devil", 13));
        toyList.add(new Toy("Angel", 12));

        setFrequencyOfLossToysAll();
    }

    public Roulette() {
        beginnigGame();
    }

    private int countAllQuantity() {
        int allQuantity = 0;
        for (Toy x : toyList) {
            allQuantity = allQuantity + x.getQuantity();
        }
        return allQuantity;
    }

    public void setFrequencyOfLossToysAll() {
        int allQuantity = countAllQuantity();
        double probability = 0.0;
        for (Toy x : toyList) {
            x.setFrequencyOfLossToys(allQuantity);
            x.setProbability(probability);
            probability = probability +x.getFrequencyOfLossToys();
        }
    }
    public Toy rotationRoulette() {
        setFrequencyOfLossToysAll();
        Toy winToy = null;
        Random random = new Random();
        int rou = random.nextInt(100);
        for (Toy ItFellOut : toyList) {
            if (rou >= ItFellOut.getProbabilityMin() && rou <= ItFellOut.getProbabilityMax()) {
                System.out.println("Win - " + ItFellOut.getToyTitle());
                ItFellOut.setWinToy();
                winToy =  ItFellOut;
            }
        }
        return winToy;
    }

    public void printPrice(){
        for (Toy x :toyList) {
            System.out.println(x.toString() + "- Min:" + x.getProbabilityMin() + "-Max:" + x.getProbabilityMax());
        }
    }
}
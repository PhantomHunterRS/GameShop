import Entity.Roulette;
import Entity.Toy;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Roulette game = new Roulette();
        int count = 0;
        while (count<10){
            game.rotationRoulette();
            count++;
        }


    }
}
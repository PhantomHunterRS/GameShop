import Entity.Roulette;
import Entity.Toy;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Roulette game = new Roulette();
        game.printPrice();
        int count = 0;

        while (count > 1) {
            game.rotationRoulette();

            count++;
        }
    }
}
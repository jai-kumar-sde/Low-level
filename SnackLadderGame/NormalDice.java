package Problems.SnackLadderGame;

import java.util.Random;

public class NormalDice implements IDice {

    @Override
    public int roll() {
        Random random = new Random();
        return (random.nextInt() % 6 ) + 1;
    }
}

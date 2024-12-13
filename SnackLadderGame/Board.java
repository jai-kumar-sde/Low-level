package Problems.SnackLadderGame;

import java.util.Map;

public class Board {
    private int size;
    private Map<Integer,Integer> jumpers;

    public Board(int size, Map<Integer, Integer> jumpers) {
        this.size = size;
        this.jumpers = jumpers;
    }

    public int move(int currentPlayerPosition, int diceNumber) {
        int finalPosition = currentPlayerPosition + diceNumber;
        if(jumpers.containsKey(finalPosition)){
            finalPosition=jumpers.get(finalPosition);
        }
        if(finalPosition > 100 ) return currentPlayerPosition;
        return finalPosition;
    }
}

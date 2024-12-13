package Problems.SnackLadderGame;

import java.util.Queue;

public class Game {
    private Board board;
    private Queue<Player> players;
    private IDice dice;

    public Game(Board board, Queue<Player> players, IDice dice) {
        this.board = board;
        this.players = players;
        this.dice = dice;
    }

    public User start(){
        while(true){
            Player currentPlayer = getPlayer();

            int diceNumber = dice.roll();
            int latestPosition = board.move(currentPlayer.getPosition(),diceNumber);
            currentPlayer.setPosition(latestPosition);
            if(latestPosition ==100)return currentPlayer.getUser();

        }
    }

    private Player getPlayer() {
        Player currentPlayer = this.players.remove();
        this.players.add(currentPlayer);
        return currentPlayer;
    }

}

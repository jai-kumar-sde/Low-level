package Problems.TicTakToe;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Rahul");
        User user2 = new User("Deepak");

        Player player1 = new Player(user1,Piece.X);
        Player player2 = new Player(user2,Piece.O);

        Board board = new Board(3);

        //List<Player> totalPlayers = new Deque<Player>() ;
        Deque<Player > totalPlayers = new ArrayDeque<>();
      //  Queue<Player> t = new LinkedList<>();

        totalPlayers.addLast(player1);
        totalPlayers.addLast(player2);

        TicTakToeGame game = new TicTakToeGame(board,totalPlayers);
            game.start();
    }
}

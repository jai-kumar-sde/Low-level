package Problems.SnackLadderGame;

import jdk.internal.org.objectweb.asm.tree.InnerClassNode;

import java.util.*;

public class SnackLadderGameMain {

    public static void main(String[] args) {
        Queue<Player> players = new LinkedList<Player>(Arrays.asList(
                new Player(new User(1, "Jai"),0),
                new Player(new User(2,"Karthik"),0),
                new Player(new User(3,"Rajat"),0)
        ));

        Map<Integer, Integer> jumpers = new HashMap<Integer,Integer>(){{
            put(3, 7);
            put(2,15);
            put(11, 20);
            put(24,3);
            put(20,10);
        }};
        Board board = new Board(25,jumpers);
        IDice dice = new NormalDice();

        Game game = new Game(board,players,dice);

        User user= game.start();
        System.out.println(user);
        System.out.printf("%s is the winner",user.getName());
    }
}

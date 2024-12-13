package Problems.TicTakToe;

import java.util.*;

public class TicTakToeGame {
    private Board board;
    private Stack<Move> history;
    private Deque<Player> currentPlayers;

    public TicTakToeGame(Board board, Deque<Player> currentPlayers) {
        this.board = board;
        this.history = new Stack<>();
        this.currentPlayers = currentPlayers;
    }

    public Player start(){
        System.out.println("Welcome to the Game");
        Scanner scn= new Scanner(System.in);
        while(true){
            Player currentPlayer = currentPlayers.remove();
            currentPlayers.add(currentPlayer);
            System.out.println(currentPlayer.getUser().getName() + "Player Turn\n");

            board.getBoardState();
            while(true){


                System.out.println("Please Enter the coordinate");
                int x= scn.nextInt();
                int y= scn.nextInt();
                try{
                    State result =board.makeMove(new Move(x,y,currentPlayer.getPiece()));
                    this.history.push(new Move(x,y,currentPlayer.getPiece()));
                    if(result == State.WINNING){
                        System.out.println(currentPlayer.getUser().getName()+ " Win the Game");
                        board.getBoardState();
                        return currentPlayer;
                    }
                    else if(result == State.DRAW){
                        System.out.println("Game is Draw");
                        return null;
                    }
                    System.out.println("Press 1. To Undo the selection. 2. Continue");
                    if(scn.nextInt() == 1){

                        while(this.history.size()!=0){
                            board.getBoardState();
                            Move move = this.history.pop();
                            board.undoMove(move);
                            this.currentPlayers.addFirst(this.currentPlayers.getLast());
                            System.out.println("Press 1. Undo 2. Continue ");
                            if(scn.nextInt()!=1) {
                                break;
                            }
                        }
                    }
                    break;
                }
                catch (Exception e){
                    System.out.println(e);

                }

            }
        }
    }


}

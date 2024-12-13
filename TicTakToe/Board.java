package Problems.TicTakToe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Board {

    private int size;
    private Piece  board[][];

    private List<HashMap<Piece, Integer>> rowCounter;
    private List<HashMap<Piece, Integer>> colCounter;
    private HashMap<Piece, Integer> rightDiagCounter;
    private HashMap<Piece, Integer> leftDiagCounter;
    private int totalfilledCell;

    public Board(int size) {
        this.size = size;
        this.board = new Piece[size][size];// ArrayList<List<Piece>>(size,Piece.E);

        this.rowCounter = new ArrayList<HashMap<Piece,Integer>>(size);
        this.colCounter = new ArrayList<HashMap<Piece,Integer>>(size);
        this.rightDiagCounter = new HashMap<Piece,Integer>();
        this.leftDiagCounter = new HashMap<Piece,Integer>();
        intilizeBoard();
        this.totalfilledCell=0;
    }
    public void intilizeBoard(){
       // HashMap<Piece,Integer> map = new HashMap<>();
        for(int i=0;i<size;i++){
            this.rowCounter.add(new HashMap<>());
            this.colCounter.add(new HashMap<>());
            for(int j=0;j<size;j++){
                board[i][j]=Piece.E;
            }
        }
    }

    public State  makeMove(Move move) throws Exception {
        int x=move.getX(),y= move.getY();
        Piece piece= move.getPiece();

        if(x>=size || y>= size || x<0 || y<0 ) throw new Exception("Please Enter the valid command");

        if(board[x][y]!=Piece.E) throw new Exception("Cell is alreday fill.");

        board[x][y]=piece;
        this.totalfilledCell++;
        System.out.println("works");
        rowCounter.get(x).put(piece,rowCounter.get(x).getOrDefault(piece,0)+1);
        colCounter.get(y).put(piece,colCounter.get(y).getOrDefault(piece,0)+1);
        if(x==y)rightDiagCounter.put(piece,rightDiagCounter.getOrDefault(piece,0)+1);
        if(x== size-y-1)leftDiagCounter.put(piece,leftDiagCounter.getOrDefault(piece,0)+1);

        if(rowCounter.get(x).getOrDefault(piece,0)==size || colCounter.get(y).getOrDefault(piece,0) == size)return State.WINNING;
        if(x==y && rightDiagCounter.getOrDefault(piece,0)==size)return State.WINNING;
        if(x== size-y-1 && leftDiagCounter.getOrDefault(piece,0)==size)return State.WINNING;
        if(totalfilledCell==size*size) return State.DRAW;

        return State.LOSE;
    }
    public void getBoardState(){
        for(int i=0;i<size;i++){
            //System.out.println("\n");
            for(int j=0;j<size;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
    public void  undoMove(Move move) throws Exception {
        int x=move.getX(),y= move.getY();
        Piece piece= move.getPiece();

        if(x>=size || y>= size || x<0 || y<0 ) throw new Exception("Please Enter the valid command");

        if(board[x][y]==Piece.E) throw new Exception("Cell is alreday EMPTY.");

        board[x][y]=Piece.E;
        this.totalfilledCell--;
        System.out.println("works");
        rowCounter.get(x).put(piece,rowCounter.get(x).getOrDefault(piece,0)-1);
        colCounter.get(y).put(piece,colCounter.get(y).getOrDefault(piece,0)-1);
        if(x==y)rightDiagCounter.put(piece,rightDiagCounter.getOrDefault(piece,0)-1);
        if(x== size-y-1)leftDiagCounter.put(piece,leftDiagCounter.getOrDefault(piece,0)-1);

//        if(rowCounter.get(x).getOrDefault(piece,0)==size || colCounter.get(y).getOrDefault(piece,0) == size)return State.WINNING;
//        if(x==y && rightDiagCounter.getOrDefault(piece,0)==size)return State.WINNING;
//        if(x== size-y-1 && leftDiagCounter.getOrDefault(piece,0)==size)return State.WINNING;
//        if(totalfilledCell==size*size) return State.DRAW;

        //return State.LOSE;
    }

}

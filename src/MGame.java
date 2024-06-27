import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MGame {
    public int roundCount;
    public Board board;
    public Die dice1;
    public Die dice2;
    public List<Player> players;

    public MGame(int maxPlayer) {
        this.board = new Board();
        this.players = new ArrayList<>(maxPlayer);
    }

    public void playGame(){
        board.createBoard(board.getLocationsName());

        int maxRound = 20;
        for (this.roundCount=1; this.roundCount < maxRound; roundCount++) {

        }

    }

    private void playRound(int player){
        Player now = this.players.get(player);
        Square oldLoc = now.getPiece().oldLoc;
        now.takeTurn();
        System.out.println("First roll: " + now.getDice1().getFaceValue());
        System.out.println("Second roll: " + now.getDice2().getFaceValue());
        int total = now.getDice1().getFaceValue() + now.getDice2().getFaceValue();
        System.out.println("Total rolls: " + total);
        System.out.println(now.getName() + " move from " + oldLoc.getName() + " to " + now.getPiece().getNewLoc().getName());
        System.out.println("----------------------------------------");
    }
}

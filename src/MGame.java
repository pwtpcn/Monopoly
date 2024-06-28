import java.util.ArrayList;
import java.util.List;

public class MGame {
    public int roundCount;
    public Board board;
    public ArrayList<Die> dice;
    public List<Player> players;

    public MGame(int maxPlayer) {
        this.board = new Board();
        this.dice = new ArrayList<>();
        dice.add(new Die());
        dice.add(new Die());
        this.players = new ArrayList<>(maxPlayer);
    }

    public void playGame(){
        board.createBoard();

        System.out.println("Player list: ");
        for(Player player : players){
            player.setDice(this.dice);
            player.setBoard(board);
            player.getPiece().setOldLoc(board.getSquares().getFirst());
            player.getPiece().setNewLoc(board.getSquares().getFirst());
            System.out.println(player.getName());
        }
        System.out.println("----------------------------------------");

        for (this.roundCount=1; this.roundCount <= 10; roundCount++) {
            playRound(roundCount);
        }

        System.out.println("Out of round.");
        System.out.println("End the game.");

    }

    private void playRound(int roundCount){
        Player now = this.players.get(roundCount % players.size());
        now.takeTurn();
        System.out.println("Round " + roundCount);
        System.out.println("It's " + now.getName() + " turn.");
        System.out.println("First roll: " + now.getDice().get(0).getFaceValue());
        System.out.println("Second roll: " + now.getDice().get(1).getFaceValue());
        int total = now.getDice().get(0).getFaceValue() + now.getDice().get(1).getFaceValue();
        System.out.println("Total rolls: " + total);
        System.out.println(now.getName() + " move from " + now.getPiece().getOldLoc().getName() + " to " + now.getPiece().getNewLoc().getName());
        System.out.println("----------------------------------------");
    }
}
import java.util.ArrayList;

public class Player {
    public String name;
    public ArrayList<Die> dice;
    public Piece piece;
    public Board board;

    public Player(String name) {
        this.name = name;
        this.piece = new Piece();
    }

    public void takeTurn(){
        int totalVal = 0;
        for(Die die : dice){
            die.roll();
            totalVal += die.getFaceValue();
        }

        Square newLoc = board.findNewSquare(piece.getNewLoc(),totalVal);
        piece.setLoc(newLoc);
    }

    public String getName() {
        return name;
    }

    public Piece getPiece() {
        return piece;
    }

    public Board getBoard() {
        return board;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public ArrayList<Die> getDice() {
        return dice;
    }

    public void setDice(ArrayList<Die> dice) {
        this.dice = dice;
    }
}
public class Player {
    public String name;
    public Die dice1;
    public Die dice2;
    public Piece piece;
    public Board board;

    public Player(String name) {
        this.name = name;
        this.dice1 = new Die();
        this.dice2 = new Die();
    }

    public void takeTurn(){
        dice1.roll();
        dice2.roll();
        int totalVal = dice1.getFaceValue() + dice2.getFaceValue();
        piece.setLoc(board.findNewSquare(piece.oldLoc,totalVal));
    }

    public String getName() {
        return name;
    }

    public Die getDice1() {
        return dice1;
    }

    public Die getDice2() {
        return dice2;
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

    public void setDice1(Die dice1) {
        this.dice1 = dice1;
    }

    public void setDice2(Die dice2) {
        this.dice2 = dice2;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}

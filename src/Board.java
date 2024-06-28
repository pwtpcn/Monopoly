import java.util.ArrayList;
import java.util.List;

public class Board {
    public List<Square> squares = new ArrayList<>(40);

    public void createBoard(){
        for(int i=0; i<40; i++){
            Square square = new Square("block" + Integer.toString(i));
            squares.add(square);
        }
    }

    public Square findNewSquare(Square newLoc, int totalVal){
     int index = squares.indexOf(newLoc);
     return squares.get((index + totalVal)%40);
    }

    public List<Square> getSquares() {
        return squares;
    }
}

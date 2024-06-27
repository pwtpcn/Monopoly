import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {
    public List<Square> squares = new ArrayList<>(40);
    public ArrayList<String> locationsName = new ArrayList<>(Arrays.asList(
            "Start", "block1", "block2", "block3", "block4", "block5", "block6", "block7", "block8", "block9",
            "Go to Jail", "block10", "block11", "block12", "block13", "block14", "block15", "block16", "block17", "block18",
            "Chill bro chill", "block19", "block20", "block21", "block22", "block23", "block24", "block25", "block26", "block27",
            "Just sitting in Jail", "block28", "block29", "block30", "block31", "block32", "block33", "block34", "block35", "block36"
    ));

    public void createBoard(ArrayList<String> locationsName){
        for(String loc : locationsName){
            Square square = new Square(loc);
            squares.add(square);
        }
    }

    public Square findNewSquare(Square oldLoc, int totalVal){
     int index = squares.indexOf(oldLoc);
     return squares.get(index + totalVal);
    }

    public List<Square> getSquares() {
        return squares;
    }

    public ArrayList<String> getLocationsName() {
        return locationsName;
    }
}

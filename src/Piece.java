public class Piece {
    public Square oldLoc = new Square("Start");
    public Square newLoc = new Square("-");

    public Square getOldLoc() {
        return oldLoc;
    }

    public Square getNewLoc() {
        return newLoc;
    }

    public void setOldLoc(Square oldLoc) {
        this.oldLoc = oldLoc;
    }

    public void setNewLoc(Square newLoc) {
        this.newLoc = newLoc;
    }

    public void setLoc(Square loc) {
        setOldLoc(this.newLoc);
        setNewLoc(loc);
    }
}

public class Piece {
    public Square oldLoc;
    public Square newLoc;

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

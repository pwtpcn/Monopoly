import java.util.Random;

public class Die {
    public int faceValue;

    public Die() {
        this.faceValue = 0;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    public void roll(){
        Random rand = new Random();
        setFaceValue(rand.nextInt(6));
    }

}

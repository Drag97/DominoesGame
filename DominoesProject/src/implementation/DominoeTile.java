package implementation;

public class DominoeTile {
    
    private int leftTile;
    private int rightTile;
    
    public DominoeTile(int leftTile, int rightTile) {
        this.leftTile = leftTile;
        this.rightTile = rightTile;
    }
    public int getLeftTile() {
        return leftTile;
    }
    public void setLeftTile(int leftTile) {
        this.leftTile = leftTile;
    }
    public int getRightTile() {
        return rightTile;
    }
    public void setRightTile(int rightTile) {
        this.rightTile = rightTile;
    }
    @Override
    public String toString() {
        return "DominoeTile [leftTile=" + leftTile + ", rightTile=" + rightTile + "]";
    }

}
package implementation;
import java.util.*;

public class CPlayer {
    private int id;
    private List<DominoeTile> tiles;
    
    public CPlayer(int id, List<DominoeTile> tiles) {
        this.id = id;
        this.tiles = tiles;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public List<DominoeTile> getTiles() {
        return tiles;
    }
    public void setTiles(List<DominoeTile> chips) {
        this.tiles = chips;
    }
    @Override
    public String toString() {
        return "CPlayer [id=" + id + ", tiles=" + tiles + "]";
    }
}
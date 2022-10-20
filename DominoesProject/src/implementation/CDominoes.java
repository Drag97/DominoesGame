package implementation;
import java.util.*;

public class CDominoes {

    private List<DominoeTile> dominoes;

    public CDominoes(List<DominoeTile> dominoes) {
        this.dominoes = dominoes;
    }

    public List<DominoeTile> getDominoes() {
        return dominoes;
    }

    public void setDominoes(List<DominoeTile> dominoes) {
        this.dominoes = dominoes;
    }

    @Override
    public String toString() {
        return "CDominoes [dominoes=" + dominoes + "]";
    }


}
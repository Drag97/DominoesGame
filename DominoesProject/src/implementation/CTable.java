package implementation;
import java.util.*;

public class CTable {
    
    public static void print(CPlayer player, List<DominoeTile> train){
        
        System.out.println(String.format("Train: %s", ( train == null || train.isEmpty() ? "[]":printArrayList(train))));
        System.out.println(String.format("Player %s Dominoes:", player.getId()));
        
        player.getTiles().forEach(x -> {
            System.out.println(String.format("%s: [%s, %s]", player.getTiles().indexOf(x), x.getLeftTile(), x.getRightTile()));
        });
    
    }

    private static String printArrayList(List<DominoeTile> tileArray){
        String Str = "";
        for(DominoeTile tile: tileArray){
            Str+= String.format("[%s,%s]",tile.getLeftTile(),tile.getRightTile());
        }
        return Str;
    }


    @Override
    public String toString() {
        return "CTable []";
    }
    
}
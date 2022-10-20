package implementation;
import java.util.*;

public class CRandom {

    public static List<DominoeTile> randomizedDraw(List<DominoeTile> dominoList, int drawCount){
        List<DominoeTile> returnList = new ArrayList<>();
        Random rand = new Random();
        
        int counter = 0;
        while(counter < drawCount){
            DominoeTile randomElement = dominoList.get(rand.nextInt(dominoList.size()));
            returnList.add(randomElement);
            dominoList.remove(randomElement);
            counter++;
        }
        return returnList;
    }   
}
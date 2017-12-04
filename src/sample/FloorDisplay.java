package sample;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Jordan on 21/11/2017.
 */
public class FloorDisplay
{
    public FloorDisplay(List <Floor> floorList)
    {
        this.floorList = floorList;
    }

    private List <Floor> floorList;

    public String[] getFloorStatistics()
    {
        String[] floorStats = new String[floorList.size()];
        Iterator <Floor> floorIterator = floorList.iterator();
        int number = 0;
        while (floorIterator.hasNext())
        {
            Floor floor = floorIterator.next();
            int count = floor.noOfSpaces();
            if (count >= 0) floorStats[number] = floor.getFloorLetter() + " " + count + " spaces available";
            else floorStats[number] = floor.getFloorLetter() + "Unmonitored";
        }
        return floorStats;
    }

}

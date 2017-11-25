package sample;

/**
 * Created by Jordan on 25/11/2017.
 */
public class Bay
{
    protected Floor floor;
    protected int bayNo;

    Bay(Floor floor, int bayNo){
        this.floor = floor;
        this.bayNo = bayNo;
    }

    @Override
    public String toString()
    {
        return floor.getFloorLetter()+bayNo;
    }
}

package sample;

/**
 * Created by Jordan on 25/11/2017.
 */
public class Bay
{
    protected Floor floor;
    protected int bayNo;
    protected boolean disabled;

    Bay(Floor floor, int bayNo, boolean disabled){
        this.floor = floor;
        this.bayNo = bayNo;
        this.disabled = disabled;
    }

    @Override
    public String toString()
    {
        return floor.getFloorLetter()+bayNo;
    }
}

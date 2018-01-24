package sample;

/**
 * Created by Jordan on 25/11/2017.
 */
public class Bay
{
    protected Floor floor;
    protected int bayNo;
    protected boolean disabled;
    private Car car;

    Bay(Floor floor, int bayNo, boolean disabled){
        this.floor = floor;
        this.bayNo = bayNo;
        this.disabled = disabled;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString()
    {
        return floor.getFloorLetter()+bayNo;
    }
}

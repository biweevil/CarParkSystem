package sample;

/**
 * Created by Jordan on 25/11/2017.
 */
public class Bay
{
    protected Floor floor;
    protected int bayNo;
    protected boolean disabled;
    private boolean carPresent;
    private Car car;

    Bay(Floor floor, int bayNo){
        this.floor = floor;
        this.bayNo = bayNo;
        this.disabled = false;
        this.carPresent = false;
    }

    public void setCarPresent(boolean carPresent) {
        this.carPresent = carPresent;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
        carPresent = true;
    }
    public boolean isCarPresent(){
        return carPresent;
    }

    @Override
    public String toString()
    {
        return floor.getFloorLetter()+bayNo;
    }
}

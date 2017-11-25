package sample;

/**
 * Created by Jordan on 25/11/2017.
 */
public class SecureBay extends Bay
{
    private boolean carPresent;
    private boolean secured;
    private String status;

    SecureBay(CarPark carPark, Floor floor, int bayNo)
    {
        super(floor, bayNo);
        carPresent = false;
        secured = false;
    }

    public boolean canSecure()
    {
        return carPresent && !secured;
    }

    public boolean canPark()
    {
        return !carPresent && !secured;
    }

    public boolean canLeave()
    {
        return carPresent && !secured;
    }

    public boolean canUnsecure()
    {
        return carPresent && secured;
    }

    public void parkCar()
    {
        if (canPark())
        {
            status = "Unsecured Car parked";
            carPresent = true;
        }
    }

    public void secureCar()
    {
        if (canSecure())
        {
            secured = true;
            status = "Car Secured";
        }
    }

    public void unsecureCar()
    {
        if (canUnsecure())
        {
            secured = false;
            status = "Unsecured Car Parked";
        }
    }

    public void unparkCar()
    {
        if (canLeave())
        {
            carPresent = false;
            status = "Empty";
        }
        else if (canUnsecure()){
            floor.bayViolation(this);
        }
    }
}

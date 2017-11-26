package sample;

/**
 * Created by Jordan on 21/11/2017.
 */
public class Coin
{
    private Car car;
    private CoinMachine currentMachine;
    private boolean paid;

    public String toString()
    {
        return this.hashCode() + "";
    }

    public void paid()
    {
        paid = true;
    }

    public void assignCar(Car newCar)
    {
        car = newCar;
        paid = false;
    }

    public boolean isPaid()
    {
        return paid;
    }

    public void assignCurrentMachine(CoinMachine currentMachine)
    {
        this.currentMachine = currentMachine;
    }
}

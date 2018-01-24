package sample;

/**
 * Created by Jordan on 21/11/2017.
 */
public class Coin
{
    private Car car;
    private CoinMachine currentMachine;
    private boolean paid;
    private AccountInfo accountInfo;
    private double totalCost;

    public Coin()
    {
        this.totalCost = 5;
    }

    public void setTotalCost(double totalCost)
    {
        this.totalCost = totalCost;
    }

    public double getTotalCost()
    {
        return totalCost;

    }

    public String toString()
    {
        return this.hashCode() + "";
    }

    public void paid()
    {
        paid = true;
    }

    public AccountInfo getAccountInfo()
    {
        return accountInfo;
    }

    public void setAccountInfo(AccountInfo accountInfo)
    {
        this.accountInfo = accountInfo;
    }

    public void assignCar(Car newCar)
    {
        car = newCar;
        paid = false;
    }

    public Car getCar() {
        return car;
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

package sample;

/**
 * Created by Jordan on 21/11/2017.
 */
public class ExitPoint extends AccessPoint
{
    public ExitPoint(CarPark carPark)
    {
        super(carPark);
        coinMachine = new CoinCollector(carPark, 100);
    }
}

package sample;

/**
 * Created by Jordan on 21/11/2017.
 */
public class EntryPoint extends AccessPoint
{

    public EntryPoint(CarPark carPark)
    {
        super(carPark);
        coinMachine = new CoinDispenser(carPark, 100);
    }


}

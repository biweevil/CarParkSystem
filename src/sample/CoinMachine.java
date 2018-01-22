package sample;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Jordan on 21/11/2017.

 */
public abstract class CoinMachine
{
    protected Queue<Coin> coinBox;
    protected CoinManager coinManager;
    protected Coin currentCoin;
    protected int size;
    protected CarPark carPark;

    public CoinMachine(CarPark carPark, int size)
    {
        this.carPark = carPark;
        this.size = size;
        coinBox = new LinkedList <Coin>();
        coinManager = carPark.getCoinManager();
    }

    public void startInteraction()
    {

    }
}

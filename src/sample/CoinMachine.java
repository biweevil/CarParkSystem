package sample;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Jordan on 21/11/2017.

 */
public abstract class CoinMachine
{
    protected LinkedBlockingQueue <Coin> coinBox;
    protected CoinManager coinManager;
    protected Coin currentCoin;

    public CoinMachine(CarPark carPark, int size)
    {
        coinBox = new LinkedBlockingQueue <>(size);
        coinManager = carPark.getCoinManager();
    }

    public void startInteraction(Coin currentCoin)
    {

    }
}

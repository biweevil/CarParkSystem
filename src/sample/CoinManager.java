package sample;

import java.util.*;

/**
 * Created by Jordan on 23/11/2017.
 */
public class CoinManager
{
    private static CoinManager coinManager;

    private Queue <Coin> coinPool;
    private ArrayList <Coin> decirculatedCoins;

    private CoinManager()
    {
        coinPool = new LinkedList <Coin>();
        decirculatedCoins = new ArrayList <Coin>();
    }

    public void addNewCoins(Coin[] newCoins)
    {
        for (Coin newCoin : newCoins)
        {
            coinPool.add(newCoin);
        }
    }

    public void addUsedCoin(Coin usedCoin)
    {
        usedCoin.assignCurrentMachine(null);
        decirculatedCoins.add(usedCoin);
    }

    public void lostCoin(Car car)
    {
        coinPool.remove(car.getCoin());
    }

    public boolean validCoin(Coin testCoin)
    {
        return coinPool.contains(testCoin);
    }


    //TODO how are coin managed
}

package sample;

import java.util.*;

/**
 * Created by Jordan on 23/11/2017.
 */
public class CoinManager
{

    private Queue <Coin> coinPool;
    private ArrayList <Coin> decirculatedCoins;
    private ArrayList<Coin> coinsInUse;

    public CoinManager()
    {
        coinPool = new LinkedList <Coin>();
        decirculatedCoins = new ArrayList <Coin>();
        coinsInUse = new ArrayList <Coin>();
    }

    public void addNewCoins(Coin... newCoins)
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

    public Coin getNextCoin(){
        if(coinPool.isEmpty()){
            addNewCoins(new Coin());
        }
        return coinPool.poll();
    }

    public void addCoinInUse(Coin coinInUse){
        coinsInUse.add(coinInUse);
    }


    public void removeCoinInUse(Coin coinNotInUse){
        coinsInUse.remove(coinNotInUse);
    }

    public ArrayList<Coin> getCoinsInUse()
    {
        return coinsInUse;
    }

    //TODO how are coin managed
}

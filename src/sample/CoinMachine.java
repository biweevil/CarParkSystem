package sample;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Jordan on 21/11/2017.
 */
public abstract class CoinMachine
{
    protected LinkedBlockingQueue<Coin> coinBox;
    protected CoinManager coinManager;

    public CoinMachine(CarPark carPark, int size){
        coinBox = new LinkedBlockingQueue <Coin>(size);
        coinManager = carPark.getCoinManager();
    }

    public void startInteraction(Car currentCar){

    }
}

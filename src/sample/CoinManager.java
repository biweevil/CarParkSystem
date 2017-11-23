package sample;

/**
 * Created by Jordan on 23/11/2017.
 */
public class CoinManager
{
    private static CoinManager coinManager;

    public static CoinManager getInstance(){
        return coinManager==null ? coinManager = new CoinManager() : coinManager;
    }

    public Coin requestCoin(){

    }

    public returnCoin(){

    }
}

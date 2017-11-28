package sample;

/**
 * Created by Jordan on 21/11/2017.
 */
public class CoinCollector extends CoinMachine
{
    public CoinCollector(CarPark carPark, int size)
    {
        super(carPark, size);
    }

    public void startInteraction(Coin currentCoin)
    {
        this.currentCoin = currentCoin;
    }

    public void emptyCoins()
    {
        while (!coinBox.isEmpty())
        {
            coinManager.addUsedCoin(coinBox.poll());
        }
    }
}

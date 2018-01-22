package sample;

/**
 * Created by Jordan on 21/11/2017.
 */
public class CoinDispenser extends CoinMachine
{
    CoinDispenser(CarPark carPark, int size)
    {
        super(carPark, size);
    }

    public void startInteraction(){
        while (coinBox.size() < this.size)
        {
            Coin fetchedCoin = this.coinManager.getNextCoin();
            this.coinBox.add(fetchedCoin);
        }
        this.coinManager.addCoinInUse(coinBox.poll());
        carPark.updateGUI();
    }
}

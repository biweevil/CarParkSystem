package sample;

/**
 * Created by Jordan on 21/11/2017.
 */
public class CoinCollector extends CoinMachine
{
    public CoinCollector(int size){
        super(size);
    }

    public void startInteraction(Car currentCar){

    }

    public void emptyCoins(){
        while (!coinBox.isEmpty())
        {
            coinManager.addUsedCoin(coinBox.poll());
        }
    }
}

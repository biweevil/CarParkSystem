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

    public void startInteraction(Coin currentCoin){
        this.currentCoin = currentCoin;
    }
}

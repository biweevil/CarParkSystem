package sample;

/**
 * Created by Jordan on 21/11/2017.
 */
public abstract class AccessPoint
{

    protected CoinMachine coinMachine;
    protected Coin currentCoin;
    protected CarPark carPark;

    AccessPoint(CarPark carPark){
        this.carPark = carPark;
    }


    public void carInteracts(){
            coinMachine.startInteraction();
    }

}

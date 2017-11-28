package sample;

/**
 * Created by Jordan on 21/11/2017.
 */
public abstract class AccessPoint
{
    protected RegPlateScanner regPlateScanner;
    protected Barrier barrier;
    protected CoinMachine coinMachine;
    protected Coin currentCoin;
    protected CarPark carPark;


    public void carInteracts(){
        String carRegPlate = regPlateScanner.scanCar();
        if(carRegPlate.length() > 0)
        {
            coinMachine.startInteraction(currentCoin);
        }
    }

}

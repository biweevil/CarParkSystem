package sample;

/**
 * Created by Jordan on 21/11/2017.
 */
public abstract class AccessPoint
{
    protected RegPlateScanner regPlateScanner;
    protected Barrier entryBarrier;
    protected CoinMachine coinMachine;
    protected Car currentCar;
    protected CarPark carPark;

    public void carArrived(){
        currentCar = regPlateScanner.scanCar();
    }

    public void carInteracts(){
        coinMachine.startInteraction(currentCar);
    }

}

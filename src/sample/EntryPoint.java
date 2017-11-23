package sample;

/**
 * Created by Jordan on 21/11/2017.
 */
public class EntryPoint extends AccessPoint
{
    private FullSign fullSign;
    private FloorDisplay floorDisplay;

    public EntryPoint(){
        coinMachine = new CoinDispenser();
    }
}

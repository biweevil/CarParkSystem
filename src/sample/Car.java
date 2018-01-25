package sample;

import java.time.LocalDateTime;

/**
 * Created by Jordan on 21/11/2017.
 */
public class Car
{

    private LocalDateTime timeOfEntry;
    private Coin coin;
    public boolean secure;

    public Car(Coin coin){
        this.coin = coin;
        coin.assignCar(this);
        secure = false;
    }



    public Coin getCoin(){
        return coin;
    }

}

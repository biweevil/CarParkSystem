package sample;

import java.time.LocalDateTime;

/**
 * Created by Jordan on 21/11/2017.
 */
public class Car
{

    private LocalDateTime timeOfEntry;
    private Coin coin;

    public Car(Coin coin){
        this.coin = coin;
    }

    public Coin getCoin(){
        return coin;
    }

}

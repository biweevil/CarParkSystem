package sample;

import java.time.LocalDateTime;

/**
 * Created by Jordan on 21/11/2017.
 */
public class Car
{
    private String registraionPlate;
    private LocalDateTime timeOfEntry;
    private Coin coin;

    public Car(String registraionPlate, Coin coin){
        this.registraionPlate = registraionPlate;
        this.coin = coin;
    }

    public Coin getCoin(){
        return coin;
    }

}

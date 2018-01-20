package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Jordan on 20/01/2018.
 */
public class CoinGUI
{
    @FXML
    private ListView<Coin> CoinList;

    private Controller main;

    public void setMain(Controller main){
        this.main = main;
    }

    public void Update(){
        try
        {
            CoinManager coinManager = main.currentCarPark.coinManager;
            List <Coin> coins = coinManager.getCoinsInUse();
            CoinList.getItems().clear();
            CoinList.getItems().addAll(coins);
        }catch (NullPointerException e){

        }
    }
}

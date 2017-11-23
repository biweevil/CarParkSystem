package sample;

/**
 * Created by Jordan on 21/11/2017.
 */
public class Car
{
    private String registraionPlate;
    private boolean paid;

    public Car(String registraionPlate){
        this.registraionPlate = registraionPlate;
        paid = false;
    }

    public void paid(){
        paid = true;
    }

    public boolean isPaid(){
        return paid;
    }

}

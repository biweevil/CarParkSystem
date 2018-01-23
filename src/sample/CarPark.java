package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Jordan on 21/11/2017.
 */
public class CarPark
{
    //DITCH NUMBER PLATES, QR COINS!!!!!!!!!!!!!
    //can not use number plate scanner
    //
    //extreme conditions,
    //a car exceed max stay
    //a car if ditched
    //a coin is lost //use picture
    //a car breaks down //
    //machine runs out of coins
    //unknown recognised coin entered
    //coin collector is full
    //coin is entered in payment booth before last transaction
    //coin is left in the payment machine
    //car park is full
    //car tailgates
    //customer cannot pay up
    //system loses of the number of spaces available
    //barrier does not raise - press for assistance
    ////cant lose car, cant lose number plate,
    //change not available
    //full of cash



    public int exitPoints;
    public String carParkName;

    public Stack <Floor> floorList;
    public EntryPoint entryPoint;
    public Stack <PaymentMachine> paymentMachines;
    public CoinManager coinManager;
    public int noOfCars;
    private Controller controller;

    public CarPark(Controller controller, String name)
    {
        this.controller = controller;
        this.coinManager = new CoinManager();
        exitPoints = 1;
        carParkName = name;

        floorList = new Stack <Floor>();
        Floor firstFloor = new Floor(this, 10, false, floorList.size());
        floorList.push(firstFloor);
        noOfCars = 0;
        entryPoint = new EntryPoint(this);
    }
    public void updateGUI(){
        controller.Update();
    }

    public void setName(String newName){
        carParkName = newName;
    }

    public void setExitPoints(int exitPoints){
        this.exitPoints = exitPoints;
    }

    public String toString(){
        return carParkName;
    }

    public CoinManager getCoinManager()
    {
        return coinManager;
    }

    public int getCapacity()
    {
        int sum = 0;
        for (Floor floor : floorList)
        {
            sum += floor.noOfBays();
        }
        return sum;
    }

    public int getSpaces()
    {
        return noOfCars;
    }

    public final Floor getFloor(int floor)
    {
        return (Floor) ((List) floorList).get(floor);
    }

    public void addFloor(int bays, boolean secure)
    {
        floorList.push(new Floor(this, bays, secure, floorList.size()));
    }

    public void removeFloor()
    {
        if(!floorList.empty())
            floorList.pop();
    }

    public void addPaymentMachine()
    {
        paymentMachines.push(new PaymentMachine(this));
    }

    public void bayViolation(SecureBay secureBay)
    {
        secureBay.toString();
    }



}
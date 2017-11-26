package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Jordan on 21/11/2017.
 */
public class CarPark
{
    //DITCH NUMBER PLATES, BARCODE COINS!!!!!!!!!!!!!
    //can not use number plate scanner
    //
    //extreme conditions,
    //a car exceed max stay
    //a car if ditched
    //a coin is lost //use picture
    //a car breaks down //
    //a number plate is not readable
    //number is incorrectly read
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

    private Stack <Floor> floorList;
    private EntryPoint entryPoint;
    private Stack <ExitPoint> exitPoints;
    private Stack <PaymentMachine> paymentMachines;
    private CoinManager coinManager;
    private PaymentModel paymentModel;
    private int noOfCars;

    public CarPark()
    {
        floorList = new Stack <Floor>();
        exitPoints = new Stack <ExitPoint>();
        paymentMachines = new Stack <PaymentMachine>();
        noOfCars = 0;
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
        floorList.push(new Floor(this, bays, secure));
    }

    public void removeFloor()
    {
        floorList.pop();
    }

    public void addExitPoint()
    {
        exitPoints.push(new ExitPoint());
    }

    public void removeExitPoint()
    {
        exitPoints.pop();
    }

    public void addPaymentMachine()
    {
        paymentMachines.push(new PaymentMachine(this, paymentModel));
    }

    public void bayViolation(SecureBay secureBay)
    {
        secureBay.toString();
    }


}


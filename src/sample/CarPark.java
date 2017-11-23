package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Jordan on 21/11/2017.
 */
public class CarPark
{
    private Stack<Floor> floorList;
    private EntryPoint entryPoint;
    private Stack<ExitPoint> exitPoints;
    private Stack<PaymentMachine> paymentMachines;

    public CarPark(){
        floorList = new Stack<Floor> ();
        exitPoints = new Stack <ExitPoint>();
        paymentMachines = new Stack <PaymentMachine>();
    }

    public int getSpaces(){
        int sum =0;
        for (Floor floor: floorList)
        {
            sum += floor.noOfBays();
        }
        return sum;
    }

    public final Floor getFloor(int floor){
        return (Floor)((List)floorList).get(floor);
    }

    public void addFloor(int bays){
        floorList.push(new Floor(bays));
    }

    public void removeFloor(){
        floorList.pop();
    }

    public void addExitPoint(){
        exitPoints.push(new ExitPoint());
    }

    public void removeExitPoint(){
        exitPoints.pop();
    }

}

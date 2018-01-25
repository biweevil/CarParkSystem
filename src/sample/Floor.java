package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Jordan on 21/11/2017.
 */
public class Floor
{
    private Bay[] bays;
    private String floorLetter;
    private CarPark carPark;
    private boolean secure;

    public Floor(CarPark carPark, int bayN, boolean secure, int floorN)
    {
        this.carPark = carPark;
        floorLetter = toAlphabetic(floorN);
        bays = new Bay[bayN];
        this.secure = secure;
        if (secure)
        {
            for (int i = 0; i < bayN; i++)
            {
                bays[i] = new SecureBay(carPark, this, i + 1);
            }
        } else
        {
            for (int i = 0; i < bayN; i++)
            {
                bays[i] = new Bay(this, i + 1);
            }
        }
    }

    public boolean isFull(){
        boolean full = true;
        for(int i = 0; i < getBays().size(); i++){
            if(!getBays().get(i).isCarPresent())
                full = false;
        }
        return full;
    }

    public int noOfBays()
    {
        return bays.length;
    }

    public String getFloorLetter()
    {
        return floorLetter;
    }

    public void bayViolation(SecureBay secureBay)
    {
        carPark.bayViolation(secureBay, this);
    }

    public int noOfSpaces()
    {
        int sum = 0;
            for (Bay bay : bays)
            {
                if (!bay.isCarPresent())
                sum++;
            }

        return sum;
    }

    public Bay getBay(int bay)
    {
        if(bay < noOfBays() && bay >= 0){
            return bays[bay];
        }
        return bays[0];
    }

    public List<Bay> getBays()
    {
        ArrayList<Bay> bayArrayList = new ArrayList <Bay>();
        for (Bay bay : bays)
        {
            bayArrayList.add(bay);
        }
        return bayArrayList;
    }

    @Override
    public String toString()
    {
        return floorLetter;
    }

    private static String toAlphabetic(int i) {
        if( i<0 ) {
            return "-"+toAlphabetic(-i-1);
        }

        int quot = i/26;
        int rem = i%26;
        char letter = (char)((int)'A' + rem);
        if( quot == 0 ) {
            return ""+letter;
        } else {
            return toAlphabetic(quot-1) + letter;
        }
    }
}

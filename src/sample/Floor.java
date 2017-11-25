package sample;

/**
 * Created by Jordan on 21/11/2017.
 */
public class Floor
{
    private Bay[] bays;
    private String floorLetter;
    private CarPark carPark;

    public Floor(CarPark carPark, int bayN, boolean secure)
    {
        if(secure)
        {
            for (int i = 0; i < bayN; i++)
            {
                bays[i] = new SecureBay(carPark, this, i + 1);
            }
        }
        else
        {
            for (int i = 0; i < bayN; i++)
            {
                bays[i] = new Bay(this, i + 1);
            }
        }
    }


    public int noOfBays(){
        return bays.length;
    }

    public String getFloorLetter(){
        return floorLetter;
    }

    public void bayViolation(SecureBay secureBay){
        carPark.bayViolation(secureBay);
    }



}

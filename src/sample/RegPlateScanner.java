package sample;

/**
 * Created by Jordan on 21/11/2017.
 */
public class RegPlateScanner
{
    private GUIStat input;

    public String scanCar()
    {
        input = GUIStat.getInstance();
        String regPlate;
        if (input.isRegPlateInput())
        {
            //TODO get plate input from GUI
            regPlate = null;
        } else
        {
            regPlate = cameraOutput();
        }
        return regPlate;
    }

    private String cameraOutput()
    {
        return letter() + letter() + number() + number() + " " + letter() + letter() + letter();
    }

    private String letter()
    {
        return Character.toString((char) (65 + Math.random() * 26));
    }

    private int number()
    {
        return (int) Math.random() % 10;
    }
}

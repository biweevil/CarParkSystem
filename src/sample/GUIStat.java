package sample;

/**
 * Created by Jordan on 23/11/2017.
 */
public class GUIStat
{
    private static GUIStat guiStat;

    public static GUIStat getInstance(){
        return guiStat == null ? guiStat = new GUIStat() : guiStat;
    }

    public boolean isRegPlateInput()
    {
        return regPlateInput;
    }

    public void setRegPlateInput(boolean regPlateInput)
    {
        this.regPlateInput = regPlateInput;
    }

    private boolean regPlateInput;
}

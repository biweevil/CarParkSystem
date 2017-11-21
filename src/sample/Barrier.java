package sample;

/**
 * Created by Jordan on 21/11/2017.
 */
public class Barrier
{
    private boolean opened;

    public void openBarrier(){
        opened = true;
    }

    public void closeBarrier(){
        opened = false;
    }

    public boolean isOpen(){
        return opened;
    }
}

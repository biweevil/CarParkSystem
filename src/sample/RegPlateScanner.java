package sample;

/**
 * Created by Jordan on 21/11/2017.
 */
public class RegPlateScanner
{
    public Car scanCar(){
        String regPlate = cameraOutput();
        Car newCar = new Car(regPlate);
        return newCar;
    }

    private String cameraOutput(){
        return  letter()+letter()+
                number()+number()+
                " "+letter()+letter()+
                letter();
    }

    private String letter(){
        return Character.toString((char) (65 + Math.random() * 26));
    }

    private int number(){
        return (int)Math.random()%10;
    }
}

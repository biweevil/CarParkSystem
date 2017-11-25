package sample;

/**
 * Created by Jordan on 23/11/2017.
 */
public class PaymentModel
{
    private PaymentBand defaultBand;

    PaymentModel(double baseFee, int mins){
        defaultBand = PaymentBand.getDefaultPayBand(baseFee, mins);
    }

    public void resetModel(double baseFee, int mins){
        defaultBand = PaymentBand.getDefaultPayBand(baseFee, mins);
    }

    public void addBand(double fee, int mins){
        defaultBand.addBand(fee, mins);
    }

    public void removeBand(){
        defaultBand.removeBand();
    }

    public double calculatePayment(int mins){
        return defaultBand.calculatePayment(mins);
    }

}

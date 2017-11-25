package sample;

/**
 * Created by Jordan on 23/11/2017.
 */
public class PaymentBand
{
    public static PaymentBand getDefaultPayBand(double baseFee, int mins)
    {
        return new PaymentBand(baseFee, mins);
    }

    private int mins;
    private double fee;
    private PaymentBand prevBand;
    private PaymentBand nextBand;

    private PaymentBand(double baseFee, int mins)
    {
        prevBand = null;
        fee = baseFee;
        this.mins = mins;
    }

    private PaymentBand getLastBand(){
        PaymentBand lastBand = this;
        while (lastBand.nextBand != null)
        {
            lastBand = lastBand.nextBand;
        }
        return lastBand;
    }

    public void addBand(double fee, int mins)
    {
        if(fee > 0 && mins > 0)
        {
            PaymentBand lastBand = getLastBand();
            lastBand.nextBand = new PaymentBand(lastBand, mins, fee);
        }
    }

    public void removeBand()
    {
        PaymentBand lastBand = getLastBand();
        lastBand.prevBand.nextBand = lastBand.prevBand;
    }

    public double calculatePayment(int mins){
        PaymentBand current = this;
        int acummlativeMins = 0;
        double fee = 0;
        while(acummlativeMins < mins){
            acummlativeMins += current.mins;
            fee += current.fee;
            current = current.nextBand;
        }
        return fee;
    }

    private PaymentBand(PaymentBand prevBand, int mins, double fee)
    {
        this.prevBand = prevBand;
        this.nextBand = this;
        prevBand.nextBand = this;
        this.fee = fee;
        this.mins = mins;
    }


}

package sample;

/**
 * Created by Jordan on 21/11/2017.
 */
public class PaymentProcessor
{
    private Coin currentCoin;
    private String status;
    private PaymentModel paymentModel;

    public PaymentProcessor(PaymentModel paymentModel)
    {
        this.paymentModel = paymentModel;
    }

    public void start(Coin c)
    {

    }


    public String getStatus()
    {
        return status;
    }
}

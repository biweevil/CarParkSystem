package sample;

/**
 * Created by Jordan on 21/11/2017.
 */
public class PaymentMachine
{
    private CarPark carPark;
    private PaymentProcessor paymentProcessor;
    private Coin heldCoin;
    private String status;

    public PaymentMachine(CarPark carPark, PaymentModel paymentModel)
    {
        this.carPark = carPark;
        status = "Enter Coin";
        paymentProcessor = new PaymentProcessor(paymentModel);
    }

    public boolean insertCoin(Coin coin)
    {
        if (heldCoin != null)
        {
            status = "Coin already inserted";
            return false;
        }
        heldCoin = coin;
        if (heldCoin != null && validateCoin())
        {
            status = "Coin inserted";
            if (!heldCoin.isPaid())
            {
                status = "Coin is already paid";
                return false;
            }
            paymentProcessor.start(heldCoin);
            return true;
        } else
        {
            status = "Not a valid coin";
            return false;
        }
    }

    private boolean validateCoin()
    {
        CoinManager coinManager = carPark.getCoinManager();
        return coinManager.validCoin(heldCoin);
    }

    public Coin collectCoin()
    {
        Coin ejectedCoin = heldCoin;
        heldCoin = null;
        return ejectedCoin;
    }

    public String getStatus()
    {
        return status;
    }
}

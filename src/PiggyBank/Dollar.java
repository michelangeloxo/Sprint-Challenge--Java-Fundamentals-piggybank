package PiggyBank;

public class Dollar extends Coin
{

    public Dollar(int quantity) 
    {
        super("Dollar", 1, quantity);
    }

    public Dollar() 
    {
        super("Dollar", 1, 1);
    }
}

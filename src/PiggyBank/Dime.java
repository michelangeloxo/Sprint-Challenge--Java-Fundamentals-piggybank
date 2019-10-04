package PiggyBank;

public class Dime extends Coin
{

    public Dime(int quantity) 
    {
        super("Dime", 0.1, quantity);
    }

    public Dime() 
    {
        super("Dime", 0.1, 1);
    }
}
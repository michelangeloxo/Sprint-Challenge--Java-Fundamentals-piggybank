package PiggyBank;

public abstract class Coin 
{
    String name;
    double value;
    int amount;

    public Coin(String name, double value, int amount)
     {
        this.name = name;
        this.value = value;
        this.amount = amount;
    }

    // public Coin()
    //  {
    //     quantity = 1;
    // }

    public String getName() 
    {
        return name;
    }

    public double getValue() 
    {
        return value;
    }

    public double getTotal()
     {
        return value * amount;
    }

    public int getAmount() 
    {
        return amount;
    }

    @Override
    public String toString() 
    {
        return amount + " " + name;
    }
}

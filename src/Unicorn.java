public class Unicorn extends MagicalAnimal
{
    int hornSharp;
    //instance variables
    public Unicorn()
    {
        super();
        this.hornSharp = 2;
    }//end of constructor blank
    public Unicorn(String name, String type, int speed, double weight, int hornSharp)
    {
        super(name, type, speed, weight);
        this.hornSharp = hornSharp;
    }//end of constructor full
}

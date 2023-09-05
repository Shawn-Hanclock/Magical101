public class Unicorn extends MagicalAnimal
{
    private int hornSharp;
    private int rainbowRange;
    //instance variables
    public Unicorn()
    {
        super();
        this.weight = 0;
        this.type = "Unicorn";
        this.rainbowRange = 0;
        this.hornSharp = 0;
    }//end of constructor blank
    public Unicorn(String name)
    {
        super(name);
        this.weight = (Math.random() * 200) + 1;
        this.type = "Unicorn";
        this.rainbowRange =  (int)(Math.random() * 50) + 1;
        this.hornSharp = (int)(Math.random() * 5) + 1;
    }//end of constructor full

    @Override
    public String getName()
    {
        return super.getName();
    }//name getter

    @Override
    public String toString() {
        return "(Unicorn)" + super.toString() +
                "\n  horn sharpnss: " + this.hornSharp +
                "\n  rainbw range: " + this.rainbowRange;
    }//end of tostring
}

public class Unicorn extends MagicalAnimal
{
    private int hornSharp;
    //instance variables
    public Unicorn()
    {
        super();
        this.type = "Unicorn";
        this.hornSharp = 2;
    }//end of constructor blank
    public Unicorn(String name)
    {
        super(name);
        this.type = "Unicorn";
        this.hornSharp = 2;
    }//end of constructor full

    @Override
    public String getName()
    {
        return super.getName();
    }//

    @Override
    public String toString() {
        return "Unicorn" + super.toString();
    }//end of tostring
}

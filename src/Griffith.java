public class Griffith extends MagicalAnimal
{
    private int clawLength;
    public Griffith()
    {
        super();
        this.type = "Griffith";
        this.clawLength = 0;
    }//end of empty contructor

    public Griffith(String name)
    {
        super(name);
        this.clawLength = 1;
    }//end of name constructor
}

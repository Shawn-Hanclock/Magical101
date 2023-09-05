public class Griffin extends MagicalAnimal
{
    private int clawLength;
    public Griffin()
    {
        super();
        this.type = "Griffin";
        this.clawLength = 0;
    }//end of empty contructor

    public Griffin(String name)
    {
        super(name);
        this.clawLength = 1;
    }//end of name constructor
}

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
        this.type = "Griffin";
        this.clawLength = 1;
    }//end of name constructor

    @Override
    public String getName()
    {
        return super.getName();
    }//end of get name

    @Override
    public String toString()
    {
        return "Griffin" + super.toString();
    }//end of toString
}

public class Griffin extends MagicalAnimal
{
    private int wingSpan;
    private int clawLength;
    public Griffin()
    {
        super();
        this.weight = 0;
        this.type = "Griffin";
        this.wingSpan = 0;
        this.clawLength = 0;
    }//end of empty contructor

    public Griffin(String name)
    {
        super(name);
        this.weight = (Math.random() * 10000) + 1;
        this.type = "Griffin";
        this.wingSpan = (int)(Math.random() * 20) + 1;
        this.clawLength = (int)(Math.random() * 10) + 1;
    }//end of name constructor

    @Override
    public String getName()
    {
        return super.getName();
    }//end of get name

    @Override
    public String toString()
    {
        return "(Griffin)" + super.toString() +
                "\n  wing span: " + wingSpan +
                "\n  claw length: " + clawLength;
    }//end of toString
}

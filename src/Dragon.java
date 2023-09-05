public class Dragon extends MagicalAnimal
{
    private int wingSpan;
    private int fireTemp;
    public Dragon()
    {
        super();
        this.weight = 0;
        this.type = "Dragon";
        this.wingSpan = 0;
        this.fireTemp = 0;
    }//empty constructor from magical animal

    public Dragon(String name)
    {
        super(name);
        this.weight = (Math.random() * 10000) + 1;
        this.type = "Dragon";
        this.wingSpan = (int)(Math.random() * 20) + 1;
        this.fireTemp = (int)(Math.random() * 111) + 1;
    }//full constructor from Magical animal

    @Override
    public String getName()
    {
        return super.getName();
    }//end of getter for Dragon name

    @Override
    public String toString()
    {
        return "(Dragon)" + super.toString() +
                "\n  fire temp: " + fireTemp +
                "\n  wing span: " + wingSpan;
    }//end of tostring for dragon class
}

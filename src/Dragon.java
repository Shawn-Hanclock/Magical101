public class Dragon extends MagicalAnimal
{
    public Dragon()
    {
        super();
        this.type = "Dragon";
    }//empty constructor from magical animal

    public Dragon(String name)
    {
        super(name);
        this.type = "Dragon";
    }//full constructor from Magical animal

    @Override
    public String getName() {
        return super.getName();
    }//end of getter for Dragon name

    @Override
    public String toString() {
        return "Dragon" + super.toString();
    }//end of tostring for dragon class
}

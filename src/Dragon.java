public class Dragon extends MagicalAnimal
{
    private int fireTemp;
    public Dragon()
    {
        super();
        this.type = "Dragon";
        this.fireTemp = 0;
    }//empty constructor from magical animal

    public Dragon(String name)
    {
        super(name);
        this.fireTemp = 1;
        this.type = "Dragon";
    }//full constructor from Magical animal

//    @Override
//    public String getName() {
//        return super.getName();
//    }//end of getter for Dragon name

    @Override
    public String toString() {
        return "Dragon" + super.toString();
    }//end of tostring for dragon class
}

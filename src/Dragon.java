public class Dragon extends MagicalAnimal
{
    public Dragon(String name, String type, int speed, double weight)
    {
        super(name, type, speed, weight);
    }//constructor from Magical animal

    @Override
    public String getName() {
        return super.getName();
    }//end of getter for Dragon name

    @Override
    public String toString() {
        return "Dragon" + super.toString();
    }//end of tostring for dragon class
}

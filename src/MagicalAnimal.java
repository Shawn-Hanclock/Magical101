import java.util.ArrayList;

public class MagicalAnimal
{
    public String name;
    public String type;
    public double weight;
    public int speed;
    //instance variables

    public MagicalAnimal(String name, int speed, String type)
    {
        this.type = type;
        this.name = name;
        this.speed = speed;
    }//empty constructor

    public MagicalAnimal(String name)
    {
        this.speed = 0;
        this.name = name;
    }//name constructor

    public String getName()
    {
        return this.name;
    }//name for magical animals getter

    public int getSpeed()
    {
        return this.speed;
    }//get speed returns the speed of animal

    public void setSpeed()
    {
        this.speed = 101;
    }//set speed

    public String getType()
    {
        return this.type;
    }

    @Override
    public String toString() {
        return " ~- " +
                 this.name + " -~ Stats; " +
                "\n  type: " + this.type +
                "\n  weight: " + this.weight;
    }//toString displaying stats without type
    public void findPlace(ArrayList<MagicalAnimal> racers, MagicalAnimal e)
    {
        racers.add(e);
    }//end of findplace
}

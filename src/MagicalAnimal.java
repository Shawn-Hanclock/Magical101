public class MagicalAnimal
{
    public String name;
    public String type;
    public int speed;
    public double weight;
    //instance variables

    public MagicalAnimal()
    {
        this.name = "bob";
        this.type = "animal";
        this.speed = 0;
        this.weight = 0;
    }//empty constructor

    public MagicalAnimal(String name)
    {
        this.name = name;
        this.speed = 0;
        this.weight = 0;
    }//full constructor

    public String getName()
    {
        return this.name;
    }//name for magical animals getter

//    public String toType()
//    {
//        return this.type;
//    }

    public int getSpeed()
    {
        return speed;
    }//speed getter

    @Override
    public String toString() {
        return " ~- " +
                 name + " -~ Stats " + '\n' +
                "  type: " + type + '\n' +
                "  speed: " + speed + '\n' +
                "  weight: " + weight;
    }//toString displaying stats without type
}

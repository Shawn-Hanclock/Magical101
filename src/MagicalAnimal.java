public class MagicalAnimal
{
    String name;
    String type;
    int speed;
    double weight;
    //instance variables

    public MagicalAnimal()
    {
        this.name = "";
        this.type = "";
        this.speed = 0;
        this.weight = 0;
    }//empty constructor

    public MagicalAnimal(String name, String type, int speed, double weight)
    {
        this.name = name;
        this.type = type;
        this.speed = speed;
        this.weight = weight;
    }//full constructor

    public String getName()
    {
        return this.name;
    }//name getter

    public int getSpeed()
    {
        return speed;
    }//speed getter

    @Override
    public String toString() {
        return "creature stats ~- " +
                 name + " -~" + '\n' +
                "  type= '" + type + '\n' +
                "  speed= " + speed + '\n' +
                "  weight= " + weight;
    }//toString displaying stats
}

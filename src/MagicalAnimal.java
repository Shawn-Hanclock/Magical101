public class MagicalAnimal
{
    public String name;
    public String type;
    public double weight;
    //instance variables

    public MagicalAnimal()
    {
        this.name = "bob";
        this.type = "animal";
        this.weight = 0;
    }//empty constructor

    public MagicalAnimal(String name)
    {
        this.name = name;
    }//name constructor

    public String getName()
    {
        return this.name;
    }//name for magical animals getter

    public String toType()
    {
        return this.type;
    }//totype returns the type of animal

    @Override
    public String toString() {
        return " ~- " +
                 this.name + " -~ Stats; " +
                "\n  type: " + this.type +
                "\n  weight: " + this.weight;
    }//toString displaying stats without type
}

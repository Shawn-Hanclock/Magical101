public class Dragon extends MagicalAnimal
{
    public Dragon(String name, String type, int speed, double weight)
    {
        super(name, type, speed, weight);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return "Dragon" + super.toString();
    }
}

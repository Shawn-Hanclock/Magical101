public class Griffith extends MagicalAnimal
{
    private int clawLength;
    public Griffith()
    {
        super();
        this.type = "Griffith";
        this.clawLength = 0;
    }

    public Griffith(String name)
    {
        super(name);
        this.clawLength = 1;
    }
}

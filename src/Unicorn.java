import java.util.ArrayList;

public class Unicorn extends MagicalAnimal
{
    private int hornSharp;
    private int rainbowRange;
    //instance variables


    public Unicorn(String name, int speed) {
        super(name, speed);
        this.type = "Unicorn";
    }

    public Unicorn(String name)
    {
        super(name);
        this.weight = (Math.random() * 200) + 1;
        this.type = "Unicorn";
        this.rainbowRange =  (int)(Math.random() * 50) + 1;
        this.hornSharp = (int)(Math.random() * 5) + 1;
    }//end of constructor full

    @Override
    public String toString() {
        return "(Unicorn)" + super.toString() +
                "\n  horn sharpnss: " + this.hornSharp +
                "\n  rainbw range: " + this.rainbowRange;
    }//end of tostring

    @Override
    public void findPlace(ArrayList<MagicalAnimal> racers, MagicalAnimal e)
    {
        this.speed = (int)((hornSharp * rainbowRange/ Math.sqrt(weight)));
        super.findPlace(racers, e);
    }//end of findplacce
}

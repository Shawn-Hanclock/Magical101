import java.util.ArrayList;

public class Griffin extends MagicalAnimal
{
    private int wingSpan;
    private int clawLength;
    public Griffin(String name, int speed, String type)
    {
        super(name, speed, type);
        this.type = "Griffin";
    }//end of empty contructor

    public Griffin(String name)
    {
        super(name);
        this.weight = Math.round((Math.random() * 10000) + 1);
        this.type = "Griffin";
        this.wingSpan = (int)(Math.random() * 20) + 1;
        this.clawLength = (int)(Math.random() * 10) + 1;
    }//end of name constructor

    @Override
    public String toString()
    {
        return "(Griffin)" + super.toString() +
                "\n  wing span: " + wingSpan +
                "\n  claw length: " + clawLength;
    }//end of toString

    @Override
    public void setSpeed()
    {
        super.setSpeed();
        this.speed = this.speed + (int)((wingSpan/Math.sqrt(weight)) * ((clawLength % 2 == 0) ? 30: 2));
    }

    @Override
    public void findPlace(ArrayList<MagicalAnimal> racers, MagicalAnimal e)
    {
        e.setSpeed();
        Griffin creatureG = new Griffin(e.getName(), e.getSpeed(), e.getType());
        System.out.println("This creature's speed" + creatureG.getSpeed());
        if(racers.isEmpty()) {
            System.out.println("added to first");
            super.findPlace(racers, e);
        }
        else
        {
            System.out.println("speed" + creatureG.getSpeed());
            int setSpot = 0;
            for(int i = racers.size(); i >= 1; i--)
            {
                //System.out.println("in for loop");
                if(i == 0)
                {
                    setSpot = 0;
                    //System.out.println("added to first");
                }
                else if(racers.get(i - 1).getSpeed() < creatureG.getSpeed())
                {
                    setSpot = i -1;
                    //System.out.println("added to spot");
                }
                else
                {
                    setSpot = racers.size() - 1;
                    //System.out.println("added to end");
                }
            }
            racers.add(setSpot, creatureG);
        }
    }//end of find place
}
import java.util.ArrayList;

public class Dragon extends MagicalAnimal
{
    private int wingSpan;
    private int fireTemp;
    public Dragon(String name, int speed, String type)
    {
        super(name, speed, type);
        this.type = "Dragon";
    }//other constructor from magical animal

    public Dragon(String name)
    {
        super(name);
        this.weight = (Math.random() * 10000) + 1;
        this.type = "Dragon";
        this.wingSpan = (int)(Math.random() * 20) + 1;
        this.fireTemp = (int)(Math.random() * 111) + 1;
    }//full constructor from Magical animal

    public int getFireTemp()
    {
        return this.fireTemp;
    }//end of get fire temp

    @Override
    public void setSpeed() {
        super.setSpeed();
        this.speed = (int)((wingSpan/Math.sqrt(weight)) * fireTemp/ 3);
    }

    @Override
    public String toString()
    {
        return "(Dragon)" + super.toString() +
                "\n  fire temp: " + fireTemp +
                "\n  wing span: " + wingSpan;
    }//end of tostring for dragon class

    @Override
    public void findPlace(ArrayList<MagicalAnimal> racers, MagicalAnimal e)
    {
        e.setSpeed();
        Dragon creatureD = new Dragon(e.getName(), e.getSpeed(), e.getType());
        //System.out.println("This creature's speed" + creatureD.getSpeed());
        if(racers.isEmpty()) {
            System.out.println("added to first");
            super.findPlace(racers, e);
        }
        else
        {
            System.out.println("speed" + creatureD.getSpeed());
            int setSpot = 0;
            for(int i = racers.size(); i >= 1; i--)
            {
                System.out.println("in for loop");
                if(i == 0)
                {
                    setSpot = 0;
                    System.out.println("added to first");
                }
                else if(racers.get(i - 1).getSpeed() < creatureD.getSpeed())
                {
                    setSpot = i -1;
                    System.out.println("added to spot");
                }
                else
                {
                    setSpot = racers.size() - 1;
                    System.out.println("added to end");
                }
            }
            racers.add(setSpot, creatureD);
        }
    }//end of findPlace
}

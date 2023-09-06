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
        this.weight = Math.round((Math.random() * 1000) + 20);
        this.type = "Dragon";
        this.wingSpan = (int)(Math.random() * 20) + 10;
        this.fireTemp = (int)(Math.random() * 111) + 11;
    }//full constructor from Magical animal

    public int getFireTemp()
    {
        return this.fireTemp;
    }//end of get fire temp

    @Override
    public String toString()
    {
        return "(Dragon)" + super.toString() +
                "\n  fire temp: " + fireTemp +
                "\n  wing span: " + wingSpan;
    }//end of to string for dragon class

    @Override
    public void setSpeed() {
        super.setSpeed();
        this.speed = this.speed + (int)((wingSpan/Math.sqrt(weight)) * fireTemp/ 11);
    }//end of setSpeed


    @Override
    public void findPlace(ArrayList<MagicalAnimal> racers, MagicalAnimal e)
    {
        e.setSpeed();
        Dragon creatureD = new Dragon(e.getName(), e.getSpeed(), e.getType());
        if(racers.isEmpty()) {
            super.findPlace(racers, e);
        }
        else
        {
            int setSpot = 0;
            for(int i = racers.size(); i >= 1; i--)
            {
                if(i == 0)
                {
                    setSpot = 0;
                }
                else if(racers.get(i - 1).getSpeed() < creatureD.getSpeed())
                {
                    setSpot = i -1;
                }
                else
                {
                    setSpot = racers.size() - 1;
                }
            }
            racers.add(setSpot, creatureD);
        }
    }//end of findPlace
}

import java.util.ArrayList;

public class Dragon extends MagicalAnimal
{
    private int wingSpan;
    private int fireTemp;
    public Dragon(String name, int speed)
    {
        super(name, speed);
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
//        e.setSpeed();
//        System.out.println(e.getSpeed());
//        super.findPlace(racers, e);
//        int loopVal = 0;
//        Boolean foundP = false;
//        if(!racers.contains(e)) {
//            while (loopVal < racers.size() && !foundP) {
//                if (racers.get(loopVal).getSpeed() < e.getSpeed()) {
//                    racers.add(racers.get(loopVal));
//                    foundP = true;
//                } else if (racers.get(loopVal).getSpeed() == this.speed) {
//                System.out.println("we are get there yet");
//                    switch (racers.get(loopVal).getType()) {
//                        case ("Dragon"):
//                        case ("Unicorn"):
//                            racers.add(loopVal, e);
//                            foundP = true;
//                            break;
//                        case ("Griffin"):
//                            racers.add(e);
//                            foundP = true;
//                            break;
//                    }
//                }
//                loopVal++;
//            }
//        }
        e.setSpeed();
        Dragon creatureD = new Dragon(e.getName(), e.getSpeed());
        if(racers.isEmpty())
        super.findPlace(racers, e);


    }//end of findPlace
}

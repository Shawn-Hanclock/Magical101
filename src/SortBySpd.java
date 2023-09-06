import java.util.Comparator;

public class SortBySpd implements Comparator<MagicalAnimal>
{
    public int compare(MagicalAnimal a, MagicalAnimal b)
    {
        return b.getSpeed()- a.getSpeed();
    }
}//helper class for main
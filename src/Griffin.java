import java.util.ArrayList;

public class Griffin extends MagicalAnimal
{
    private int wingSpan;
    private int clawLength;
//    public Griffin()
//    {
//        super();
//        this.weight = 0;
//        this.type = "Griffin";
//        this.wingSpan = 0;
//        this.clawLength = 0;
//    }//end of empty contructor

    public Griffin(String name)
    {
        super(name);
        this.weight = (Math.random() * 10000) + 1;
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
    public void findPlace(ArrayList<MagicalAnimal> racers, MagicalAnimal e)
    {
        this.speed = (int)((wingSpan * 20/Math.sqrt(weight)) * clawLength % 2);
        super.findPlace(racers, e);
    }//end of find place
}
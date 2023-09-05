import java.util.ArrayList;
import java.util.Scanner;

public class Karen
{
    private String name;
    private int numRacers;
    //instance variables

    public Karen()
    {//start empty constructor
        this.name = "Karen";
        this.numRacers = 0;
    }//end empty constructor

    public Karen(String name)
    {//start name constructor
        this.name = name;
        this.numRacers = 0;
    }//end name constructor

    public String getName()
    {
        return this.name;
    }//getter for Karen name

    public int getNumRacers()
    {
        return this.numRacers;
    }

    public void setNumRacers(int numRacers)
    {
        this.numRacers = numRacers;
    }//setter for numRacers, the number of animals being raced

    public void createAnimal(String type, ArrayList list)
    {
        String typeCheck = type;
        Scanner input = new Scanner(System.in);
        switch (typeCheck)
        {
            case "d":
                System.out.println("What's the name of the dragon?\nEnter your dragon name (eg. 'toothless'):");
                Dragon creatureD = new Dragon(input.next());
                list.add(creatureD);
                break;
            case "u":
                System.out.println("What's the name of the unicorn?\nEnter your unicorn name (eg. 'rainbows'):");
                Unicorn creatureU = new Unicorn(input.next());
                list.add(creatureU);
                break;
            case "g":
                System.out.println("What's the name of the griffin?\nEnter your griffin name (eg. 'buckbeak'):");
                Griffin creatureG = new Griffin(input.next());
                list.add(creatureG);
                break;
            default:
                System.out.println("Enter from the given options:\n 'd' for dragon\n 'u' for unicorn\n 'g' for griffin");
                typeCheck = input.next();
        }//end of switch block
    }//end of create animal


}

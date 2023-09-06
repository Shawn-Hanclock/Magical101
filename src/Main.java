//import java.util.Scanner;
//import java.util.ArrayList;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello new Karen, \nWhat is your name (eg. 'Duck'): ");
        Scanner input = new Scanner(System.in);
        Karen user = new Karen(input.next());
        //takes in user's name

        System.out.println("Hello " + user.getName() + ",\nWe're located here at Magical McDonald's. \nHow many creatures will you put to race?\nEnter a whole number greater than 1 (eg. '2'):");
        Boolean valid = false;
        do
        {
            //best logic I could think of :/
            if(input.hasNext() && !input.hasNextInt())
            {
                String something = input.next();
                System.out.println("\'" + something +"\' is not a whole number: ");
            }
            if(input.hasNextInt())
            {
                int temp = input.nextInt();
                if(temp > 10)
                {
                    System.out.println("\'" + temp + "\' is far to large for this farm:");
                }
                else if(temp > 1)
                {
                    user.setNumRacers(temp);
                    valid = true;
                } else System.out.println("\'" + temp + "\' is not greater than 1: ");
            }
        } while (!valid);
        //takes the number of racers with validated input

        ArrayList<MagicalAnimal> creatures = new ArrayList<MagicalAnimal>();
        System.out.println("Now lets pick out magical animals.");
        boolean creaturesMade = false;
        while(!creaturesMade)
        {
            if(creatures.size() == 0)
            {
                System.out.println("What should the first creature be?");
            } else System.out.println("What should the next creature be?");
            System.out.println(" 'd' for dragon \n 'u' for unicorn \n 'g' for griffith");
            if(input.hasNext())
                user.createAnimal(input.next(), creatures);
            creaturesMade = creatures.size() == user.getNumRacers();
        }
        //creates arrayList of our magical animals
        printAnimals(creatures);
        //display all the stats

        ArrayList<MagicalAnimal> racers = new ArrayList<MagicalAnimal>();
        System.out.println("Lets let all these creatures race? \n('y' for yes or 'n' for no)");
        Boolean saidAnswer = false;
        while (!saidAnswer) {
            switch (input.next().toLowerCase()) {
                case ("y"):
                    for (MagicalAnimal a : creatures)
                    {
                        switch (a.getType())
                        {
                            case("Dragon"):
                                Dragon d = (Dragon)a;
                                d.findPlace(racers, a);
                                break;
                            case("Unicorn"):
                                Unicorn u = (Unicorn)a;
                                u.findPlace(racers, a);
                                break;
                            case("Griffin"):
                                Griffin g = (Griffin)a;
                                g.findPlace(racers, a);
                                break;
                        }
                    }
                    saidAnswer = true;
                    break;
                case ("n"):
                    System.out.println("They must race.");
                    break;
                default:
                    System.out.println("Only 'y' or 'n'");
                    break;
            }
        }
        printRacers(racers);
     }//end of main method

    private static void printAnimals(ArrayList<MagicalAnimal> c)
    {
        System.out.println("Animals of the farm: \n");
        for (int i = 0; i < c.size(); i++)
        {
            System.out.println("AnimalID: " + i + " \n" + c.get(i).toString() + "\n");
        }//end of for loop
    }//end of print animals

    private static void printRacers(ArrayList<MagicalAnimal> r)
    {
        Collections.sort(r, new SortBySpd());
        int place = 1;
        for (MagicalAnimal a: r)
        {
            System.out.print("\n(" + place + ")" + a.getName() + "-" + a.getSpeed() +"mph ");
            place++;
        }
        //System.out.println(r);
    }
}

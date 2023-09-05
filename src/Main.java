import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello new Karen, \nWhat is your name (eg. 'Duck'): ");
        Scanner input = new Scanner(System.in);
        Karen user = new Karen(input.next());
        //takes in user's name

        System.out.println("Hello " + user.getName() + " we're located here at Magical McDonald's. \nHow many creatures will you put to race?\nEnter a whole number greater than 1 (eg. '2'):");
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
        System.out.println("What should the first creature be?");
        boolean creaturesMade = false;
        while(!creaturesMade)
        {
            if(creatures.size() != 0)
                System.out.println("What should the next creature be?");
            System.out.println(" 'd' for dragon \n 'u' for unicorn \n 'g' for griffith");
            if(input.hasNext())
                user.createAnimal(input.next(), creatures);
            creaturesMade = creatures.size() == user.getNumRacers();
        }
        //creates arrayList of our magical animals
        printAnimals(creatures);
     }//end of main method

    private static void printAnimals(ArrayList<MagicalAnimal> c)
    {
        System.out.println("Animals of the farm: \n");
        for (int i = 0; i < c.size(); i++)
        {
            System.out.println(c.get(i).toString());
        }
    }//end of print animals
}

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
        boolean valid = false;
//        do
//        {
//            if(input.hasNext())
//            {
//
//            }
//        }
        while(!valid)
        {
            if(input.hasNext())
            {
                if(input.nextInt() > 1)
                {
                    user.setNumRacers(input.nextInt());
                    valid = true;
                }
                else
                    System.out.println("Only Enter Greater Than 1:");
            }
            else
                System.out.println("Please Enter Again:");
        }
        //takes the number of racers

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
        System.out.println(creatures.get(0).toString());
     }//end of main method
}

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello new Karen, what is your name: ");
        Karen user = new Karen(input.next());
        //take in user's name
        System.out.println("Hello " + user.getName() + " we're located here at Magical McDonald's, How many creatures will you race?");
        System.out.println("Just two? Or three? Enter '2' or '3': \n");
        takeRacers(input);
        user.setNumRacers(input.nextInt());
        //take in number of racers

//        Dragon bob = new Dragon("bob", "lizard", 9999, 14.272);
//        System.out.println(bob.toString());
    }//end of main method

    private static void takeRacers(Scanner value)
    {
        while(value.hasNextInt())
        {
            if (value.nextInt() != 2 || value.nextInt() != 3)
            {
                System.out.println("Just two? Or three? Enter '2' or '3': \n");
            }
        }//end of while
    }//end of takeRacers
}

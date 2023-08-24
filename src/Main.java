import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello new Karen, what is your name: ");
        Karen user = new Karen(input.next());
        System.out.println("Hello " + user.getName() + " we're located here at Magical McDonald's, How many creatures will you race?");
        System.out.println("Just two? Or three? Enter '2' or '3': \n");
//        if(input.hasNextInt())
//        {
//            while (input.nextInt() != 2 || input.nextInt() != 3)
//            {
//                System.out.println("Just two? Or three? Enter '2' or '3': \n");
//            }
//        }

//        user.setNumRacers(input.nextInt());


        Dragon bob = new Dragon("bob", "lizard", 9999, 14.272);
        System.out.println(bob.toString());
    }//end of main method
}
public class Karen
{
    String name;
    int numRacers;
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
        return name;
    }//getter for Karen name

    public void setNumRacers(int numRacers)
    {
        this.numRacers = numRacers;
    }//setter for numRacers, the number of animals being raced
}

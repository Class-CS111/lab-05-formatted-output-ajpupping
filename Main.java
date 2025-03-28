// STUDENT NAME: Alyssa Pupping
// COLLABORATORS: N/A
// DATE: 3/27/25

// DESCRIPTION: The purpose of this program is to convert dollar amounts into quarters, dimes, nickels, and pennies.

public class Main
{
	public static void main(String[] args)
	{
    //DECLARATION + INITIALIZATION SECTION

    double initialAmount = 1.68;
    int centsRemaining = 0;
    int numQuarters = 0;
    int numDimes = 0;
    int numNickels = 0;
    int numPennies = 0;
  

    //CALCULATION SECTION

    centsRemaining = (int) (100 * initialAmount);

    numQuarters = centsRemaining / 25;
    centsRemaining %= 25;

    numDimes = centsRemaining / 10;
    centsRemaining %= 10;

    numNickels = centsRemaining / 5;
    centsRemaining %= 5;

    numPennies = centsRemaining;
    


    //OUTPUT SECTION
    System.out.println("Dollar Amount: $" + initialAmount);
    System.out.println("Quarters: " + numQuarters);
    System.out.println("Dimes: " + numDimes);
    System.out.println("Nickels: " + numNickels);
    System.out.println("Pennies: " + numPennies);

  }

}

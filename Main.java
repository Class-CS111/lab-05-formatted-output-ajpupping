// STUDENT NAME: Alyssa Pupping
// COLLABORATORS: N/A
// DATE: 3/27/25

// DESCRIPTION: The purpose of this program is to convert dollar amounts into quarters, dimes, nickels, and pennies.

public class Main
{
	public static void main(String[] args)
	{
    //DECLARATION + INITIALIZATION SECTION

    double initialAmount = 3.72;

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
    
    System.out.printf("$%.2f can be converted into %d quarters, %d dimes, %d nickels, and %d pennies.", 
      initialAmount, numQuarters, numDimes, numNickels, numPennies);

  }

}

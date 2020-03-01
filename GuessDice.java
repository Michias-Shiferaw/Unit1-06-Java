//Scan all primitive data types
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


/**
 * This is a dice roll guessing game. It now uses a function to return the value.
 * @author Michias Shiferaw
 * @Version 2.0
 * @since 2020-02-29.
 */

public class GuessDice {
  
  /**
    * This is a dice roll guessing game. It now uses a function to return the value.
    * @author Michias Shiferaw
    * @Version 2.0
    * @since 2020-02-29.
    */
    
  static Scanner user = new Scanner(System.in);
  /**
  * This is a dice roll guessing game. It now uses a function to return the value.
  * @author Michias Shiferaw
  * @Version 2.0
    * @since 2020-02-29.
    */
    
  public static void rolldie(int maxValue) {
    
    
    Random rnd = new Random();
    int randNum = rnd.nextInt(maxValue) + 1;
    //return randNum;
  }
    
  /**
  * This is a dice roll guessing game. It now uses a function to return the value.
  * @author Michias Shiferaw
  * @Version 2.0
  * @since 2020-02-29.
  */

  public static void main(String[] args) throws IOException { 
    
    
    int guess;
    int maxValue;
    int counter;
    int diceNum;

    System.out.println("Input a value for the max value of sides on your dice " 
            + "must be a value bigger than 0.");
    maxValue = user.nextInt();
    
    diceNum = 0;
    
    System.out.println("And the dice lands on the number...?");
    diceNum = rolldie(maxValue);
    
    counter = counter + 1;
    
    while (maxValue > 0) {
      try {
        guess = user.nextInt();

        if (guess == diceNum) {
          System.out.println("Way to go!");
          System.out.println("You guessed it in " + counter + " rolls.");
          break;
        } else {
          System.out.println("Your number of " + guess + " is incorrect.");
          counter = counter + 1;
          System.out.println("Guess again!");
          guess = 0;
        }

      } catch (NumberFormatException nfe) {
        System.err.println("Unforunately you did not meet the " 
                   + "requirements of a value larger than 0!");

        //Close the program as the value inputted is not qualified to continue the program
        System.exit(0);

      }
    }
    System.out.println("Bye Bye");
  }
}
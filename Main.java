import java.util.Scanner;

/**
 * returns whether every digit is positive or negative
 * @author Rose
 */
public class Main {

  //divides the integer and stores the remainder
  public static boolean allDigitsOdd(int integer){

    //declare a variable that will store the remainder value
    int div = 0;

    //create a while loop that will keep dividing the integer to check each of the digits if they are odd or even
    while(integer >= 1){
      div = integer % 2;
      integer = integer/10;

      //write an if statement that returns false if the remainder is 0 which means the digit is even
      if (div == 0){
        return false;
      }
    }
    //if the above if statement is not true for any of the numbers, return true
    return true;

  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create new Scanner for user input
    Scanner input = new Scanner(System.in);

    //ask user for an integer and store it
    System.out.println("Please enter an integer");
    int integer = input.nextInt();
    
    //declare a boolean that is equal to the method and print the boolean result on the screen
    boolean valid = allDigitsOdd(integer);
    System.out.println(valid);
  }
}

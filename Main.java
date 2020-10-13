import java.util.Scanner;

/**
 * returns whether every digit is positive or negative
 * @author Rose
 */
public class Main {

  public static void allDigitsOdd(int integer){

    
    int div = 0;

    while(integer >= 1){
      div = integer % 2;
      integer = integer/10;
      
    }
    
    if (div == 0){
      System.out.println("false");
    }else {
      System.out.println("true");
    }

  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create new Scanner for user input
    Scanner input = new Scanner(System.in);

    System.out.println("enter integer");
    int integer = input.nextInt();
    allDigitsOdd(integer);
    
  }
}

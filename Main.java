import java.util.Scanner;
/**
 * program that calculates sum of range of numbers
 * @author Darian
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  // create a variable to keep track of what number we are on
  int count = 1;
  // the accumulator to add the count into
  int total = 0;

  // ask the user for a positive integer
  System.out.println("Please enter an integer to add up the numbers inbetween");
  int number = input.nextInt();

  while (count <= number){
    // add the numbers as we go into total 
    total = total + count;
    // add 1 to the count to increase it 
    count = count + 1; 
  }
    // print the sum of the range of numbers
    System.out.println("The sum from 1 - " + number + " is " + total);
  }
}

import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter Height (M):");
    double height = in.nextDouble();
    System.out.println("Enter Weight (KG):");
    double weight = in.nextDouble();
    double bmi = weight/Math.pow(height,2);
    System.out.println(bmi);
  }
}

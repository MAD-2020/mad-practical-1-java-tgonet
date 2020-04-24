import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    int i = in.nextInt();
    int t = i;
    for(int j = 0;j<i;j++){
      String line = "";
      for(int z = 0;z < t;z++){
        line += "*";
      }
      t --;
      System.out.println(line);
    
  }
}

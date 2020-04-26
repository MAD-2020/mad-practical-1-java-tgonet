import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    Scanner in = new Scanner(System.in);
    int repeat = in.nextInt();
    ArrayList<Integer> distinctlist = new ArrayList<>();
    ArrayList<Integer> countlist = new ArrayList<>();
    while(repeat != 0){
      int input = in.nextInt();
      repeat --;
      if(distinctlist.contains(input)){
        countlist.set(distinctlist.indexOf(input),countlist.get(distinctlist.indexOf(input))+1);
      } 
      else{
          distinctlist.add(input);
          countlist.add(1);
      }
    }   
    int max = 0;
    for(int i : countlist){
      if(i > max){
        max = i;
      }
    }
    int position = countlist.indexOf(max);
    System.out.println(distinctlist.get(position));
    } 
  }
}

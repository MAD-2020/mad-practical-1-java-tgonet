import java.util.Scanner;

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
    ArrayList<Integer> inputlist = new ArrayList<>();
    ArrayList<Integer> distinctlist = new ArrayList<>();
    ArrayList<Integer> countlist = new ArrayList<>();
    while(repeat != 0){
      int input = in.nextInt();
      inputlist.add(input);
      repeat --;
      if(!distinctlist.contains(input)){
        distinctlist.add(input);
      } 
    }   
    Collections.sort(inputlist);
    for(int i : distinctlist){
      countlist.add(Collections.frequency(inputlist, i));
    }
   int position = countlist.indexOf(Collections.max(countlist));
   System.out.println(distinctlist.get(position));
    } 
  }
}

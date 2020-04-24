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
    //method 1
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

    int number = 0;
    int count = 0;
    int current = inputlist.get(0);
    for(int j = 0;j<inputlist.size();j++){
      if(inputlist.get(j) == current){
        count += 1;
      }
      else if(j == inputlist.size()-1){
        if(inputlist.get(j) == current){
          count += 1;
          countlist.add(count);
        }
        else{
          countlist.add(count);
          countlist.add(1);
        }
      }
      else{
        countlist.add(count);
        count = 1;
        current = inputlist.get(j);
      }
    }
    int largest = 0;
    int position = 0;
    for(int z = 0;z < countlist.size();z++){
      if(countlist.get(z) > largest){
        largest = countlist.get(z);
        position = z;
      }
     
    }
    System.out.println(distinctlist.get(position));
    
    //method 2
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

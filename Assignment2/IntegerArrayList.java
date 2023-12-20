import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class IntegerArrayList {
  public static void main(String[] args) {
    int seed = 0;

    Scanner input = new Scanner(System.in);
    ArrayList<Integer> myIntAL = createIngerArrayList();
    System.out.println("Please enter an integer seed between 1 and 10 inclusively");
    seed = input.nextInt();
    while(seed <= 1 || seed >= 10)
    { 
      System.out.println("Error! Please enter an integer seed between 1 and 10 inclusively");   
      seed = input.nextInt();
    }
    
    Random randy = new Random();
    randy.setSeed(seed); 
    
  }

  public static ArrayList<Integer> createIngerArrayList(){
    ArrayList<Integer> genericIntAL = new ArrayList<Integer>();
    return genericIntAL;
  }

}
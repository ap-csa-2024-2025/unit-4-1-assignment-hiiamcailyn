import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int sum = 0; 

    // int sum = 0;
    // int user1 = 2;
    // int user2 = 12;
    // int user3 = 3;
    // int user6 = 
    int input = 0; 
    while (!(input == -1)) /// code not stopped yet 
    {
      System.out.println("Please print a number");
      input = sc.nextInt();
      sum +=input; 
      System.out.println("You gave" + sum);
    }
  }
}
// if they give me positive numbers add it up, but if they give me -1 print sum
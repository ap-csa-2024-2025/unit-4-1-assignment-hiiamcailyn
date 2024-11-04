import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    while (x>-1)
    {
      System.out.println("Please print a positive number");
      x = sc.nextInt();
    }
  }
}
// if they give me positive numbers add it up, but if they give me -1 print sum
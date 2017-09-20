/*
 * Author: Victoria Haan
 * Created: 9/20/17
 * Ask the user for his/her name. Then say hello to him/her.
 * 
 */
import java.util.Scanner;

public class Ch002
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter your first name ");
    String name = scan.next();
    System.out.println("Hello," + name + "!");
  }
}

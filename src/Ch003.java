/*
 * Author: Victoria Haan
 * Created:
 * Description: Three parts to this problem: 
1) Print the integers 0 through 9 to the console (remember, that’s 10 numbers!).
2) Print a blank line
3) Print the integers 1 through 10 to the console.
*
*/
public class Ch003
{
  public static void main(String[] args)
  {
    for (int i = 0; i < 10; i++)
    {
      System.out.println(i);
    }
    System.out.println();
    for (int i = 1; i <= 10; i++)
    {
      System.out.print(i);
    }
  }
}

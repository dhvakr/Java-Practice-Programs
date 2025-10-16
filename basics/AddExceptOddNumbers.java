/**
 * 
 *  Program to add even numbers alone ^_^
 *
 * @since 2021
 * @version May-13
 * @author DIVAKARAN 
 */

public final class AddExceptOddNumbers
{
    public static void main(String... diva)
    {
        byte i = 1, n = 50, add = 0;

        while (i <= n)
        {
            if (i % 2 == 0)
            {
               add += i;
               System.out.print(" "+i+" ");
            }
            i++; 
        }  
        System.out.print("\nSum of Even numbers = "+ add); 
    }
}

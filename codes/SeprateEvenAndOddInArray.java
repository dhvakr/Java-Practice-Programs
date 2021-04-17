import java.util.Arrays;
/**
 * 
 * Program to find and Separate all Odd and Even numbers in array 
 *        -> Count no of zeros in array
 *
 * @since 2021
 * @version April-4-2021
 * @author DIVAKARAN 
 */

 public class SeprateEvenAndOddInArray
{
    public static void main(String... diva) 
    { 
        int given_Array[] = {3,4,-2,0,24,21,-1,45,0,34,-5,9,0,14,15}, count_zero = 0;
        final byte LENGTH = (byte)given_Array.length;

        System.out.println("\nGiven Arrays Is : "+ Arrays.toString(given_Array));

        System.out.println("\nEven Numbers are : ");
        for (int i = 0; i < LENGTH; i++) 
        {
            if(given_Array[i] == 0)
            {
                continue;
            }
            else
                checkEven(given_Array[i]);
        }

        System.out.println("\nOdd Numbers are : ");
        for (int i = 0; i < LENGTH; i++) 
        {
            if(given_Array[i] == 0)
            {
                continue;
            }
            else
                checkOdd(given_Array[i]);
        }
       
        // To Count Zeros
        for (int i = 0; i < LENGTH; i++) 
        {
            if(given_Array[i] == 0)
            {
                count_zero++;
            }
        }
        System.out.printf("\n\n---> There are %d zeros(0) in Given_Array",count_zero);
        System.out.println("\n");
    }

    private static void checkEven(final int arr) 
    {
        if(arr % 2 == 0)
        {         
            System.out.print(arr + " ");
        }
    }
    private static void checkOdd(final int arr) 
    {
        if(arr % 2 != 0)
        {         
            System.out.print(arr + " ");
        }
    }
}
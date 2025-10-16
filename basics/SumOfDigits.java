import java.util.Scanner;
/**
 * 
 *  Program to find given number is divisible by sum_of_digits
 *     -> Pass givenNumber as Input from user
 * 
 * @since 2021
 * @version May-13
 * @author DIVAKARAN
 */
public final class SumOfDigits 
{
    public static void main(String... diva)
    {
      System.out.print("Enter the value : ");
      calculateAndValidate(new Scanner(System.in).nextInt());  
    } 

    private static void calculateAndValidate(int givenNumber)
    {
      int sumOfDigits = 0; 
      int temp = givenNumber;
      
      while (givenNumber != 0) 
      {
        sumOfDigits += givenNumber % 10;
        givenNumber /= 10;
      }
      System.out.println("Sum of digits : " + sumOfDigits);  

      String isDivisible = (temp % sumOfDigits == 0)?"Its Divisible":"Not Divisible";
      System.out.println(isDivisible);  
    }
}
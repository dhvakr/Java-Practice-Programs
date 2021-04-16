/**
 * NOTE : Year taken default as between 1400 <--> 2050
 * Default as - 18-02-1997
 * 
 * @author DIVAKARAN 
*/

public class DateFormat extends DateValidation
{
    public static void main(String... diva) 
    {
        DateValidation.date = 31;
        DateValidation.month = 2;
        DateValidation.year = 2020;

        if(isdateValid() && ismonthValid() && isyearValid())
        {
            System.out.println("\nGiven Date format "+ DateValidation.date +"-"+ DateValidation.month +"-"+ 
            DateValidation.year +" is valid\n");
        }
        else
        {
            System.out.println("\nGiven Date format "+ DateValidation.date +"-"+ DateValidation.month +"-"+ 
            DateValidation.year +" is not valid\n");
        }
    } 
}
class DateValidation 
{
    public static byte date;
    public static byte month;
    public static short year;

    public static boolean isdateValid() 
    {
        if ((date >= 1) && ((date <= 30) || (date <= 31))) 
        {
            // Force to check leap year if Date Set to 29 in Feb
            if(date == 29 && month == 2)
            {
                isyearValid();
            }
            return true;
        }
       return false;
    }

    public static boolean ismonthValid() 
    {
        // January, March, May, August, October, November has 31 days
        if((month <= 12) && month == 1 || month == 3 || month == 5 || month ==  7 || month ==  8 || month ==  10 || month == 12)
        {
            return date <= 31;
        }
        // April, June, September and November are with 30 days
        else if(month == 4 || month == 6 || month == 9 || month == 11)
        {
            return date <= 30;
        }

        // To check Feburary (02)
        return (month == 2 && date <= 28) ? true : false;
    }  
    
    public static boolean isyearValid() 
    {
        if(year >= 1400 && year <= 2050)
        {
            //Only go to if statement if month is Feburary (02)
            if((month == 2) && ((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
            {
                System.out.println("\n\n\t Its a leap year ^_^ ");
                return true;
            }
            return true;
        }   
        return false;
    } 
}
/**
 * 
 *  Program to add two array (Array Addition)
 *      -> Make 3*3 Matrix 
 *
 * @since 2021
 * @version May-13
 * @author DIVAKARAN 
 */
public final class ArrayAddition 
{
    public static void main(String[] args) 
    {
      int [][]a = { {1,1,1}, {1,1,1}, {1,1,1} };  
      int [][]b = { {2,2,2}, {2,2,2}, {2,2,2} };  
      int [][]c = new int[3][3];

      // Matrix a
      System.out.println("Matrix A");
        for (int[] ints : a) 
        {
          for (int anInt : ints) 
          {
            System.out.print(anInt + "  ");
          }
          System.out.println();
        }

      // Matrix b
      System.out.println("Matrix B");
        for (int[] ints : b) 
        {
          for (int anInt : ints) 
          {
            System.out.print(anInt + "  ");
          }
          System.out.println();
        }

      // Addition of A and B Matrix
      System.out.println("Addition of a and b matrix");
      for (int i = 0; i < c.length; i++) 
      {
        for (int j = 0; j < c[i].length; j++) 
        {
          c[i][j] = a[i][j] + b[i][j];
          System.out.print(c[i][j] + "  ");
        }
        System.out.println();
      }                 
    }
}

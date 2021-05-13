import java.io.*;
/**
 * 
 *  Program to create a file and add some data and read a created file
 *      -> Document named as Sample.doc  
 *
 * @since 2021
 * @version May-13
 * @author DIVAKARAN 
 */
public class CreationOfTextFiles
{
    /**
     * 
     * @param diva
     * @throws IOException
     */
    public static void main(String... diva) throws IOException 
    {
        String sampleData = "Welcome to My Repo\n" + "Hope you are fine";
        System.out.println(sampleData);
        char c[] = sampleData.toCharArray();
        FileWriter fw = new FileWriter("Sample.doc");

        for (int i = 0; i < c.length; i++)
            fw.write(c[i]);
        fw.close();

        FileReader fr = new FileReader("Sample.doc");
        int ch;
        int noOfCharacters = 0, noOfLines = 0, noOfWords = 0;

        while ((ch = fr.read()) != -1) 
        {
            noOfCharacters++;
            if (ch == '\n')
                noOfLines++;
            if ((ch == '\n') || (ch == ' '))
                noOfWords++;
        }
        noOfCharacters =- noOfWords;
        noOfLines++;
        noOfWords++;

        System.out.println(" Number of Characters  :   " + noOfCharacters);
        System.out.println(" Number of Lines       :   " + noOfLines);
        System.out.println(" Number of Words       :   " + noOfWords);
        fr.close();
    }
}

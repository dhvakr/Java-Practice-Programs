import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Program to create a file and copy the contents to anothe file
 */

public final class FileManipulation 
{
    /**
     * 
     * @param diva
     * @throws IOException
     */
    public static final void main(final String... diva) throws IOException
    { 
        // File sourcefile = new File("SourceFile.txt");
        // File DestinationFile = new File("DestinationFile.txt");
        
        // String authenticate = (sourcefile.createNewFile() && DestinationFile.createNewFile())?"File is Created":"File already Exits";
        // System.out.println(authenticate);

        // SourceFile -- Write the data to SourceFile in console
        FileWriter sf = new FileWriter("SourceFile.txt",true);

        System.out.println("\nEnter the data To Store in Source File");
        sf.write(new Scanner(System.in).nextLine());
        System.out.println("\n\tFile is Successfully Saved");
        sf.close();


        // Destination File (Copying data from SourceFile)
        FileWriter df = new FileWriter("DestinationFile.txt");
        FileReader sf1 = new FileReader("SourceFile.txt");
        int copy;

        while((copy = sf1.read()) != -1) 
        {
            df.write(copy);
        }
        df.close();
        sf1.close();
        
        System.out.println("\nSuccessfully Copied data from SourceFile to DestinationFile");
        System.out.println();
    }
    
}
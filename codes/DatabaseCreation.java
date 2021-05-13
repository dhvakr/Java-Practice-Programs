import java.io.*;
import java.util.Properties;
/**
 * 
 * Program to Create a Database that store's Email-Address
 *    -> 
 * 
 * @since 2021
 * @version May-13
 * @author DIVAKARAN
 */
public final class DatabaseCreation
{
    /**
     * 
     * @param args
     * @throws IOException
     */
    public static void main(String... diva) throws IOException
    {
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name,email;
        FileInputStream fin = null;
        boolean changed = false;

        try
        {
            fin = new FileInputStream("emailid.dat");
        }
        catch(final FileNotFoundException notFound)
        {
            System.out.println("File Not Found ^-^");
        }

        try
        {
            if(fin != null)
            {
                ht.load(fin);
                fin.close();
            }
        }
        catch(final IOException error)
        {
            System.out.println("Error Reading File !!");
        }

        System.out.println("\n\t\t\t********* DATABASE MANIPULATION *********");
        System.out.println("\n/> Enter to store details of Name And E-mail-Address Into The File");

        do
        {
            System.out.println("\nEnter New Name : " + "(Enter 'skip' to skip this mode");
            name = br.readLine();

            if(name.equals("skip"))
                continue;
            System.out.printf("Enter The Email Id for \'%s\':\n",name);
            email = br.readLine(); 
            ht.put(name,email);
            changed = true;

            if(true)
            {
                System.out.print("\nWant to Enter one More Details ? (Y/N) : ");
                final String YESORNO = br.readLine();
                
                if(YESORNO.toUpperCase().equals("Y"))
                    continue;
                else
                    name = "skip";
            }
        }while(!name.equals("skip"));

        if(changed)
        {
            FileOutputStream fout = new FileOutputStream("emailid.dat");
            ht.store(fout,"Email address book");
            fout.close();
        }
        System.out.println("\n\n \''''''' Enter Name To Find Their Email Address \'''''''");

        do
        {
            System.out.println("\nEnter The Name Find :" + "('Quit' To End the program)");
            name = br.readLine();

            if(!name.equals("Quit"))
            {
                email = (String)ht.get(name);
                System.out.println("The Email Address For "+ name +" is :-  "+email);
            }

            if(true)
            {
                System.out.print("\nWant to search for one more Name ? (Y/N) : ");
                final String YESORNO = br.readLine();
                
                if(YESORNO.toUpperCase().equals("Y"))
                    continue;
                else
                    name = "Quit";
            }
        }while(!name.equals("Quit"));
        br.close();
    }
}

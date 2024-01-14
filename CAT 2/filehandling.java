import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filehandling
{
    public static void main(String[] args) 
    {
        File file = new File("Sample.txt");
        //create
        try{
            if(file.createNewFile())
            {
                System.out.println("File is successfully created");
            }
            else{
                System.out.println("File already exists!");
            }
        }
        catch(IOException E)
        {
            System.out.println("OOPS! An error occurred.");
        }
        //read
        try {
            Scanner reader=new Scanner(file);
            while(reader.hasNextLine())
            {
                System.out.println(reader.nextLine());
            }
            reader.close();
        } 

        catch (FileNotFoundException e) 
        {
            System.out.println("OOPS! An error occurred."+e);
        }
        //write
        try{
            FileWriter writer=new FileWriter("Sample",true);
            // FileOutputStream writer=new FileOutputStream(file);
            // BufferedWriter bufferedWriter = new BufferedWriter(writer);
            System.out.println("Enter the content to be entered in the file: ");
            Scanner scan=new Scanner(System.in);
            String str=scan.nextLine();
            writer.write(str);
            
        }
        catch(IOException E)
        {
            System.out.println("OOPS! An error occurred."+E);
        }
    }
}


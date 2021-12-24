package file;
import java.io.File;
import java.util.Scanner;

public class Analysis{
    private File file;
    private Scanner reader=null;

    public Analysis(File file){
        this.file=file;
    }
    public int lines(){
        try{
            this.reader = new Scanner(this.file);
            int numberOfLines=0;

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                numberOfLines++;
            }
            reader.close();
            return numberOfLines;
        }
        catch (Exception e){
            System.out.println("We could not read the file, error: " + e.getMessage());
            return 0;
        }
    }
    public int characters(){
        try{
            Scanner reader = new Scanner(this.file);
            int numberOfChars=0;
            while (reader.hasNextLine()){
                String line=reader.nextLine();
                numberOfChars+=line.length();
            }
            reader.close();
            return numberOfChars;
        }
        catch (Exception e){
            System.out.println("We could not read the file, error: " + e.getMessage());
            return 0;
        }
    }
}

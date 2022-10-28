import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Urinals {

    ArrayList<String> inputs = new ArrayList<>();
    public static void main(String[] args) {

    }

    public Boolean openFile(String pathStr){
        try{
            String data;
            File obj = new File(pathStr);
            Scanner sc = new Scanner(obj);
            while(sc.hasNextLine()){
                data = sc.nextLine();
                inputs.add(data);
            }
            sc.close();
            return true;

        } catch (FileNotFoundException e) {
            return false;
        }
    }


    Boolean goodString( String str ) { // checks to see if valid string
        return str != null;
    }

}



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

    public Boolean validInput(String str){ // checks to see if string has 0 & 1 elements only
        boolean chk = true;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='0' && str.charAt(i)!='1'){
                chk = false;
            }
        }
        return chk;
    }
    Boolean goodString( String str ) { // checks to see if valid string
        return str != null;
    }

}



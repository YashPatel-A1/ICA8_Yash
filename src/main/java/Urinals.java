/*
Author: Yash Hiteshkumar Patel
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Urinals {

    ArrayList<String> inputs = new ArrayList<>();
    ArrayList<Integer> cntList = new ArrayList<>();

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
    public Boolean goodString( String str ) { // checks to see if valid string
        return str != null;
    }

    public Boolean appendData(ArrayList<Integer> results) throws IOException {
        File fileObj = new File("rule.txt");
        try {
            if (fileObj.createNewFile()) {
                FileWriter fileWriter = new FileWriter(fileObj);
                BufferedWriter buffWriter = new BufferedWriter(fileWriter);
                for(Integer result : results) {
                    buffWriter.write(result + "");
                    buffWriter.newLine();
                }
                buffWriter.close();
            } else {
                FileWriter writer = new FileWriter(fileObj);
                BufferedWriter addresult = new BufferedWriter(writer);
                for(Integer result : results) {
                    addresult.write(result + "");
                    addresult.newLine();
                }
                addresult.close();
            }
            return true;
        }
        catch (IOException E){
            return false;
        }
    }


    public ArrayList<Integer> cntUrinal(ArrayList<String> strList){
        int cnt;
        for(int i=0;i<strList.size();i++){
            String str = strList.get(i);
            cnt = 0;
            for(int j=0;j<str.length();j++){
                if(j==0){
                    if(str.charAt(0)=='0' && str.charAt(1)=='0'){
                        cnt++;
                    }
                }

            }
            cntList.add(cnt);
        }
        return cntList;

    }


}



/*
Author: Yash Hiteshkumar Patel
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Urinals {

    ArrayList<String> inputs = new ArrayList<>();
    ArrayList<Integer> cntList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Urinals obj = new Urinals();
        String fileLoc = "src/urinal.dat";
        Boolean operateFile = obj.openFile(fileLoc);
        System.out.println("urinal.dat File: "+operateFile+"\nArrayList Initiated" );
        ArrayList<Integer> cntLst = new ArrayList<>();
        cntLst = obj.cntUrinals(obj.inputs);
        System.out.println("Input verification & Output ArrayList calculated");
        Boolean ruleCreated = obj.appendData(cntLst);
        System.out.println("Output file generated at : rule.txt: "+ruleCreated);
    }

    public Boolean openFile(String pathStr){
        try{
            String data;
            File obj = new File(pathStr);
            BufferedReader bfRdr = new BufferedReader(new FileReader(obj));

            while ((data = bfRdr.readLine()) != null) {
                if (data.equals("EOF") || data.equals("-1")) {
                    break;
                }
                inputs.add(data);
                }
            bfRdr.close();
            return true;

        } catch (FileNotFoundException e) {
            return false;
        } catch (IOException e) {
            throw new RuntimeException(e);
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
        int cntr = 0;
        File fileObj = new File("rule"+cntr+".txt");
        try {
            if (fileObj.createNewFile()) {
                FileWriter fileWriter = new FileWriter(fileObj);
                BufferedWriter buffWriter = new BufferedWriter(fileWriter);
                for(Integer result : results) {
                    buffWriter.write(result + "");
                    buffWriter.newLine();
                }
                cntr++;
                buffWriter.close();
            } else {
                cntr++;
                fileObj = new File("rule"+cntr+".txt");
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


    public ArrayList<Integer> cntUrinals(ArrayList<String> inputLst ){
        ArrayList<Integer> cntList = new ArrayList<>();
        for (int i = 0;i<inputLst.size();i++){
            String str = inputLst.get(i);
            int nosUnr=0, n = str.length();

            if(str.charAt(0)=='0' && str.charAt(1)=='0'){
                nosUnr++;
                StringBuffer strBuff = new StringBuffer(str);
                strBuff.setCharAt(0, '1');
                str = String.valueOf(strBuff);
            }

            for(int j=1;j<n-1;j++){
                if(str.charAt(j-1)=='0' && str.charAt(j+1)=='0'  && str.charAt(j)=='0'){
                    nosUnr++;
                    StringBuffer strBuff1 = new StringBuffer(str);
                    strBuff1.setCharAt(i, '1');
                    str = String.valueOf(strBuff1);
                }
            }
            if(str.charAt(n-1)=='0' && str.charAt(n-2)=='0'){
                nosUnr++;
                StringBuffer strBuff2 = new StringBuffer(str);
                strBuff2.setCharAt(n-1, '1');
                str = String.valueOf(strBuff2);
            }
            for(int z=0;z<n-1;z++){
                if(n>1){
                    if(str.charAt(z)=='1' && str.charAt(z+1)=='1'){
                        nosUnr = -1;
                    }
                }
            }
            cntList.add(nosUnr);
        }
        return cntList;
    }


    public boolean emptyFileChk(String pathStr) {
        File fileObj = new File(pathStr);
        return fileObj.length() == 0;
    }
}



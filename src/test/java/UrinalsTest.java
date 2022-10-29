/*
Author: Yash Hiteshkumar Patel
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class UrinalsTest {

    Urinals urinals = new Urinals();
    @AfterEach
    void tearDown() {
    }

    @Test
    void openFile() {
        String pathStr = "src/urinal.dat";
        assertEquals(true,urinals.openFile(pathStr));
        System.out.println("====== Yash Patel == TEST ONE EXECUTED =======");
    }

    @Test
    void goodString() {
        String str = "yash";
        assertEquals(true,urinals.goodString(str));
        System.out.println("====== Yash Patel == TEST TWO EXECUTED =======");
    }

    @Test
    void validInput() {
        String str = "910021";
        assertEquals(false,urinals.validInput(str));
        System.out.println("====== Yash Patel == TEST THREE EXECUTED =======");
    }

    @Test
    void appendData() throws IOException {
        ArrayList<Integer> ipNum = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertEquals(true,urinals.appendData(ipNum));
        System.out.println("====== Yash Patel == TEST FOUR EXECUTED =======");
    }

    @Test
    void cntUrinals() {
        ArrayList<String> ipLst = new ArrayList<>( Arrays.asList("101","0100010","00100101101010"));
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(0, 1, -1));
        assertEquals(numbers,urinals.cntUrinals(ipLst));
        System.out.println("====== Yash Patel == TEST FIVE EXECUTED =======");
    }

    @Test
    void fileDosentExists() {
        String pathStr = "src/urinals.dat";
        assertEquals(false,urinals.openFile(pathStr));
        System.out.println("====== Yash Patel == TEST SIX EXECUTED =======");
    }

    @Test
    void emptyFileChk() {
        String pathStr = "src/urinal.dat";
        assertEquals(false,urinals.emptyFileChk(pathStr));
        System.out.println("====== Yash Patel == TEST SEVEN EXECUTED =======");
    }

    @Test
    void IOException() {
        String pathStr = "src/urinals.dat";
        assertEquals(false,urinals.openFile(pathStr));
        System.out.println("====== Yash Patel == TEST EIGHT EXECUTED =======");
    }

    @Test
    void fileDuplication() throws IOException {
        ArrayList<Integer> ipNum = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertEquals(true,urinals.appendData(ipNum));
        System.out.println("====== Yash Patel == TEST NINE EXECUTED =======");
    }

}
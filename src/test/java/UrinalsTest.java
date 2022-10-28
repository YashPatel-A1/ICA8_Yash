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

}
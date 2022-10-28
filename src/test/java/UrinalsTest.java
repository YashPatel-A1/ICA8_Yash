import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class UrinalsTest {

    Urinals urinals = new Urinals();
    @AfterEach
    void tearDown() {
    }

    @Test
    void openFile() {
        String pathStr = "src/urinal.txt";
        assertEquals(true,urinals.openFile(pathStr));
        System.out.println("====== Yash Patel == TEST ONE EXECUTED =======");
    }

    @Test
    void goodString() {
        String str = "yash";
        assertEquals(true,urinals.goodString(str));
        System.out.println("====== Yash Patel == TEST TWO EXECUTED =======");
    }
}
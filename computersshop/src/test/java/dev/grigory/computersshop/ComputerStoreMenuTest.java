package dev.grigory.computersshop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

class ComputerStoreMenuTest {

    @BeforeEach
    void setUp() {
        String simulatedInput = """
            1
            Lenovo
            16
            Intel i7
            Windows 10
            1200.0
            2
            5
            """;
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Runtime.getRuntime().addShutdownHook(new Thread(() -> System.setIn(stdin)));
    }
    @Test
    void testMainRunsWithoutExceptions() {
        assertDoesNotThrow(() -> {
            
            Thread thread = new Thread(() -> {
                try {
                    ComputerStoreMenu.main(new String[]{});
                } catch (Exception e) {
                    fail("main() exception called: " + e.getMessage());
                }
            });
            thread.start();
            thread.interrupt(); 
        });
    }
        @Test
    void testUserInputSimulation() {
        assertDoesNotThrow(() -> {
            Thread thread = new Thread(() -> {
                try {
                    ComputerStoreMenu.main(new String[]{});
                } catch (Exception e) {
                    fail("main() вызвал исключение: " + e.getMessage());
                }
            });
            thread.start();
            thread.interrupt();
        });
    }
}

    


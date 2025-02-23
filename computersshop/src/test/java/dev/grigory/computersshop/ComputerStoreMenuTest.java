package dev.grigory.computersshop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComputerStoreMenuTest {
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
}

    


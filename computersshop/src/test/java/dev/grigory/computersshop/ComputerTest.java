package dev.grigory.computersshop;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ComputerStoreTest {
    private final ComputerStore store = new ComputerStore("CyberDepot", "Grigory", "987654321");

    @Test
    void testAddAndFindComputer() {
        Computer comp = new Computer("Lenovo", 16, "Intel i7", "Windows 10", 1200.0);
        store.addComputer(comp);
        assertNotNull(store.searchComputerByBrand("Lenovo"));
    }
}
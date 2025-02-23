package dev.grigory.computersshop;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;


class ComputerStoreTest {
    private ComputerStoreList store; 
     @BeforeEach
    void setUp() { 
        store = new ComputerStoreList("CyberDepot", "Grigory", "987654321");
    }

    @Test
    void testAddAndFindComputer() {
        Computer comp = new Computer("Lenovo", 16, "Intel i7", "Windows 10", 1200.0);
        store.addComputer(comp);
        assertNotNull(store.searchComputerByBrand("Lenovo"));
    }
    @Test
    void testDeleteComputer() {
        Computer comp = new Computer("HP", 8, "AMD Ryzen 5", "Windows 11", 900.0);
        store.addComputer(comp);
        assertTrue(store.removeComputerByBrand("HP"));
        assertNull(store.searchComputerByBrand("HP"));
    }
    @Test
    void testListComputers() {
        Computer comp1 = new Computer("Apple", 16, "M1", "macOS", 2000.0);
        Computer comp2 = new Computer("Dell", 32, "Intel i9", "Windows 11", 2500.0);
        store.addComputer(comp1);
        store.addComputer(comp2);
        List<Computer> computers = store.getAllComputers();
        assertEquals(2, computers.size());
    }
}
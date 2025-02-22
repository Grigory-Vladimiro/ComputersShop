package dev.grigory.computersshop;

import java.util.ArrayList;
import java.util.List;
public class ComputerStoreList {
    private String storeName;
    private String owner;
    private String taxId;
    private List<Computer> inventory;

    public ComputerStoreList(String storeName, String owner, String taxId) {
        this.storeName = storeName;
        this.owner = owner;
        this.taxId = taxId;
        this.inventory = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        inventory.add(computer);
    }

    public boolean removeComputerByBrand(String brand) {
        return inventory.removeIf(comp -> comp.getBrand().equalsIgnoreCase(brand));
    }

    public Computer searchComputerByBrand(String brand) {
        return inventory.stream()
                .filter(comp -> comp.getBrand().equalsIgnoreCase(brand))
                .findFirst()
                .orElse(null);
    }

    public List<Computer> getAllComputers() {
        return inventory;
    }
}

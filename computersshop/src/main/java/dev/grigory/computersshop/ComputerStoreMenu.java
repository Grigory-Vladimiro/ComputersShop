package dev.grigory.computersshop;

import java.util.List;
import java.util.Scanner;
public class ComputerStoreMenu {
    public static void main(String[] args) {
        ComputerStoreList store = new ComputerStoreList("CyberDepot", "Grigory", "987654321");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== CyberDepot ===");
            System.out.println("Owner: Grigory");
            System.out.println("Tax ID: 987654321");
            System.out.println("\nComputer Store Menu:");
            System.out.println("1. Add Computer");
            System.out.println("2. List Computers");
            System.out.println("3. Search Computer by Brand");
            System.out.println("4. Delete Computer by Brand");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("Enter Memory (GB): ");
                    int memory = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Processor: ");
                    String processor = scanner.nextLine();
                    System.out.print("Enter OS: ");
                    String os = scanner.nextLine();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();

                    store.addComputer(new Computer(brand, memory, processor, os, price));
                    System.out.println("Computer added successfully!");
                }
                case 2 -> {
                    System.out.println("\n=== CyberDepot ===");
                    System.out.println("Owner: Grigory");
                    System.out.println("Tax ID: 987654321");
                    System.out.println("\nAvailable Computers:");

                    List<Computer> computers = store.getAllComputers();
                    if (computers.isEmpty()) {
                        System.out.println("No computers in store.");
                    } else {
                        computers.forEach(System.out::println);
                    }
                }
                case 3 -> {
                    System.out.print("Enter Brand to Search: ");
                    String brand = scanner.nextLine();
                    Computer computer = store.searchComputerByBrand(brand);
                    System.out.println("\n=== CyberDepot ===");
                    System.out.println("Owner: Grigory");
                    System.out.println("Tax ID: 987654321");
                    System.out.println(computer != null ? computer : "Computer not found.");
                }
                case 4 -> {
                    System.out.print("Enter Brand to Delete: ");
                    String brand = scanner.nextLine();
                    boolean deleted = store.removeComputerByBrand(brand);
                    System.out.println(deleted ? "Deleted successfully!" : "Computer not found.");
                }
                case 5 -> {
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
import java.util.Scanner;

class Item {
    private int itemCode;
    private String itemName;
    private double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class InventoryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Item Code: ");
        int itemCode = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Item Name: ");
        String itemName = scanner.nextLine();

        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();

        Item item = new Item(itemCode, itemName, price);

        System.out.println("\nItem Details:");
        item.displayDetails();

        System.out.print("\nEnter Quantity: ");
        int quantity = scanner.nextInt();

        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total Cost for " + quantity + " units: " + totalCost);
    }
}

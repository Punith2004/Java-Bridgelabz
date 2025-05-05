import java.util.Comparator;

class Item {
    String name;
    int id;
    int quantity;
    double price;
    Item next;

    public Item(String name, int id, int quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

public class InventoryManagementSystem {
    private Item head;


    public void addAtBeginning(String name, int id, int quantity, double price) {
        Item newItem = new Item(name, id, quantity, price);
        newItem.next = head;
        head = newItem;
    }


    public void addAtEnd(String name, int id, int quantity, double price) {
        Item newItem = new Item(name, id, quantity, price);
        if (head == null) {
            head = newItem;
            return;
        }
        Item current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newItem;
    }


    public void addAtPosition(String name, int id, int quantity, double price, int position) {
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            addAtBeginning(name, id, quantity, price);
            return;
        }
        Item newItem = new Item(name, id, quantity, price);
        Item current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position out of range");
            return;
        }
        newItem.next = current.next;
        current.next = newItem;
    }


    public void removeById(int id) {
        if (head == null) return;
        if (head.id == id) {
            head = head.next;
            return;
        }
        Item current = head;
        while (current.next != null && current.next.id != id) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public void updateQuantity(int id, int newQuantity) {
        Item current = head;
        while (current != null) {
            if (current.id == id) {
                current.quantity = newQuantity;
                return;
            }
            current = current.next;
        }
        System.out.println("Item not found");
    }


    public Item search(int id, String name) {
        Item current = head;
        while (current != null) {
            if (current.id == id || current.name.equals(name)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }


    public double calculateTotalValue() {
        double totalValue = 0;
        Item current = head;
        while (current != null) {
            totalValue += current.price * current.quantity;
            current = current.next;
        }
        return totalValue;
    }


    public void sort(boolean byName, boolean ascending) {
        if (head == null || head.next == null) return;
        head = mergeSort(head, byName, ascending);
    }

    private Item mergeSort(Item head, boolean byName, boolean ascending) {
        if (head == null || head.next == null) {
            return head;
        }

        Item middle = getMiddle(head);
        Item nextOfMiddle = middle.next;
        middle.next = null;

        Item left = mergeSort(head, byName, ascending);
        Item right = mergeSort(nextOfMiddle, byName, ascending);

        return merge(left, right, byName, ascending);
    }

    private Item getMiddle(Item head) {
        if (head == null) return head;
        Item slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Item merge(Item a, Item b, boolean byName, boolean ascending) {
        Item result = null;
        if (a == null) return b;
        if (b == null) return a;

        Comparator<Item> comparator = byName ?
                Comparator.comparing(item -> item.name) :
                Comparator.comparingDouble(item -> item.price);

        if (!ascending) {
            comparator = comparator.reversed();
        }

        if (comparator.compare(a, b) <= 0) {
            result = a;
            result.next = merge(a.next, b, byName, ascending);
        } else {
            result = b;
            result.next = merge(a, b.next, byName, ascending);
        }
        return result;
    }


    public void display() {
        Item current = head;
        while (current != null) {
            System.out.println("Name: " + current.name + ", ID: " + current.id +
                    ", Quantity: " + current.quantity + ", Price: " + current.price);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();


        ims.addAtEnd("Apple", 1, 100, 0.5);
        ims.addAtEnd("Banana", 2, 150, 0.3);
        ims.addAtBeginning("Orange", 3, 80, 0.6);
        ims.addAtPosition("Grape", 4, 200, 0.4, 2);

        System.out.println("Initial Inventory:");
        ims.display();

        ims.removeById(2);
        System.out.println("\nAfter removing Banana (ID 2):");
        ims.display();


        ims.updateQuantity(1, 120);
        System.out.println("\nAfter updating Apple quantity:");
        ims.display();


        Item found = ims.search(3, null);
        System.out.println("\nSearching for ID 3:");
        if (found != null) {
            System.out.println("Found: " + found.name);
        } else {
            System.out.println("Not found");
        }


        System.out.println("\nTotal Inventory Value: $" + ims.calculateTotalValue());


        ims.sort(true, true);
        System.out.println("\nSorted by name (ascending):");
        ims.display();

        ims.sort(false, false);
        System.out.println("\nSorted by price (descending):");
        ims.display();
    }
}

class GroceryItemOrder {
    private String name;
    private int quantity;
    private double pricePerUnit;

    public GroceryItemOrder(String name, double pricePerUnit) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = 0;
    }

    public double getCost() {
        return quantity * pricePerUnit;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }
}

class GroceryList {
    private GroceryItemOrder[] items;
    private int size;

    public GroceryList() {
        this.items = new GroceryItemOrder[10];
        this.size = 0;
    }

    public void add(GroceryItemOrder item) {
        if (size < 10) {
            items[size] = item;
            size++;
        } else {
            System.out.println("Grocery list is full. Cannot add more items.");
        }
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < size; i++) {
            totalCost += items[i].getCost();
        }
        return totalCost;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating grocery items
        GroceryItemOrder item1 = new GroceryItemOrder("Cookies", 2.30);
        GroceryItemOrder item2 = new GroceryItemOrder("Milk", 1.50);
        GroceryItemOrder item3 = new GroceryItemOrder("Bread", 1.80);

        // Setting quantities
        item1.setQuantity(4);
        item2.setQuantity(2);
        item3.setQuantity(1);

        // Creating grocery list
        GroceryList groceryList = new GroceryList();

        // Adding items to the list
        groceryList.add(item1);
        groceryList.add(item2);
        groceryList.add(item3);

        // Getting total cost
        double totalCost = groceryList.getTotalCost();

        // Printing total cost
        System.out.println("Total cost of groceries: $" + totalCost);
    }
}

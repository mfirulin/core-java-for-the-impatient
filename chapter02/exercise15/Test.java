import java.util.ArrayList;

class Invoice {

    private static class Item {
        String description;
        int quantity;
        double unitPrice;

        double getPrice() { return quantity * unitPrice; }
    }

    private ArrayList<Item> items = new ArrayList<>();

    private Item findItem(String description) {
        for (Item i : items)
            if (i.description.equals(description))
                return i;
        return null;
    }
  
    public void addItem(String description, int quantity, double unitPrice) {
        Item item = new Item();
        item.description = description;
        item.quantity = quantity;
        item.unitPrice = unitPrice;
        items.add(item);
    }

    public void removeItem(String description) {
        Item item = findItem(description);
        if (item != null)
            items.remove(item);
    }

    public void printItem(String description) {
        Item item = findItem(description);
        if (item != null)
            System.out.println(description + ": quantity=" + item.quantity + 
                " price=" + item.unitPrice);
        else
            System.out.println(description + ": nothing found");
    }
}


public class Test {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.addItem("Solt", 1000, 0.2);
        invoice.addItem("Sugar", 2000, 1.1);
        invoice.printItem("Solt");
        invoice.printItem("Sugar");
        invoice.removeItem("Solt");
        invoice.printItem("Solt");
        invoice.removeItem("Solt"); 
    }
}

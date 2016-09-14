import java.util.Objects;

class Item {
  private String description;
  private double price;
  
  public Item(String description, double price) {
  	this.description = description;
    this.price = price;
  }
  
  public String toString() {
  	return getClass().getName() + "[description=" + description + ",price=" + price + "]";
  }
  
  public boolean equals(Object other) {
  	if (other == this) return true;
    if (other == null) return false;
    if (!(other instanceof Item)) return false;
    Item otherItem = (Item) other;
    return Objects.equals(description, otherItem.description) &&
      price == otherItem.price;
  }
  
  public int hashCode() {
  	return Objects.hash(description, price);
  }
}

class DiscountedItem extends Item {
  private double discount;
  
  public DiscountedItem(String description, double price, double discount) {
  	super(description, price);
    this.discount = discount;
  }
  
  public String toString() {
  	return super.toString() + "[discount=" + discount + "]";
  }
  
  public boolean equals(Object other) {
    if (other instanceof DiscountedItem)
      return super.equals(other) && discount == ((DiscountedItem) other).discount;
    else if (other instanceof Item)
      return super.equals(other);
    else
      return false;
  }
}

public class Ch04Ex06 {
  public static void main(String[] args) {
    Item x = new Item("Solt", 0.3);
    DiscountedItem y = new DiscountedItem("Solt", 0.3, 0.1);
    DiscountedItem z = new DiscountedItem("Solt", 0.3, 0.0);
    
    System.out.println(x.equals(y));
    System.out.println(y.equals(x));
    System.out.println(y.equals(z));
  }
}

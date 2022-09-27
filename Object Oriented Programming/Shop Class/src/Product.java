public class Product {
    
    private final int itemNumber;
    private final String itemName;
    private int price;
    private int quantity;

    public int getItemNumber() {
        return itemNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product(int itemNumber, String itemName, int price, int quantity) {
        this.itemNumber = itemNumber;
        this.itemName = itemName;
       setPrice(price);
       setQuantity(quantity);
    }

    public Product(int itemNumber, String itemName) {
        this.itemNumber = itemNumber;
        this.itemName = itemName;
    }

    public Product(int itemNumber, String itemName, int price) {
        this.itemNumber = itemNumber;
        this.itemName = itemName;
        setPrice(price);
    }

    public Product() {
        itemName=null;
        itemNumber=0;
    }
}

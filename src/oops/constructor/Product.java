package oops.constructor;

public class Product 
{
	  // Attributes
    private String productId;
    private String productName;
    private double price;
    private int quantity;
    
 // Default Constructor
    public Product() 
    {
        this.productId = "Unknown";
        this.productName = "Unnamed Product";
        this.price = 0.0;
        this.quantity = 0;
    }
 // Parameterized Constructor
    public Product(String productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    
 // Parameterized Constructor
    public Product(Product p) 
    {
        this.productId =   p.productId;
        this.productName = p.productName;
        this.price =       p.price;
        this.quantity =    p.quantity;
    }
    
    // Method to display product details
    public void displayProductInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
    }
    
    public static void main(String[] args) 
    {
    	 // Using the default constructor
        Product defaultProduct = new Product();
        
        defaultProduct.displayProductInfo();
        
        System.out.println();
        
     // Using the parameterized constructor
        Product product1 = new Product("P001", "Laptop", 799.99, 10);
        product1.displayProductInfo();
        
        System.out.println();
        
     // Creating another product
        Product product2 = new Product("P002", "Smartphone", 499.99, 20);
        product2.displayProductInfo();
        
        System.out.println();
        
        Product product3 = new Product(product2);
        product3.displayProductInfo();
	}
}

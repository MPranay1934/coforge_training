
public class Product {
    private int productid;
    private String productname;
    private int price;
    private int quantity;
    
	public Product(int productid, String productname, int price, int quantity) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.price = price;
		this.quantity = quantity;
		
	}
    
    public double Total() {
    	return price * quantity;
    }
    
    
	public void display() {
		   System.out.println(" Product ID : " + productid);
		   System.out.println(" Product Name : " + productname);
		   System.out.println(" Price : " + price);
		   System.out.println(" Quantity : " + quantity);
		  
	   }
}

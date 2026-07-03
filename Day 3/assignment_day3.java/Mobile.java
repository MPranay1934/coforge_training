import java.util.Scanner;

public class Mobile {

	
    private String brand;
    private String model;
    private int ram;
    private int price;
    
	public Mobile(String brand, String model, int ram, int price) {
		super();
	
		this.brand = brand;
		this.model = model;
		this.ram = ram;
		this.price = price;
	}

	

	

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the ram
	 */
	public int getRam() {
		return ram;
	}

	/**
	 * @param ram the ram to set
	 */
	public void setRam(int ram) {
		this.ram = ram;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [ brand=" + brand + ", model=" + model + ", ram=" + ram + ", price=" + price + "]";
	}
    
    
}

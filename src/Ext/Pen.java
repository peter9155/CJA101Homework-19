package Ext;

public abstract class Pen {
	private String brand;
	private double price;
	
	public Pen(){
		
	};
	
	public Pen(String brand, double price) {
		this.price = price;
		this.brand = brand;
	};
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	public double getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public abstract void write();
	

}

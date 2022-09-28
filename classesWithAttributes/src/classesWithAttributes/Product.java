package classesWithAttributes;

public class Product {
	
	//CONTSRUCTOR
	public Product(int id, String name, String description, double price,int stockAmount, String renk) {
		System.out.println("Yapici blok calisti.");
		this.id=id;
		this.name=name;
		this.description=description;
		this.price=price;
		this.stockAmount=stockAmount;
		this.renk=renk;
		
	}
	
	public Product() {
		System.out.println("Parametresiz constructor calisti.");
	};//parametresiz constructor
	
 //private sadece tanımlandığı blokta geçerli olmasını sağlar
	//encapsulation
	//attributes or fields
	private int id;
	private String name;
	private String description;
	private double price;
	private String renk;
	private int stockAmount;
	private String kod; // bu kodu kullanıcı yazamamali, readonly olmalı.(id+name)
	 
	//this içinde bulundugum class demek
	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getKod() {
		return this.name.substring(0,1)+this.id;
	}
	
	
	//GETTER AND SETTER
	
	
	
	
	
}

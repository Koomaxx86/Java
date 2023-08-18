package application;

public class Menu {

	private String name;
	private int price;
	private String description;
	
	public Menu() {
		
	}
	
	public Menu(String name, int price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Menu [name=" + name + ", price=" + price + ", description=" + description + "]";
	}
	

}

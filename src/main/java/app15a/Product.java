package app15a;

public class Product {
	private String name;
	private String description;
	private float price;

	public Product() {
		super();
	}

	public Product(String name, String description, float price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + description + " " + price;
	}

}

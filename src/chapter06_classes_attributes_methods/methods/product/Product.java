package chapter06_classes_attributes_methods.methods.product;

public class Product {
	public String name;
	public double price;
	public int quantity;

	// Método que usa atributos
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int amount) {
		quantity += amount;
	}

	public void removeProducts(int amount) {
		quantity -= amount;
	}
}

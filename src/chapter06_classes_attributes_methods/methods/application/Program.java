package chapter06_classes_attributes_methods.methods.application;

import chapter06_classes_attributes_methods.methods.product.Product;

public class Program {

	public static void main(String[] args) {
		Product p = new Product();
		p.name = "Mouse";
		p.price = 80.00;
		p.quantity = 10;

		System.out.println("Total value: " + p.totalValueInStock());

		p.addProducts(5);
		System.out.println("Updated quantity: " + p.quantity);

		p.removeProducts(3);
		System.out.println("Updated quantity: " + p.quantity);

	}

}

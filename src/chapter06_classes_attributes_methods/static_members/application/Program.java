package chapter06_classes_attributes_methods.static_members.application;

import chapter06_classes_attributes_methods.static_members.product.Product;

public class Program {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.name = "Keyboard";
		p1.price = 100.00;

		Product p2 = new Product();
		p2.name = "Headset";
		p2.price = 200.00;

		// Alterando membro estático
		Product.dollarRate = 4.80;

		System.out.println(p1.name + " price in BRL: " + p1.priceInReais());
		System.out.println(p2.name + " price in BRL: " + p2.priceInReais());
	}

}

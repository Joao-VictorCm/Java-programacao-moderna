package chapter06_classes_attributes_methods.attributes.application;

import chapter06_classes_attributes_methods.attributes.stock.Product;

public class Program {

	public static void main(String[] args) {
	    Product p = new Product();

        // Acessando atributos diretamente
        p.name = "Notebook";
        p.price = 3500.00;
        p.quantity = 5;

        System.out.println("Product:");
        System.out.println(p.name);
        System.out.println(p.price);
        System.out.println(p.quantity);

	}

}

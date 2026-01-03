package chapter06_classes_attributes_methods.static_members.product;

public class Product {
    public String name;
    public double price;

    // Membro estático (pertence à classe, não ao objeto)
    public static double dollarRate = 5.00;

    public double priceInReais() {
        return price * dollarRate;
    }
}

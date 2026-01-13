package chapter11_enumeration.application;

import java.util.Date;

import chapter11_enumeration.entites.Order;
import chapter11_enumeration.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order order = new Order(1, new Date(), OrderStatus.DELIVERED);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.PROCESSING;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1+ " | " +os2);
	}

}

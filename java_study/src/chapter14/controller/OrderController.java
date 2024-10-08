package chapter14.controller;

import chapter14.model.OrderModel;
import chapter14.model.OrderView;

public class OrderController {
	private OrderModel model;
	private OrderView view;
	
	public OrderController(OrderModel model, OrderView view) {
		this.model = model;
		this.view = view;
	}
	
	public void processOrder() {
		while(!model.isComplete()) {
			String userChoice = view.getUserChoice();
			switch(userChoice) {
			case "1":
				model.addOrder("Pizza", view.getQuantity());
			case "2":
				model.addOrder("Pasta", view.getQuantity());
			case "3":
				model.addOrder("Coke", view.getQuantity());
			case "4":
				model.addOrder("Ade", view.getQuantity());
				break;
			case "q":
				model.setComplete(true);
				view.displayTotalPrice(model.calculateTotal());
				view.displayOrderComplete();
				break;
			default:
				System.out.println("Invalid Choice, Please try again");
			}
		}
	}
}

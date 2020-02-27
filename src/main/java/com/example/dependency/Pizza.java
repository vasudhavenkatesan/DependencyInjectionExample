package com.example.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pizza {

	@Autowired
	Topping toppings;

//	@Autowired
	Pizza(Topping toppings) {
		toppings.setToppingName("Gems");
		this.toppings = toppings;
//		System.out.println("Constructor - " + this.toppings);
	}

	@Autowired
	public Topping getToppings() {
		System.out.println("Using field injection - " + this.toppings);
		return toppings;
	}

	public void setToppings(Topping toppings) {
		this.toppings = toppings;
	}

}

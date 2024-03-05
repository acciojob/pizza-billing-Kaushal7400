package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
//        Pizza p = new Pizza(true);
//        addExtraCheese();
        addExtraToppings();
    }
}

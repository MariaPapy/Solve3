package org.example;

public class MainPizza {
    public static void main(String[] args) {
        PizzaOrder pizza = new PizzaOrder(PizzaOrder.Size.MEDDIUM, "Орлова 6", true);
        pizza.order();
        pizza.order();
        pizza.cancel();
        pizza.cancel();
    }
}
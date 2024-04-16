package mini_app;

public class Main {
    public static void main(String[] args) {

        //options
        Pizza basePizza = new Pizza(true);

        basePizza.addExtraCheese();
        basePizza.addExtraToppings();
        basePizza.TakingAway(false);

        basePizza.GetBill(); //calculates total bill


    }
}

package mini_app;

public class Pizza {


    boolean veg;
    private int price;

    final int extraCheesePrice = 100;
    final int extraToppingsPrice = 150;
    final int bagPackPrice = 20;
    final int Dining=0;
    int basePizzaPrice;


    //constructor
    public Pizza(boolean veg) {
        this.veg = veg;
        //checking veg or no veg that will decide the price
        if (veg) {
            this.price = 300;   //veg price

            System.out.println("veg Pizza price:");
            System.out.println("₹" + price);
        } else {
            this.price = 400;   //non-veg price

            System.out.println("non-veg Pizza price:");
            System.out.println(price + "₹");
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese() {


        this.price += extraCheesePrice;

        System.out.println("added ₹100 for extra Cheese, price:");
        System.out.println("₹" + price);
    }

    public void addExtraToppings() {


        this.price += extraToppingsPrice;

        System.out.println("added ₹150 for extra Toppings, price:");
        System.out.println("₹" + price);
    }


    public void TakingAway(boolean takeAway) {

        if (takeAway) {
            this.price += bagPackPrice;
            System.out.println("Takeaway Opted Charge:");
            System.out.println("₹" + price);
        } else {
            System.out.println("Dining Opted charge:\n" + "₹" + Dining);

        }
    }

    public void GetBill() {
        String bill = "";

        bill = bill + "Total Bill: " + this.price + "\n";
        System.out.println(bill);
    }
}



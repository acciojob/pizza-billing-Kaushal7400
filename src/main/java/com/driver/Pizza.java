package com.driver;

public class Pizza {

    private int basePrice;
    private Boolean isVeg;
    private int toppingsPrice;
    private int cheesePrice;
    private int carryBagPrice;
//    private int price;



    private boolean isCarryBagAdded;
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isBillGenerated;

    private String bill;
    private int totalAmount;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) {
            basePrice = 300;
//            this.bill = "Base Price Of The Pizza: "+300 +"\n";
        } else {
            basePrice = 400;
//            this.bill = this.bill + "Base Price Of The Pizza: "+400 +"\n";
        }
        this.toppingsPrice = 70;
        this.cheesePrice = 80;
        this.carryBagPrice = 20;

        totalAmount = basePrice;
        bill = "The base of the selected pizza is : "+basePrice+"\n";
    }

    public int getPrice(){

        return this.basePrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false) {
            isCheeseAdded = true;
            totalAmount = totalAmount + cheesePrice;
            bill = bill + "Extra cheese added : " + cheesePrice + "\n";
        }
//        basePrice += 80;
//        this.bill = this.bill + "Extra Cheese Added: "+80 +"\n";
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded) {
            isToppingsAdded = true;
            totalAmount = totalAmount + toppingsPrice;
            bill = bill + "Extra toppings added : " + toppingsPrice + "\n";
        }
//        if(isVeg) {
//            price += 70;
//            this.bill += "Extra Toppings Added: "+70 +"\n";
//        } else {
//            price += 120;
//            this.bill += "Extra Toppings Added: "+120 +"\n";
//        }
    }

    public void addTakeaway(){
        // your code goes here
//        price += 20;
//        this.bill += "Paperbag Added: "+20 +"\n";

        if(!isCarryBagAdded) {
            isCarryBagAdded = true;
            totalAmount = totalAmount + carryBagPrice;
            bill = bill + "Extra carry bag added : " + carryBagPrice + "\n";
        }
    }

    public String getBill(){
        // your code goes here
//        this.bill += "Total Price: " + price;
//        return this.bill;

        if(isBillGenerated==false){
            isBillGenerated = true;
            bill = bill + "Total bill is equals : "+totalAmount + "\n";
        }

//        System.out.println(bill);
        return bill;
    }
}

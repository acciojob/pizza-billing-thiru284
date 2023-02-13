package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int toppings;

    boolean isExtraCheeseAdded;
    boolean isExtraToppingsAdded;
    boolean isBillCreated;
    boolean isTakeAway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
            this.toppings = 70;
        }
        else{
            this.price = 400;
            this.toppings = 120;
        }
        this.isExtraCheeseAdded = false;
        this.isExtraToppingsAdded = false;
        this.isBillCreated = false;
        this.isTakeAway = false;

        this.bill = "Base Price Of The Pizza: "+this.price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded){
            this.price += 80;
            this.isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingsAdded){
            this.price += this.toppings;
            this.isExtraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            this.price += 20;
            this.isTakeAway = true;
        }
    }

    public String getBill(){
        if(!isBillCreated) {
            if (isExtraCheeseAdded) {
                this.bill += "\nExtra Cheese Added: 80";
            }
            if (isExtraToppingsAdded) {
                this.bill += "\nExtra Toppings Added: " + this.toppings;
            }
            if (isTakeAway) {
                this.bill += "\nPaperbag Added: 20";
            }
            this.bill += "\nTotal Price: " + this.price;
            this.isBillCreated = true;
        }
        return this.bill;
    }
}

package com.example.models;

public class FoodModel {

    private String itemName;
    private int itemDescription;
    private String itemPrice;
    private int itemIngredients;
    private int itemCookingTime;
    private int itemNutrition;
    private int itemImage;

    public FoodModel(String itemName, int itemDescription, String itemPrice, int itemIngredients,
                     int itemCookingTime, int itemNutrition, int itemImage) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.itemIngredients = itemIngredients;
        this.itemCookingTime = itemCookingTime;
        this.itemNutrition = itemNutrition;
        this.itemImage = itemImage;
    }

    public int getItemIngredients() {
        return itemIngredients;
    }

    public int getItemCookingTime() {
        return itemCookingTime;
    }

    public int getItemNutrition() {
        return itemNutrition;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemDescription() {
        return itemDescription;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public int getItemImage() {
        return itemImage;
    }

}

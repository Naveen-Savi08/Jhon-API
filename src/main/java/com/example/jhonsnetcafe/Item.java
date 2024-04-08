package com.example.jhonsnetcafe;


import javafx.scene.image.ImageView;

public class Item {
    int itemCode;
    String itemName;
    String itemBrand;
    double itemPrice;
    int itemQuantity;
    String itemCategory;
    String purchasedDate;

    public Item(int itemCode, String itemName, String itemBrand, double itemPrice, int itemQuantity, String itemCategory, String purchasedDate) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemBrand = itemBrand;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
        this.itemCategory = itemCategory;
        this.purchasedDate = purchasedDate;
    }

    @Override
    public String toString() {
        return "Item[" +
                "itemCode=" + itemCode +
                ", itemName='" + itemName + '\'' +
                ", itemBrand='" + itemBrand + '\'' +
                ", itemPrice=" + itemPrice +
                ", itemQuantity=" + itemQuantity +
                ", itemCategory='" + itemCategory + '\'' +
                ", purchasedDate='" + purchasedDate + '\'' +
                ']';
    }


    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemBrand() {
        return itemBrand;
    }

    public void setItemBrand(String itemBrand) {
        this.itemBrand = itemBrand;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public String getPurchasedDate() {
        return purchasedDate;
    }

    public void setPurchasedDate(String purchasedDate) {
        this.purchasedDate = purchasedDate;
    }


}







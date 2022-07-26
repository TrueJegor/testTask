package com.testTasks.MyWareHoust;

public class Product {
    private String vendor;
    private String name;
    private int lastPurchasePrice;
    private int lastSalePrice;

    public Product(String vendor, String name, int lastPurchasePrice, int lastSalePrice) {
        this.vendor = vendor;
        this.name = name;
        this.lastPurchasePrice = lastPurchasePrice;
        this.lastSalePrice = lastSalePrice;
    }

    @Override
    public String toString(){
        return "\nVendor: " + getVendor() + " \n" +
                "Name: " + getName() + " \n" +
                "Last purchase price: " + getLastPurchasePrice() + " \n" +
                "Last pale price: " + getLastSalePrice() + " \n";
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public int getLastPurchasePrice() {
        return lastPurchasePrice;
    }

    public int getLastSalePrice() {
        return lastSalePrice;
    }

    public String getInfo(){
        return "Vendor: " + getVendor() + " \n" +
                "Name: " + getName() + " \n" +
                "Last purchase price: " + getLastPurchasePrice() + " \n" +
                "Last pale price: " + getLastSalePrice() + " \n";
    }
}

package com.testTasks.MyWareHoust;

import java.util.List;

public class Sale {
    private int numberSale;
    private Stock stock;
    private Product product;
    private int sellingPrice;

    public int getSellingPrice() {
        return sellingPrice;
    }

    public Sale(int numberSale, Stock stock, Product product, int sellingPrice) {
        this.numberSale = numberSale;
        this.stock = stock;
        this.product = product;
        this.sellingPrice = sellingPrice;
    }

    public Sale(int numberSale, String stockName, List<Product> productList) {
        this.numberSale = numberSale;
        stockName = stockName;
        productList = productList;
    }

    public int getNumberSale() {
        return numberSale;
    }

    public Stock getStock() {
        return stock;
    }

    public Product getProduct() {
        return product;
    }

    public void saleProduct(Product product, Stock stock){
        stock.removeFromStock(product);
    }
}

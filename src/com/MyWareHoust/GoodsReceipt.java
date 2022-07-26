package com.testTasks.MyWareHoust;

import java.util.List;

public class GoodsReceipt {
    private int numberReceipt;
    private Product product;
    private Stock stock;

    public GoodsReceipt(int numberReceipt, String stockName, List<Product> productList){
        this.numberReceipt = numberReceipt;
        stockName = stockName;
        productList = productList;
    }

    public int getNumberReceipt() {
        return numberReceipt;
    }

    public Product getProduct() {
        return product;
    }

    public Stock getStockж() {
        return stock;
    }
}

package com.mphasis.cui.se;

public class Stock {
    private String stockId;
    private String name;
    private  String quantity;

    public Stock(String stockId, String name, String quantity) {
        this.stockId = stockId;
        this.name = name;
        this.quantity = quantity;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public String getName() {
        return name;
    }

    public String getQuantity() {
        return quantity;
    }
}

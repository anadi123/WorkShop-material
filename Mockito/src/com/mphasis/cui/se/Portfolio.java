package com.mphasis.cui.se;

import java.util.List;

public class Portfolio {

    private StockService service;
    private List<Stock> stocks;

    public StockService getService() {
        return service;
    }

    public void setService(StockService service) {
        this.service = service;
    }

    public List<Stock> getStock() {
        return stocks;
    }

    public void setStock(List<Stock> stocks) {
        this.stocks = stocks;
    }

    public double getMarketValue(){
        double marketvalue=0.0;


        for(Stock stock : stocks){
            marketvalue += StockService.getPrice(stock) * stock.getQuantity();
        }

        return marketvalue;
    }
}

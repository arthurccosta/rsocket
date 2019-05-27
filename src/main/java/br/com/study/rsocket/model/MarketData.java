package br.com.study.rsocket.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PUBLIC;

@Data
@AllArgsConstructor(access = PUBLIC)
@NoArgsConstructor(access = PUBLIC)
public class MarketData {

    private String stock;
    private int currentPrice;

    public static MarketData fromException(Exception e) {
        MarketData marketData = new MarketData();
        marketData.setStock(e.getMessage());
        return marketData;
    }

}
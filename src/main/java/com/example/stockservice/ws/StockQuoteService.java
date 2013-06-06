package com.example.stockservice.ws;

import com.example.stockservice.domain.TradePrice;
import com.example.stockservice.domain.TradePriceRequest;

public interface StockQuoteService {

	public TradePrice getStockPrice(TradePriceRequest request);
}

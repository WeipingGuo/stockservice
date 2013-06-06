package com.example.stockservice.ws.internal;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.stockservice.domain.TradePrice;
import com.example.stockservice.domain.TradePriceRequest;
import com.example.stockservice.ws.StockQuoteService;

@Endpoint
public class StockSerivceEndpoint implements StockQuoteService {
	
	public static final String NAME_SPACE 				= "http://example.com/stockquote.xsd";
	public static final String TRADE_PRICE_REQUEST		= "TradePriceRequest";

	@Override
	@PayloadRoot(namespace=NAME_SPACE, localPart=TRADE_PRICE_REQUEST)
	public @ResponsePayload TradePrice getStockPrice(@RequestPayload TradePriceRequest request) {
		
		TradePrice price = new TradePrice();
		price.setPrice(865.88f);
		
		return price;
	}

}

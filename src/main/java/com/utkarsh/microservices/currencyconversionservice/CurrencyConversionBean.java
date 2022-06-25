package com.utkarsh.microservices.currencyconversionservice;


public class CurrencyConversionBean {
	private Long id;
	private String from; 
	private String to;
	private int conversionMutiple; 
	private int quantity; 
	private int totalCalculatedAmount;
	private int port;
	
	public CurrencyConversionBean(){}

	public CurrencyConversionBean(Long id, String from, String to, int conversionMutiple, int quantity,
			int totalCalculatedAmount, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMutiple = conversionMutiple;
		this.quantity = quantity;
		this.totalCalculatedAmount = totalCalculatedAmount;
		this.port = port;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getConversionMutiple() {
		return conversionMutiple;
	}

	public void setConversionMutiple(int conversionMutiple) {
		this.conversionMutiple = conversionMutiple;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}

	public void setTotalCalculatedAmount(int totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	
	
}

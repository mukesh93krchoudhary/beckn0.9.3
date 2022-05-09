package com.nsdl.beckn.api.model.common;

import lombok.Data;

@Data
public class Intent {
	// private String queryString;
	private Provider provider;
	private Fulfillment fulfillment;
	private Payment payment;
	private Category category;
	private Offer offer;
	private Item item;
	// private String purpose;
	private Tags tags;

}

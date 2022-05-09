package com.nsdl.beckn.api.model.search;

import com.nsdl.beckn.api.model.common.Context;

import lombok.Data;

@Data
public class SearchRequestObject {
	private Context context;
	private Object message;
}

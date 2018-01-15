package com.vieztech.cloudflare.constants;

public enum CloudflareMethod {
	POST("POST"), GET("GET"), DELETE("DELETE");

	final String method;

	private CloudflareMethod(String method) {
		this.method = method;
	}

	public String getMethod() {
		return method;
	}
}

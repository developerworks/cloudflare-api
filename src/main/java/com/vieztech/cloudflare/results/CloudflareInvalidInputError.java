package com.vieztech.cloudflare.results;

public class CloudflareInvalidInputError extends CloudflareError {

	private static final long serialVersionUID = 1L;

	public CloudflareInvalidInputError(String flag, String globalMessage, String message) {
		super(flag, globalMessage, message);
	}
}

package com.vieztech.cloudflare.results;

public class CloudflareUnauthError extends CloudflareError {

	private static final long serialVersionUID = 1L;

	public CloudflareUnauthError(String flag, String globalMessage, String message) {
		super(flag, globalMessage, message);
	}
}

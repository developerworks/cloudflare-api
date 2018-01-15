package com.vieztech.cloudflare.results;

public class CloudflareMaxRequestsError extends CloudflareError {

	private static final long serialVersionUID = 1L;

	public CloudflareMaxRequestsError(String flag, String globalMessage, String message) {
		super(flag, globalMessage, message);
	}

}

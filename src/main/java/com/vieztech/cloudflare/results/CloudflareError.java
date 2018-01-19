package com.vieztech.cloudflare.results;

/**
 * 
 * @author Rohit Rehan
 * <br><b>Vieztech Solutions</b>
 *
 */
public class CloudflareError extends Exception {

	private static final long serialVersionUID = 7996955608422480587L;

	public CloudflareError(String flag, String globalMessage, String message) {
		super("[" + flag + "] : " + globalMessage + " :: " + message);
	}
}

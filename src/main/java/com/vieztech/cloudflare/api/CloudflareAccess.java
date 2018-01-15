package com.vieztech.cloudflare.api;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * 
 * @author Rohit Rehan
 *
 */

public class CloudflareAccess {

  private String             tkn;
  private String             email;
  private HttpClient         client;
  public static final String CF_API_LINK = "https://api.cloudflare.com/client/v4";

  public CloudflareAccess(String mail, String apiKey) {
    this.email = mail;
    this.tkn = apiKey;
    client = new DefaultHttpClient();
  }

  public String getToken() {
    return tkn;
  }

  public String getEmail() {
    return email;
  }

  public HttpClient getClient() {
    return client;
  }
}
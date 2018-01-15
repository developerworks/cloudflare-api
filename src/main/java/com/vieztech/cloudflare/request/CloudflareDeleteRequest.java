package com.vieztech.cloudflare.request;

import java.io.UnsupportedEncodingException;

import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpUriRequest;

import com.vieztech.cloudflare.api.CloudflareAccess;

public class CloudflareDeleteRequest extends CloudflareRequest {

  public CloudflareDeleteRequest(CloudflareAccess api) {
    this(api, "");
  }

  public CloudflareDeleteRequest(CloudflareAccess api, String restUrl) {
    super(api, restUrl);
  }

  @Override
  protected HttpUriRequest getRequest() throws UnsupportedEncodingException {
    return new HttpDelete(requestUrl);
  }

  @Override
  protected void add(String key, Object value) {
    throw new UnsupportedOperationException();
  }

}

package com.vieztech.cloudflare.request;

import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

import com.vieztech.cloudflare.api.CloudflareAccess;

public class CloudflareGetRequest extends CloudflareRequest {

  private List<NameValuePair> params;

  public CloudflareGetRequest(CloudflareAccess api) {
    this(api, "");
  }

  public CloudflareGetRequest(CloudflareAccess api, String restUrl) {
    super(api, restUrl);
    params = new LinkedList<>();
  }

  @Override
  protected void add(String key, Object value) {
    params.add(new BasicNameValuePair(key, value == null ? "" : value.toString()));
  }

  @Override
  protected HttpUriRequest getRequest() throws UnsupportedEncodingException {
    return new HttpGet(requestUrl + URLEncodedUtils.format(params, "utf-8"));
  }
}

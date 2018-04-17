package com.vieztech.cloudflare.request;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;

import com.google.gson.Gson;
import com.vieztech.cloudflare.api.CloudflareAccess;

public class CloudflarePostRequest extends CloudflareRequest {

  private Map<String, Object> params;

  public CloudflarePostRequest(CloudflareAccess api) {
    this(api, "");
  }

  public CloudflarePostRequest(CloudflareAccess api, String restUrl) {
    super(api, restUrl);
    params = new HashMap<>();
  }

  @Override
  public void add(String key, Object value) {
    params.put(key, value);
  }

  @Override
  protected HttpUriRequest getRequest() throws UnsupportedEncodingException {
    HttpPost req = new HttpPost(requestUrl);
    req.setEntity(new StringEntity(new Gson().toJson(params), ContentType.APPLICATION_JSON));
    return req;
  }

}

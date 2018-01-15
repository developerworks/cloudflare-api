package com.vieztech.cloudflare.request;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;

import com.google.gson.Gson;
import com.vieztech.cloudflare.api.CloudflareAccess;

public class CloudflarePatchRequest extends CloudflareRequest {

  private Map<String, Object> params;

  public CloudflarePatchRequest(CloudflareAccess api) {
    this(api, "");
  }

  public CloudflarePatchRequest(CloudflareAccess api, String restUrl) {
    super(api, restUrl);
    params = new HashMap<>();
  }

  @Override
  protected void add(String key, Object value) {
    params.put(key, value);
  }

  @Override
  protected HttpUriRequest getRequest() throws UnsupportedEncodingException {
    HttpPatch req = new HttpPatch(requestUrl);
    req.setEntity(new StringEntity(new Gson().toJson(params), ContentType.APPLICATION_JSON));
    return req;
  }

}

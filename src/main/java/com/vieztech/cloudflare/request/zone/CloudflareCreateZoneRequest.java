package com.vieztech.cloudflare.request.zone;

import com.vieztech.cloudflare.api.CloudflareAccess;
import com.vieztech.cloudflare.request.CloudflarePostRequest;
import com.vieztech.cloudflare.results.CloudflareResult;

import net.sf.json.JSONObject;

public class CloudflareCreateZoneRequest extends CloudflarePostRequest {
  public CloudflareCreateZoneRequest(CloudflareAccess api, String name, boolean jumpStart) {
    super(api, "/zones");
    add("name", name);
    add("jump_start", jumpStart);
  }
  public String getZoneId(Object result) {
    JSONObject res = (JSONObject) result;
    return res.getString("id");
  }
}

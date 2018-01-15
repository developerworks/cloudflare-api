package com.vieztech.cloudflare.request.zone;

import com.vieztech.cloudflare.api.CloudflareAccess;
import com.vieztech.cloudflare.request.CloudflareGetRequest;

public class CloudflareGetZoneRequest extends CloudflareGetRequest {
  public CloudflareGetZoneRequest(CloudflareAccess api, String zoneId) {
    super(api, String.format("/zones/%s", zoneId));
  }
}

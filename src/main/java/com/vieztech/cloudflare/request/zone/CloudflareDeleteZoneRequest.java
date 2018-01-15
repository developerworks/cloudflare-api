package com.vieztech.cloudflare.request.zone;

import com.vieztech.cloudflare.api.CloudflareAccess;
import com.vieztech.cloudflare.request.CloudflareDeleteRequest;

public class CloudflareDeleteZoneRequest extends CloudflareDeleteRequest {
  public CloudflareDeleteZoneRequest(CloudflareAccess api, String zoneId) {
    super(api, String.format("/zones/%s", zoneId));
  }
}

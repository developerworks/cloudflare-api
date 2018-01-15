package com.vieztech.cloudflare.request.zone;

import com.vieztech.cloudflare.api.CloudflareAccess;
import com.vieztech.cloudflare.request.CloudflarePatchRequest;

public class CloudflareEditZoneRequest extends CloudflarePatchRequest {
  public CloudflareEditZoneRequest(CloudflareAccess api, String zoneId) {
    super(api, String.format("/zones/%s", zoneId));
  }
}

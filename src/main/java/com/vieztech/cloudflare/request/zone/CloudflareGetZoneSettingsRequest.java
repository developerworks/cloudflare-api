package com.vieztech.cloudflare.request.zone;

import com.vieztech.cloudflare.api.CloudflareAccess;
import com.vieztech.cloudflare.request.CloudflareGetRequest;

public class CloudflareGetZoneSettingsRequest extends CloudflareGetRequest {
  public CloudflareGetZoneSettingsRequest(CloudflareAccess api, String zoneId) {
    super(api, String.format("/zones/%s/settings", zoneId));
  }
}

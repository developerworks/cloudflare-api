package com.vieztech.cloudflare.request.zone;

import com.vieztech.cloudflare.api.CloudflareAccess;
import com.vieztech.cloudflare.request.CloudflareGetRequest;

/**
 * 
 * @author Rohit Rehan
 *
 */
public class CloudflareGetZoneAlwaysUseHttpsSettingsRequest extends CloudflareGetRequest {
  public CloudflareGetZoneAlwaysUseHttpsSettingsRequest(CloudflareAccess api, String zoneId) {
    super(api, String.format("/zones/%s/settings/always_use_https", zoneId));
  }
}

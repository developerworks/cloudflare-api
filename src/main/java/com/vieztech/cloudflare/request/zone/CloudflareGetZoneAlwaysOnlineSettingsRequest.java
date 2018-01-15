package com.vieztech.cloudflare.request.zone;

import com.vieztech.cloudflare.api.CloudflareAccess;
import com.vieztech.cloudflare.request.CloudflareGetRequest;

/**
 * 
 * @author Rohit Rehan
 *
 */
public class CloudflareGetZoneAlwaysOnlineSettingsRequest extends CloudflareGetRequest {
  public CloudflareGetZoneAlwaysOnlineSettingsRequest(CloudflareAccess api, String zoneId) {
    super(api, String.format("/zones/%s/settings/always_online", zoneId));
  }
}

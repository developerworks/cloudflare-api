package com.vieztech.cloudflare.request.zone;

import com.vieztech.cloudflare.api.CloudflareAccess;
import com.vieztech.cloudflare.request.CloudflareGetRequest;

/**
 * 
 * @author Rohit Rehan
 * 
 */
public class CloudflareGetZoneAdvancedSettingsRequest extends CloudflareGetRequest {
  public CloudflareGetZoneAdvancedSettingsRequest(CloudflareAccess api, String zoneId) {
    super(api, String.format("/zones/%s/settings/advanced_ddos", zoneId));
  }
}

package com.vieztech.cloudflare.request.zone;

import com.vieztech.cloudflare.api.CloudflareAccess;
import com.vieztech.cloudflare.request.CloudflareGetRequest;

/**
 * 
 * @author Rohit Rehan
 *
 */
public class CloudflareGetZoneAutomaticHttpsSettingsRequest extends CloudflareGetRequest {
  public CloudflareGetZoneAutomaticHttpsSettingsRequest(CloudflareAccess api, String zoneId) {
    super(api, String.format("/zones/%s/settings/automatic_https_rewrites", zoneId));
  }
}

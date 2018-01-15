package com.vieztech.cloudflare.request.zone;

import com.vieztech.cloudflare.api.CloudflareAccess;
import com.vieztech.cloudflare.request.CloudflareGetRequest;

public class CloudflareGetZonesRequest extends CloudflareGetRequest {
	public CloudflareGetZonesRequest(CloudflareAccess api) {
		super(api, "/zones");
	}
}

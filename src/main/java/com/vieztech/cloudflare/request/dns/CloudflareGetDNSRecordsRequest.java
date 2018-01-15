package com.vieztech.cloudflare.request.dns;

import com.vieztech.cloudflare.api.CloudflareAccess;
import com.vieztech.cloudflare.request.CloudflareGetRequest;

public class CloudflareGetDNSRecordsRequest extends CloudflareGetRequest {
	public CloudflareGetDNSRecordsRequest(CloudflareAccess api, String zoneId) {
		super(api, String.format("/zones/%s/dns_records", zoneId));
	}
}

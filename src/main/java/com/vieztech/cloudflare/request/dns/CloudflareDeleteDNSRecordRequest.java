package com.vieztech.cloudflare.request.dns;

import com.vieztech.cloudflare.api.CloudflareAccess;
import com.vieztech.cloudflare.request.CloudflareDeleteRequest;

public class CloudflareDeleteDNSRecordRequest extends CloudflareDeleteRequest {
	public CloudflareDeleteDNSRecordRequest(CloudflareAccess api, String zoneId, String recId) {
		super(api, String.format("/zones/%s/dns_records/%s", zoneId, recId));
	}
}
